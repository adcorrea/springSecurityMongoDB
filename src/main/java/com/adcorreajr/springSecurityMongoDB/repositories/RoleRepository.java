package com.adcorreajr.springSecurityMongoDB.repositories;

import com.adcorreajr.springSecurityMongoDB.domain.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByRole(String role);
}
