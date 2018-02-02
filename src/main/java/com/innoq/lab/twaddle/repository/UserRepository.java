package com.innoq.lab.twaddle.repository;

import com.innoq.lab.twaddle.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

}