package com.example.springdata.controllers;

import com.example.springdata.entity.enums.DaillyMenu;
import com.example.springdata.entity.enums.Meal;
import com.example.springdata.entity.repository.DaillyMenuRepository;
import com.example.springdata.entity.service.impl.DaillyManuService;
import com.example.springdata.entity.service.impl.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MealController {
    @Autowired
    MealService service;
    @Autowired
    DaillyMenuRepository daillyMenuRepository;
    @Autowired
    DaillyManuService daillyManuService;

    @GetMapping("/meal")
    Iterable<Meal> getAll(){return service.getAll();}


    @PostMapping(value = "/meal/add/{menu_id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    Meal addMeal(@RequestBody Meal meal, @PathVariable long menu_id) {
        DaillyMenu daillyMenu = daillyMenuRepository.findById(menu_id).get();
        meal.setMenu(daillyMenu);
        return service.addMeal(meal);
    }

    @GetMapping("day/{day_id}/meals")
    Iterable<Meal> getAllDaysMeal(@PathVariable long day_id){
        return daillyManuService.getAllDaysMeal(day_id);
    }



}
