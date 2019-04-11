package com.example.springdata.entity.service.impl;

import com.example.springdata.entity.enums.DaillyMenu;
import com.example.springdata.entity.enums.DaillyMenuWeekRateInstance;
import com.example.springdata.entity.enums.WeeklyDiet;
import com.example.springdata.entity.repository.DaillyMenuRepository;
import com.example.springdata.entity.repository.WeeklyDietRepository;
import com.example.springdata.entity.repository.WeeklyMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WeeklyMenuService {
    @Autowired
    DaillyMenuRepository daillyMenuRepository;
    @Autowired
    WeeklyDietRepository weeklyDietRepository;
    @Autowired
    WeeklyMenuRepository weeklyMenuRepository;

    public ArrayList<DaillyMenu> getAllProgrammDay(Long id){
        ArrayList<DaillyMenu> days = new ArrayList<>();
        WeeklyDiet weeklyDiet = weeklyDietRepository.findById(id).get();
        Iterable<DaillyMenuWeekRateInstance> daillyMenuWeekRateInstances = weeklyMenuRepository.findAllByWeek(weeklyDiet);
        for (DaillyMenuWeekRateInstance daillyMenuWeekRateInstance: daillyMenuWeekRateInstances) {

            days.add(daillyMenuWeekRateInstance.getMenu());

        }
        return days;

    }
    public DaillyMenuWeekRateInstance addWeeklyMenu(DaillyMenuWeekRateInstance daillyMenuWeekRateInstance){
        return weeklyMenuRepository.save(daillyMenuWeekRateInstance);
    }
}
