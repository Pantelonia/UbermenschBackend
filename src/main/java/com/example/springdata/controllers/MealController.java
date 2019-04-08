package com.example.springdata.controllers;

import com.example.springdata.entity.enums.Dish;
import com.example.springdata.entity.enums.Meal;
import com.example.springdata.entity.enums.Users;
import com.example.springdata.entity.service.impl.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MealController {
    @Autowired
    MealService service;

    @GetMapping("/meal")
    Iterable<Meal> getAll(){return service.getAll();}

    @GetMapping("meal/{id}")
    Iterable<Dish> getMealDish(@PathVariable long id){ return  service.getAllDish(id);}

    @PostMapping(value = "/meal/add", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    Meal addMeal(@RequestBody Meal meal) {return service.addMeal(meal);
    }



}
