package com.jwt.repository;
import org.springframework.data.repository.CrudRepository;

import com.jwt.model.UserDao;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}