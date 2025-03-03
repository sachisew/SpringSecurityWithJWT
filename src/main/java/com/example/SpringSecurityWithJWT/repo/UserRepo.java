package com.example.SpringSecurityWithJWT.repo;

import com.example.SpringSecurityWithJWT.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<Users, Integer> {
    Users findByUsername(String username);
}
