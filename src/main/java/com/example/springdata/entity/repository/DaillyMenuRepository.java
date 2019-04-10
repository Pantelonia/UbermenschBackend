package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.DaillyMenu;
import com.example.springdata.entity.enums.Dish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface DaillyMenuRepository extends CrudRepository<DaillyMenu, Long> {


}



