package com.example.springdata.entity.service.impl;

import com.example.springdata.entity.enums.Dish;
import com.example.springdata.entity.repository.DishRepository;
import com.example.springdata.entity.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishServiceImpl  {
    @Autowired
    private DishRepository dishRepository;
    //    @Override
    public Dish addDish(Dish dish){
        Dish savedDish = dishRepository.save( dish);
        return  savedDish;
    }

    public void delete(long id) {
        dishRepository.deleteById(id);
    }

    public Dish getByName(String name) {
        return dishRepository.findByName(name);
    }

    public Dish editUsers(Dish users) {
        return dishRepository.save(users);
    }



    public Iterable<Dish> getAll() {
        return dishRepository.findAll();
    }



}
