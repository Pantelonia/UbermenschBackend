package com.example.springdata.entity.service;

import com.example.springdata.entity.enums.Users;

import java.util.List;
public interface UsersService {
    Users addUsers(Users users);
    void  delete(long id);
    Users editUsers(Users users);
    List<Users> getAll();
    Users getByName(String name);
    Users dailyRate(long id);
}
