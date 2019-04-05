package com.example.springdata.entity.enums;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity

@Table(name = "dish")
public class Dish {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "kkal")
    private int kkal;
    @Column(name = "protein")
    private int protein;
    @Column(name = "carbohydrates")
    private int carbohydrates;
    @Column(name = "fat")
    private int fat;
    @Column(name = "description")
    private String description;
    @Column(name = "type_dish")
    private String type_dish;

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
}
