package com.news.nexus.repository;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.cdi.MongoRepositoryBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.news.nexus.model.User;

@Repository
public interface UserRepository extends MongoRepository <User, ObjectId> {
    Boolean existsByEmail(String email);
    

   

    
}
