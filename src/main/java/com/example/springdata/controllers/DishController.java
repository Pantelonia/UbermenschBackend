package com.example.springdata.controllers;


import com.example.springdata.entity.enums.Dish;
//import com.example.springdata.entity.enums.Meal;
import com.example.springdata.entity.service.impl.DishServiceImpl;
//import com.example.springdata.entity.service.impl.MealService;
import com.example.springdata.entity.service.impl.ParametrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class DishController {
    @Autowired
    DishServiceImpl service;
//    @Autowired
//    MealService mealService;


    @GetMapping("/dish")
    Iterable<Dish> getAll() {
        return service.getAll();
    }

    @GetMapping("/dish/{id}")
    Dish getDish(@PathVariable long id) {
        return service.getDish(id);
    }
    @GetMapping("/dish/delete/{id}")
    void deleteDish(@PathVariable long id){
        service.delete(id);
    }


//    @PostMapping(value = "/dish/add/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    @ResponseBody
//    Dish addDish(@RequestBody Dish dish, @PathVariable long id) {
//        Meal meal =  mealService.getMeal(id);
//        dish.setMeal(meal);
//        return service.addDish(dish);
//    }
}
