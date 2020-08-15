package com.dhis.surveillance.controller;

import com.dhis.surveillance.annotation.PassToken;
import com.dhis.surveillance.service.UserService;
import com.dhis.surveillance.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RegisterController {
    @Autowired
    UserService userService;
    @PassToken
    @RequestMapping("/register")
    @ResponseBody
    public String  register(@RequestBody User user){
        return userService.register(user);
    }
}
