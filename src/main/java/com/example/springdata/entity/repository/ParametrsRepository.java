package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.Parametrs;
import com.example.springdata.entity.enums.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParametrsRepository extends JpaRepository< Parametrs, Long> {
    List<Parametrs> findByUsersOrderByIdDesc(Users user);
}


