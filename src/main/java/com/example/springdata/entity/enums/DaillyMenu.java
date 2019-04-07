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

    @ManyToOne(fetch = FetchType.LAZY, cascade ={CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn(name = "week_id", referencedColumnName = "id", nullable = false)
    private WeeklyDiet week;

    @OneToMany(mappedBy = "breackfast")
    @JsonIgnore
    private Collection<Dish> breackfast;

    @OneToMany( mappedBy = "snack")
    @JsonIgnore
    private Collection<Dish> snack;

    @OneToMany(mappedBy = "lunch")
    @JsonIgnore
    private Collection<Dish> lunch;

    @OneToMany(mappedBy = "secondSnack")
    @JsonIgnore
    private Collection<Dish> secondSnack;

    @OneToMany( mappedBy = "diner")
    @JsonIgnore
    private Collection<Dish> diner;



    public long getId() {
        return id;
    }

    public Collection<Dish> getBreackfast() {
        return breackfast;
    }

    public Collection<Dish> getSnack() {
        return snack;
    }

    public Collection<Dish> getLunch() {
        return lunch;
    }

    public Collection<Dish> getSecondSnack() {
        return secondSnack;
    }

    public Collection<Dish> getDiner() {
        return diner;
    }

    public String getDay() {
        return day;
    }

    public WeeklyDiet getWeek() {
        return week;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBreackfast(Collection<Dish> breackfast) {
        this.breackfast = breackfast;
    }

    public void setSnack(Collection<Dish> snack) {
        this.snack = snack;
    }

    public void setLunch(Collection<Dish> lunch) {
        this.lunch = lunch;
    }

    public void setSecondSnack(Collection<Dish> secondSnack) {
        this.secondSnack = secondSnack;
    }

    public void setDiner(Collection<Dish> diner) {
        this.diner = diner;
    }

    public void setWeek(WeeklyDiet week) {
        this.week = week;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
