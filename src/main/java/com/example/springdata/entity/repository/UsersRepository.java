package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
    Users findByLogin(String login);
    Users findByEmail(String email);

}



