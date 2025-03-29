package com.myproj.posthub_backend.services;

import com.myproj.posthub_backend.dto.UserDTO;
import com.myproj.posthub_backend.models.User;
import com.myproj.posthub_backend.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void saveUser(UserDTO userDTO){
        User user = new User(userDTO);
        userRepository.save(user);
    }
}
