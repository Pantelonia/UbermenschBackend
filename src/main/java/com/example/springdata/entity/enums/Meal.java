package com.example.springdata.entity.enums;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "meal")
public class Meal
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 6, nullable = false, updatable = false)
    private long id;

    @Basic
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "meal")
    @JsonIgnore
    private Collection<CollectMeal> collectMeals;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", referencedColumnName = "id", nullable = false)
    private DaillyMenu menu;



    public Meal(){

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
}
