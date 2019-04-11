package com.example.springdata.controllers;

import com.example.springdata.entity.enums.CollectMeal;
import com.example.springdata.entity.enums.Dish;
import com.example.springdata.entity.repository.DishRepository;
import com.example.springdata.entity.repository.MealRepository;
import com.example.springdata.entity.service.DishService;
import com.example.springdata.entity.service.impl.CollectMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectMealController {
    @Autowired
    CollectMealService collectMealService;
    @Autowired
    DishRepository dishRepository;
    @Autowired
    MealRepository mealRepository;

    @GetMapping("/meal/{meal_id}/dishes")
    Iterable<Dish> getAllMealDish(@PathVariable long meal_id) {
        return collectMealService.getAllMealDish(meal_id);
    }

    @GetMapping("meal/{meal_id}/dishes/add/{dish_id}")
    CollectMeal addCollectDish(@PathVariable long meal_id, @PathVariable long dish_id){
        CollectMeal collectMeal = new CollectMeal();
        collectMeal.setDish(dishRepository.findById(dish_id).get());
        collectMeal.setMeal(mealRepository.findById(meal_id).get());

        return collectMealService.addCollectMeal(collectMeal);
    }
}
