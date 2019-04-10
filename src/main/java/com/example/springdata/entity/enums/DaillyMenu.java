package com.example.springdata.entity.enums;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "daily_diet")
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
    private Collection<Meal> meals;





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


}
