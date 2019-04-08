package com.example.springdata.entity.service.impl;

import com.example.springdata.entity.enums.DaillyMenu;
import com.example.springdata.entity.enums.Dish;
import com.example.springdata.entity.enums.Meal;
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



    public Iterable<Dish> gettAllDishBreakfast(long id){

        DaillyMenu menu = daillyMenuRepository.findById(id).get();
        Meal meal = menu.getBreakfast();
        Iterable<Dish> dishes = meal.getDish();
        return dishes;
    }


//    public Iterable<Dish> getBreackfast(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//        return  menu.getBreackfast();
//
//    }
//
//    public Iterable<Dish> getSnack(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//        return menu.getSnack();
//
//    }
//    public Iterable<Dish> getLuch(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//        return menu.getLunch();
//
//    }
//    public Iterable<Dish> getSecondSnack(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//        return menu.getSecondSnack();
//
//    }
//    public Iterable<Dish> getDiner(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//        return menu.getDiner();
//
//    }
//    public float TotalKKalDay(long id){
//        DaillyMenu menu = daillyMenuRepository.findById(id).get();
//
//        float total = 0;
//
//        for (Dish dish : menu.getBreackfast()){
//            total = total + dish.getKkal();
//        }
//        for (Dish dish:menu.getSnack()     ) {
//            total = total + dish.getKkal();
//        }
//
//        for (Dish dish : menu.getLunch()){
//            total = total + dish.getKkal();
//        }
//        for (Dish dish : menu.getSecondSnack()){
//            total = total + dish.getKkal();
//        }
//        for (Dish dish : menu.getDiner()){
//            total = total + dish.getKkal();
//        }
//        return total;
//
//    }

}
