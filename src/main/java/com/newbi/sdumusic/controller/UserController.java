package com.newbi.sdumusic.controller;

import com.alibaba.fastjson.JSONObject;
import com.newbi.sdumusic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/api/login")
    public String login(@RequestBody JSONObject jsonObject) {
        System.out.println(jsonObject);
        String userAccount = jsonObject.getString("userAccount");
        String userPwd = jsonObject.getString("userPwd");
        return userService.getUserById(userAccount, userPwd);
    }
}
