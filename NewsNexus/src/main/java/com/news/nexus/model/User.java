package com.news.nexus.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document(collection = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    

    private String email;
    private String password;
    private String role;
    @Id
    private ObjectId id;
    
}
