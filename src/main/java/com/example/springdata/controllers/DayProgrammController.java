package com.example.springdata.controllers;

import com.example.springdata.entity.enums.DaillyMenu;
import com.example.springdata.entity.enums.DaillyMenuWeekRateInstance;
import com.example.springdata.entity.enums.WeeklyDiet;
import com.example.springdata.entity.repository.DaillyMenuRepository;
import com.example.springdata.entity.repository.WeeklyDietRepository;
import com.example.springdata.entity.service.impl.WeeklyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class DayProgrammController {
    @Autowired
    WeeklyMenuService weeklyMenuService;
    @Autowired
    WeeklyDietRepository weeklyDietRepository;
    @Autowired
    DaillyMenuRepository daillyMenuRepository;

    @GetMapping("/Programm/{id}/days/")
    Iterable<DaillyMenu>  getAllProgrammDay(@PathVariable long id){
        return weeklyMenuService.getAllProgrammDay(id);
    }

    @GetMapping("/Programm/{id_programm}/days/add/{id_day}")
    DaillyMenuWeekRateInstance addDay(@PathVariable long id_programm, @PathVariable long id_day){
        DaillyMenuWeekRateInstance daillyMenuWeekRateInstance = new DaillyMenuWeekRateInstance();
        daillyMenuWeekRateInstance.setWeek(weeklyDietRepository.findById(id_programm).get());
        daillyMenuWeekRateInstance.setMenu(daillyMenuRepository.findById(id_day).get());
        return  weeklyMenuService.addWeeklyMenu(daillyMenuWeekRateInstance);

    }
    @GetMapping("/day")
    Iterable<DaillyMenu> getAllDay(){
        return daillyMenuRepository.findAll();
    }
    @PostMapping("/day/add")
    @ResponseBody
    DaillyMenu addDay(@RequestBody DaillyMenu menu){ return daillyMenuRepository.save(menu);
    }
}
