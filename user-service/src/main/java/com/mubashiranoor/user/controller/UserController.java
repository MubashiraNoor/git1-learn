package com.mubashiranoor.user.controller;

import com.mubashiranoor.user.entity.User;
import com.mubashiranoor.user.service.UserService;
import com.mubashiranoor.user.vo.Department;
import com.mubashiranoor.user.vo.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/users")
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getUserWithDepartment(@PathVariable Long id){
        return userService.getUserWithDepartment(id);
       }
}
