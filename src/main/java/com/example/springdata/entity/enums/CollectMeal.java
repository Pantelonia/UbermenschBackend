package com.example.springdata.entity.enums;

import javax.persistence.*;

@Entity
public class CollectMeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 6, nullable = false, updatable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal_id", referencedColumnName = "id")
    private Meal meal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dish_id", referencedColumnName = "id")
    private Dish dish;

    public CollectMeal(){

    }

    public Meal getMeal() {
        return meal;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
