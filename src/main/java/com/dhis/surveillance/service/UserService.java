package com.dhis.surveillance.service;

import com.dhis.surveillance.dao.UserMapper;
import com.dhis.surveillance.vo.User;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("UserService")
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private JWTservice jwTservice;

    public User findUserById(String userId){
        return userMapper.findUserById(userId);
    }
    public User findUserByName(String userName){
        return userMapper.findUserByName(userName);
    }
    public User findUserByEmail(String email){
        return userMapper.findUserByName(email);
    }
    public String register(User user){
        if(userMapper.findUserByName(user.getUsername())!=null){
            Map detailMap = new HashMap();
            detailMap.put("message","user name already exist");
            String jsonResult = new Gson().toJson(detailMap);
            return jsonResult;
        }else if(userMapper.findUserByEmail(user.getEmail())!=null){
            Map detailMap = new HashMap();
            detailMap.put("message","this email has registered");
            String jsonResult = new Gson().toJson(detailMap);
            return jsonResult;
        }else{
            userMapper.register(user);
            Map detailMap = new HashMap();
            detailMap.put("message","registered");
            String jsonResult = new Gson().toJson(detailMap);
            return jsonResult;
        }

    }
    public String login(String userName,String password){
        User user4verify = userMapper.findUserByName(userName);
        if(user4verify==null){
            Map detailMap = new HashMap();
            detailMap.put("message","Login fail, user not exist");
            String jsonResult = new Gson().toJson(detailMap);
            return jsonResult;
        }else{
            if(!user4verify.getPassword().equals(password)){
                Map detailMap = new HashMap();
                detailMap.put("message","Login fail, wrong password");
                String jsonResult = new Gson().toJson(detailMap);
                return jsonResult;
            }else{
                String token = jwTservice.getToken(user4verify);
                Map detailMap = new HashMap();
                detailMap.put("token",token);
                detailMap.put("user",user4verify);
                detailMap.put("message","login success");
                String jsonResult = new Gson().toJson(detailMap);
                return jsonResult;
            }
        }
    }
}
