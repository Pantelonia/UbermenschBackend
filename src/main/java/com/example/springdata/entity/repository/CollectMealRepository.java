package com.example.springdata.entity.repository;

import com.example.springdata.entity.enums.CollectMeal;
import com.example.springdata.entity.enums.Dish;
import com.example.springdata.entity.enums.Meal;
import org.springframework.data.repository.CrudRepository;

public interface CollectMealRepository extends CrudRepository<CollectMeal, Long> {
    Iterable<CollectMeal> findAllByMeal(Meal meal);
    CollectMeal findByMealAndDish(Meal meal, Dish dish);
}
