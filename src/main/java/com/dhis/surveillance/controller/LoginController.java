package com.dhis.surveillance.controller;

import com.dhis.surveillance.service.JWTservice;
import com.dhis.surveillance.service.UserService;
import com.dhis.surveillance.vo.User;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam(name = "userName") String userName,
                        @RequestParam(name = "password") String password){
        return userService.login(userName,password);
    }

    @RequestMapping("/loginOut")
    @ResponseBody
    public String loginOut(@RequestParam(name = "userName") String userName){
        return userService.loginOut(userName);
    }
}
