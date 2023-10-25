package com.example.Controller;

import com.example.Entity.User;
import com.example.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    Service service;

    @PostMapping("user")
    public String addUser(@RequestBody User user){
        return service.addUser(user);
    }

    @GetMapping("user/userId/{userId}")
    public User getUserById(@PathVariable Integer userId){
        return service.getUserById(userId);
    }
    @GetMapping("users")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @PutMapping("user")
    public String updateUserInfo(@RequestBody User user){
        return service.updateUserInfo(user);
    }

    @DeleteMapping("user/{userId}")
    public String deleteUser(@PathVariable Integer userId){
        return service.deleteUser(userId);
    }
}