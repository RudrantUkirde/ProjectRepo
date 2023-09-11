package com.example.controller;


import com.example.dto.UserDTO;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/user-service")
public class UserController {

    private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<Long> createUser(@RequestBody UserDTO userDTO) throws ExecutionException, InterruptedException{

        LOGGER.info("Creating User : {}",userDTO);
        Long userId= userService.createUser(userDTO);
        return ResponseEntity.ok(userId);
    }
}
