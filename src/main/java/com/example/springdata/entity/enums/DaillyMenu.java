package com.example.springdata.entity.enums;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "daily_diet")
@Data
public class DaillyMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Basic
    @Column(name = "day")
    private String day;




    @OneToMany(mappedBy = "menu")
    @JsonIgnore
    private Collection<DaillyMenuWeekRateInstance> daillyMenuWeekRateInstances;

    @OneToMany(mappedBy = "menu" )
    @JsonIgnore
    private Collection<Meal> meals;

    public  DaillyMenu(){

    }
    public DaillyMenu(String day, Collection<Meal> meals) {
        this.day = day;
    }


//    @OneToMany(mappedBy = "breakfast" )
//    private Collection<Meal> breakfast;
//
//    @Basic
//    @Column(name = "snack")
//    @OneToMany(mappedBy = "meal_id")
//    private Collection<Meal> snack;
//
//    @Basic
//    @Column(name = "lunch")
//    @OneToMany(mappedBy = "meal_id")
//    private Collection<Meal> lunch;
//
//    @Basic
//    @Column(name = "second_snack")
//    @OneToMany(mappedBy = "meal_id")
//    private Collection<Meal> secondSnack;
//
//    @Basic
//    @Column(name = "diner")
//    @OneToMany(mappedBy = "meal_id")
//    private Collection<Meal> diner;
//
//
//    @OneToMany(mappedBy = "menu")
//    @JsonIgnore
//    private Collection<DaillyMenuWeekRateInstance> daillyMenuWeekRateInstances;


    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Collection<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Collection<Meal> meals) {
        this.meals = meals;
    }
}
