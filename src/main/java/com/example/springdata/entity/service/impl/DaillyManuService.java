package com.example.springdata.entity.service.impl;

import com.example.springdata.entity.enums.DaillyMenu;
import com.example.springdata.entity.enums.Dish;
import com.example.springdata.entity.repository.DaillyMenuRepository;
import com.example.springdata.entity.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaillyManuService {
    @Autowired
    private DaillyMenuRepository daillyMenuRepository;
    @Autowired
    private DishRepository dishRepository;

//    public Dish getBreackfast(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//        Dish dish = menu.getBreackfast();
//        return dish;
//
//    }
//    public Dish getSnack(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//        Dish dish = menu.getSnack();
//        return dish;
//
//    }
//    public Dish getLuch(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//        Dish dish = menu.getLunch();
//        return dish;
//
//    }
//    public Dish getSecondSnack(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//        Dish dish = menu.getSecondSnack();
//        return dish;
//
//    }
//    public Dish getDiner(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//        Dish dish = menu.getDiner();
//        return dish;
//
//    }
//    public int TotalKKalDay(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//
//        int total = menu.getBreackfast().getKkal()+menu.getSnack().getKkal()+menu.getLunch().getKkal()+menu.getSecondSnack().getKkal()+ menu.getDiner().getKkal();
//        return total;
//
//    }

}
