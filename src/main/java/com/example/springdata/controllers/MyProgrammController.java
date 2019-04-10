package com.example.springdata.controllers;

import com.example.springdata.entity.enums.UserWeekInstance;
import com.example.springdata.entity.enums.WeeklyDiet;
import com.example.springdata.entity.repository.UsersRepository;
import com.example.springdata.entity.repository.WeeklyDietRepository;
import com.example.springdata.entity.service.impl.UserWeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyProgrammController {
    @Autowired
    UserWeekService userWeekService;
    @Autowired
    WeeklyDietRepository weeklyDietRepository;


    @Autowired
    UsersRepository usersRepository;
    @GetMapping("/MyProgramm/{id}")
    Iterable<WeeklyDiet> getAllUsersProgram(@PathVariable long id){ return userWeekService.getAllUsersProgramm(id);}

    @GetMapping("/MyProgramm/check/{id_user}/{id_week}")
    UserWeekInstance getUserWeek(@PathVariable long id_user, @PathVariable long id_week){
        return  userWeekService.getUserWeek(id_user, id_week);
    }

    @GetMapping("/Programm")
    Iterable<WeeklyDiet> getAllProgram(){return weeklyDietRepository.findAll();}

    @GetMapping("/Programm/{id}")
    WeeklyDiet getProgramm(@PathVariable Long id){
        return weeklyDietRepository.findById(id).get();
    }

    @PostMapping(value = "/Programm/add", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    WeeklyDiet addProgramm(@RequestBody WeeklyDiet programm){ return weeklyDietRepository.save(programm);
    }

    @PostMapping(value = "/MyProgramm/add/{id_user}/{id_programm}",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    UserWeekInstance addMyProgramm(@PathVariable long id_user, @PathVariable long id_programm){
        UserWeekInstance userWeekInstance = new UserWeekInstance();
        userWeekInstance.setUser(usersRepository.findById(id_user).get());
        userWeekInstance.setWeek(weeklyDietRepository.findById(id_programm).get());
        return userWeekService.addUserWeekInstance(userWeekInstance);}



}
