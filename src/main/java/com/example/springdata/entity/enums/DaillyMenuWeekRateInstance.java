package com.example.springdata.entity.enums;

import javax.persistence.*;

@Entity
@Table(name ="dailly_menu_week_rate_instance")
public class DaillyMenuWeekRateInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", referencedColumnName = "id", nullable = false, updatable = false)
    private DaillyMenu menu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "week_id", referencedColumnName = "id", nullable = false, updatable = false)
    private WeeklyDiet week;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DaillyMenu getMenu() {
        return menu;
    }

    public void setMenu(DaillyMenu menu) {
        this.menu = menu;
    }


    public WeeklyDiet getWeek() {
        return week;
    }

    public void setWeek(WeeklyDiet week) {
        this.week = week;
    }
}
