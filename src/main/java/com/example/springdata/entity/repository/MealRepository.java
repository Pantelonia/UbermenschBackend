package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.Dish;
import com.example.springdata.entity.enums.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MealRepository  extends CrudRepository<Meal, Long>{
}
