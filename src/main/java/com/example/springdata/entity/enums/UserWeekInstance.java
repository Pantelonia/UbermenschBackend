package com.example.springdata.entity.enums;

import javax.persistence.*;

@Entity
@Table(name = "user_week_instance")
public class UserWeekInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, updatable = false)
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "week_id", referencedColumnName = "id", nullable = false, updatable = false)
    private WeeklyDiet week;

    @Basic
    @Column(name = "active",  nullable = false, updatable = false, insertable = false, columnDefinition = "boolean default false")
    private  Boolean active;

    public UserWeekInstance() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WeeklyDiet getWeek() {
        return week;
    }

    public void setWeek(WeeklyDiet week) {
        this.week = week;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
