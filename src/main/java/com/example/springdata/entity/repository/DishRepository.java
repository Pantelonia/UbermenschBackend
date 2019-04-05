package com.example.springdata.entity.repository;
import com.example.springdata.entity.enums.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DishRepository  extends JpaRepository<Dish, Long>{
    Dish findByName(String name);


}
