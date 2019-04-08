package com.example.springdata.controllers;

import com.example.springdata.entity.enums.Users;
import com.example.springdata.entity.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    UsersServiceImpl service;

    @GetMapping("/users")
    Iterable<Users> getAll() {return service.getAll();}

    @GetMapping("/users/{id}")
    Users getUser(@PathVariable Long id){return  service.getUser(id);}

    @GetMapping(value = "/users/", params = "login")
    Users getUserByLogin(@RequestParam String login){ return  service.getByLogin(login);}

    @GetMapping(value = "/users/", params = "email")
    Users getUserByEmail(@RequestParam String email){return  service.getByEmail(email);}

    @GetMapping("/users/{id}/dailyRate")
    double getdailyRate(@PathVariable Long id){ return service.dailyRate(id);}



    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    Users addUsers(@RequestBody Users user) {
        return service.addUsers(user);
    }

    @PostMapping(value = "/users/{id}", params = "email")
    Users changeUserEmail(@PathVariable long id, @RequestParam String email){
        return service.changeEmail(id, email);
    }

    @PostMapping(value = "/users/{id}", params = "password")
    Users changeUserPassword(@PathVariable long id, @RequestParam String password){
        return service.changePassword(id, password);}


}
