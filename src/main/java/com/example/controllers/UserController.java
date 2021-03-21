package com.example.controllers;

import com.example.Entity.User;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userservice; //injecting userservice

   /* @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userservice.getAllUsers();
    }*/
    public UserController(UserService us){
        this.userservice = us;
    }
    @GetMapping("/status")
    String hello(){
        return "HEllo, World!";
    }
    @PostMapping("/register")
    User register(@RequestBody User newUser){

        return userservice.register(newUser);

    }






}
