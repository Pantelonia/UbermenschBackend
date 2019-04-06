package com.example.springdata.entity.enums;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "weekly_diet")
public class WeeklyDiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Basic
    @Column(name = "name", nullable = false)

    private String name;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column( name = "author")
    private String author;

    @OneToMany(mappedBy = "week")
    @JsonIgnore
    private Collection<DaillyMenu> daillyMenus;

}
