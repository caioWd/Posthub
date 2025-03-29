package com.myproj.posthub_backend.controllers;

import com.myproj.posthub_backend.dto.UserDTO;
import com.myproj.posthub_backend.services.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    @Transactional
    public void createUser(@RequestBody UserDTO userDTO){
        userService.saveUser(userDTO);
    }

}
