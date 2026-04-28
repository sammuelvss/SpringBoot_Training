package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    UserService userService;
    @GetMapping("/allUsers")
    public List<UserModel> getAllUsers() {
        return userService.getAll();
    }


    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    


}
