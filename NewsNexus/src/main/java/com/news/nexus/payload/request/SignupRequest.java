package com.news.nexus.payload.request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
public class SignupRequest {
    
    private String email;
    private String password;
    private String role;


    
}
