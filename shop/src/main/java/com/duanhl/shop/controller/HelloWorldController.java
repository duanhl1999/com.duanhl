package com.duanhl.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duanhl.shop.domain.User;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    
    @RequestMapping("/getUser")
    public User getUser(){
    	User user = new User();
    	user.setUserName("duanhl");
    	user.setPassword(123456);
    	return user;
    }
}
