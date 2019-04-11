package com.example.springdata.entity.service.impl;

import com.example.springdata.entity.enums.*;
import com.example.springdata.entity.repository.CollectMealRepository;
import com.example.springdata.entity.repository.DishRepository;
import com.example.springdata.entity.repository.MealRepository;
import com.example.springdata.entity.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CollectMealService {
    @Autowired
    CollectMealRepository collectMealRepository;
    @Autowired
    MealRepository mealRepository;

    @Autowired
    DishServiceImpl dishService;
    public ArrayList<Dish> getAllMealDish(Long id){
        ArrayList<Dish> dishes = new ArrayList<>();
        Meal meal = mealRepository.findById(id).get();
        Iterable<CollectMeal> collectMeals = collectMealRepository.findAllByMeal(meal);
        for (CollectMeal collectMeal: collectMeals) {

            dishes.add(collectMeal.getDish());

        }
        return dishes;
    }
    public CollectMeal addCollectMeal(CollectMeal collectMeal){
        return collectMealRepository.save(collectMeal);
    }

}
