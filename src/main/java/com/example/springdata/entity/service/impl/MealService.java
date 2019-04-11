package com.example.springdata.entity.service.impl;

import com.example.springdata.entity.enums.Meal;
import com.example.springdata.entity.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealService {
    @Autowired
    MealRepository mealRepository;

    public Iterable<Meal> getAll() {
        return mealRepository.findAll();
    }

    public Meal getMeal(long id) {
        return mealRepository.findById(id).get();
    }





    public Meal addMeal(Meal meal) {
        return mealRepository.save(meal);
    }

}
