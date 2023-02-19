package com.adcorreajr.springSecurityMongoDB.repositories;

import com.adcorreajr.springSecurityMongoDB.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}