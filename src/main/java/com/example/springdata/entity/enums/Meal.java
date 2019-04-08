package com.example.springdata.entity.enums;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;


    @OneToMany(mappedBy = "breakfast" )
    @JsonIgnore
    private Collection<DaillyMenu> breakfasts;


    @OneToMany(mappedBy = "meal")
    @JsonIgnore
    private Collection<Dish> dish;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Collection<Dish> getDish() {
        return dish;
    }

    public void setDish(Collection<Dish> dish) {
        this.dish = dish;
    }
}


