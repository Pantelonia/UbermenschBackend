package com.example.springdata.entity.enums;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Collection;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 6, nullable = false, updatable = false)
    private long id;

    @Basic
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Basic
    @Column(name = "kkal")
    private int kkal;

    @Basic
    @Column(name = "protein")
    private int protein;

    @Basic
    @Column(name = "carbohydrates")
    private int carbohydrates;

    @Basic
    @Column(name = "fat")
    private int fat;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "type_dish")
    private String type_dish;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "breackfast_id" , referencedColumnName = "id", nullable = false)
    private DaillyMenu breackfast;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "snack", nullable = false)
    private DaillyMenu snack;


    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "lunch", nullable = false)
    private DaillyMenu lunch;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "secondSnack", nullable = false)
    private DaillyMenu secondSnack;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "diner", nullable = false)
    private DaillyMenu diner;



    public Dish(){}
    public Dish(Long id, String name, int kkal, int protein, int carbohydrates, int fat, String description, String type_dish){
        this.id = id;
        this.name = name;
        this.kkal = kkal;
        this.protein =protein;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.description =description;
        this.type_dish = type_dish;

    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKkal() {
        return kkal;
    }

    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType_dish() {
        return type_dish;
    }

    public void setType_dish(String type_dish) {
        this.type_dish = type_dish;
    }

    public void setDiner(DaillyMenu diner) {
        this.diner = diner;
    }

    public void setSecondSnack(DaillyMenu secondSnack) {
        this.secondSnack = secondSnack;
    }

    public void setLunch(DaillyMenu lunch) {
        this.lunch = lunch;
    }

    public void setSnack(DaillyMenu snack) {
        this.snack = snack;
    }

    public void setBreackfast(DaillyMenu breackfast) {
        this.breackfast = breackfast;
    }

    public DaillyMenu getBreackfast() {
        return breackfast;
    }

    public DaillyMenu getDiner() {
        return diner;
    }

    public DaillyMenu getLunch() {
        return lunch;
    }

    public DaillyMenu getSecondSnack() {
        return secondSnack;
    }

    public DaillyMenu getSnack() {
        return snack;
    }
}
