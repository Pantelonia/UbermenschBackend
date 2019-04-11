package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.Parametrs;
import com.example.springdata.entity.enums.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParametrsRepository extends CrudRepository<Parametrs, Long> {
    List<Parametrs> findByUsersOrderByIdDesc(Users user);
}


