package com.myproj.posthub_backend.controllers;

import com.myproj.posthub_backend.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public UserDTO addUser(@RequestBody UserDTO userDTO){
        return userDTO;
    }

}
