package com.example.springdata.entity.enums;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


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

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "breackfast", nullable = false)
    private Dish breackfast;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "snack", nullable = false)
    private Dish snack;


    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "lunch", nullable = false)
    private Dish lunch;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "secondSnack", nullable = false)
    private Dish secondSnack;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "diner", nullable = false)
    private Dish diner;

    @ManyToOne(fetch = FetchType.LAZY, cascade ={CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn(name = "week_id", referencedColumnName = "id", nullable = false)
    private WeeklyDiet week;



    public long getId() {
        return id;
    }

    public Dish getBreackfast() {
        return breackfast;
    }

    public Dish getSnack() {
        return snack;
    }

    public Dish getLunch() {
        return lunch;
    }

    public Dish getSecondSnack() {
        return secondSnack;
    }

    public Dish getDiner() {
        return diner;
    }

    public String getDay() {
        return day;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBreackfast(Dish breackfast) {
        this.breackfast = breackfast;
    }

    public void setSnack(Dish snack) {
        this.snack = snack;
    }

    public void setLunch(Dish lunch) {
        this.lunch = lunch;
    }

    public void setSecondSnack(Dish secondSnack) {
        this.secondSnack = secondSnack;
    }

    public void setDiner(Dish diner) {
        this.diner = diner;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
