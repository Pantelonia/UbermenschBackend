package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.Dish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DishRepository  extends CrudRepository<Dish, Long> {
    Dish findByName(String name);


}
