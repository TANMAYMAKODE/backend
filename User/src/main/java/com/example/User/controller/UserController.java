package com.example.User.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {


    public String getUser() {
        return "Hello User";
    }
}
