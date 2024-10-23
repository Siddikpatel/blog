package com.blog.user.controller;

import com.blog.user.entity.User;
import com.blog.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userService.createUser(user);
        return user.getUsername() + " saved!";
    }

//    @GetMapping("/generate-graph")
//    public String generateGraph() {
//        userService.generateClassDependencyGraph();
//        return "Class dependency graph generated!";
//    }
}
