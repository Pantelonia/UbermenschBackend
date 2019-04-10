package com.example.springdata.entity.enums;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", referencedColumnName = "id", nullable = false)
    private DaillyMenu menu;



    @OneToMany(mappedBy = "meal")
    @JsonIgnore
    private Collection<CollectMeal> collectMeals;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Meal(){

    }
    public Meal(DaillyMenu menu){

        this.menu = menu;
    }




    public Collection<CollectMeal> getCollectMeals() {
        return collectMeals;
    }

    public void setCollectMeals(Collection<CollectMeal> collectMeals) {
        this.collectMeals = collectMeals;
    }

    public DaillyMenu getMenu() {
        return menu;
    }

    public void setMenu(DaillyMenu menu) {
        this.menu = menu;
    }
}


