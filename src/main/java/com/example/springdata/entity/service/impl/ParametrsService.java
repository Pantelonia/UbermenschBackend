package com.example.springdata.entity.service.impl;


import com.example.springdata.entity.enums.Parametrs;
import com.example.springdata.entity.repository.ParametrsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParametrsService {

    @Autowired
    ParametrsRepository parametrsRepository;

    public Iterable<Parametrs> getAll(){return parametrsRepository.findAll();}

    public Parametrs addParametrs(Parametrs users) {
        Parametrs sevedParametrs = parametrsRepository.save(users);
        return sevedParametrs;
    }
}
