package com.example.springdata.entity.service.impl;


import com.example.springdata.entity.enums.Parametrs;
import com.example.springdata.entity.enums.Users;
import com.example.springdata.entity.repository.ParametrsRepository;
import com.example.springdata.entity.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParametrsService {

    @Autowired
    ParametrsRepository parametrsRepository;
    @Autowired
    UsersRepository usersRepository;

    public Iterable<Parametrs> getAll(){return parametrsRepository.findAll();}

    public Parametrs getLastParametrs(long id){
        System.out.println(id);
        Users user = usersRepository.findById(id).get();
        System.out.println(user.getLogin());
        ArrayList<Parametrs> parametrs = (ArrayList<Parametrs>) parametrsRepository.findByUsersOrderByIdDesc(user);
        System.out.println(parametrs.get(0).getWeight());
        return parametrs.get(0);}


    public Parametrs addParametrs(Parametrs users) {
        Parametrs sevedParametrs = parametrsRepository.save(users);
        return sevedParametrs;
    }
}
