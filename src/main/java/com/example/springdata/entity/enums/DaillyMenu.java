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



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "breakfast_id", referencedColumnName = "id", nullable = false)
    private Meal breakfast;

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


    public String getDay() {
        return day;
    }


    public void setDay(String day) {
        this.day = day;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Meal getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Meal breakfast) {
        this.breakfast = breakfast;
    }
}
