package com.example.springdata.entity.enums;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "parametrs")

public class Parametrs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Basic
    @Column(name = "date")
    private Date date;

    @Basic
    @Column(name = "height")
    private int height;

    @Basic
    @Column(name = "weight")
    private int weight;

    @Basic
    @Column(name = "age")
    private int age;

    @Basic
    @Column(name = "gender")
    private char gender;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

    public  Parametrs(long id, Date date, int height, int weight, int age, char gender, Users user){
        this.id = id;
        this.date =date;
        this.height= height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.users = user;

    }
    public  Parametrs(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
