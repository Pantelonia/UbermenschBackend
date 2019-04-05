package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByLogin(String login);


}



