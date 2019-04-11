package com.example.springdata.entity.service.impl;

import com.example.springdata.entity.enums.UserWeekInstance;
import com.example.springdata.entity.enums.Users;
import com.example.springdata.entity.enums.WeeklyDiet;
import com.example.springdata.entity.repository.UserWeekRepository;
import com.example.springdata.entity.repository.UsersRepository;
import com.example.springdata.entity.repository.WeeklyDietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserWeekService {
    @Autowired
    UsersRepository usersRepository;
    @Autowired
    UserWeekRepository userWeekRepository;
    @Autowired
    WeeklyDietRepository weeklyDietRepository;

    public ArrayList<WeeklyDiet> getAllUsersProgramm(Long id){
        ArrayList<WeeklyDiet> programms = new ArrayList<>();
        Users user = usersRepository.findById(id).get();
        Iterable<UserWeekInstance> userWeekInstances = userWeekRepository.findAllByUser(user);
        for (UserWeekInstance userweek: userWeekInstances) {

            programms.add(userweek.getWeek());

        }
        return programms;

    }

    public UserWeekInstance getUserWeek(Long id_user, long id_week){
        Users users = usersRepository.findById(id_user).get();
        WeeklyDiet weeklyDiet = weeklyDietRepository.findById(id_week).get();
        return userWeekRepository.findByUserAndWeek(users,weeklyDiet);
    }

    public UserWeekInstance addUserWeekInstance(UserWeekInstance userWeekInstance){
        return userWeekRepository.save(userWeekInstance);

    }

}
