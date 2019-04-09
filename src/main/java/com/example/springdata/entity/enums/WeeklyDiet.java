package com.example.springdata.entity.enums;
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
    private Collection<DaillyMenuWeekRateInstance> daillyMenuWeekRateInstances;

    @OneToMany(mappedBy = "week")
    @JsonIgnore
    private Collection<UserWeekInstance> userWeekInstances;
    public WeeklyDiet(){

    }

    public WeeklyDiet(String name, String description, String author) {
        this.name = name;
        this.description = description;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
