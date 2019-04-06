package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
    Users findByLogin(String login);

}



