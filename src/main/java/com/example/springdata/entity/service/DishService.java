package com.example.springdata.entity.service;

import com.example.springdata.entity.enums.Dish;

import java.util.List;

public interface DishService {
    Dish addDish(Dish dish);
    void  delete(long id);
    Dish editUsers(Dish users);
    List<Dish> getAll();
    Dish getByName(String name);
    Dish retio(Dish dish);
}
