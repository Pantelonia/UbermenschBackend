package com.example.springdata.controllers;

import com.example.springdata.entity.enums.Parametrs;
import com.example.springdata.entity.enums.Users;
import com.example.springdata.entity.service.UsersService;
import com.example.springdata.entity.service.impl.ParametrsService;
import com.example.springdata.entity.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController

public class ParametrsController {

    @Autowired
    ParametrsService service;
    @Autowired
    UsersServiceImpl usersService;

    @GetMapping("/parametrs")
    Iterable<Parametrs> getAll(){
        return service.getAll();
    }



    @PostMapping(value = "/parametrs/{user_id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    Parametrs addParametrs(@RequestBody Parametrs parametrs, @PathVariable long user_id) {
        Users user = usersService.getUser(user_id);
        parametrs.setUsers(user);
        return service.addParametrs(parametrs);
    }

}
