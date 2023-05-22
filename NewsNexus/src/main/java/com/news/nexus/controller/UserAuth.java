package com.news.nexus.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.news.nexus.model.User;
import com.news.nexus.payload.request.SignupRequest;
import com.news.nexus.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
public class UserAuth {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignupRequest signUpRequest) {
      
  
      if (userRepository.existsByEmail(signUpRequest.getEmail())) {
        return ResponseEntity
            .badRequest()
            .body("Error: Email is already in use!");
      }
  
      // Create new user's account
      
      User user = new User();
      user.setEmail(signUpRequest.getEmail());
      user.setPassword(signUpRequest.getPassword());
      user.setRole(signUpRequest.getRole());
  
     
      userRepository.save(user);
  
      return ResponseEntity.ok(("User registered successfully!"));
    }
  
    
}
