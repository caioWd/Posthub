package com.myproj.posthub_backend.models;

import com.myproj.posthub_backend.dto.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;
    private String email;
    private String password;
    private String image;
    private String registerDate;

    public User(UserDTO userDTO){
        this.name = userDTO.getName();
        this.username = userDTO.getUsername();
        this.email = userDTO.getEmail();
        this.password = userDTO.getPassword();
        this.image = userDTO.getImage();
        this.registerDate = userDTO.getRegisterDate();
    }
}
