package com.myproj.posthub_backend.dto;

import lombok.*;

@Getter
@Setter
public class UserDTO{
    private String name;
    private String username;
    private String email;
    private String password;
    private String image;
    private String registerDate;
}
