package com.example.springdata.entity.service.impl;
import com.example.springdata.entity.enums.Parametrs;
import com.example.springdata.entity.enums.Users;
import com.example.springdata.entity.repository.ParametrsRepository;
import com.example.springdata.entity.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl  {
@Autowired
    private UsersRepository usersRepository;

@Autowired
    private ParametrsRepository parametrsRepository;
    public Users addUsers(Users users){
    Users savedUsers = usersRepository.saveAndFlush( users);
    return  savedUsers;
        }

    public void delete(long id) {
    usersRepository.deleteById(id);
}

    public Users getByLogin(String login) {
        return usersRepository.findByLogin(login);
    }

    public Users editUsers(Users users) {
        return usersRepository.saveAndFlush(users);
    }


    public double dailyRate(long id){
    double result;
    Users curruser =  usersRepository.findById(id).get();
    Parametrs parameter = parametrsRepository.findByUsersOrderByIdDesc(curruser).get(0);
    if(parameter.getGender()=='m')
    {
        result = 88.36+(13.4*parameter.getWeight())+(4.8*parameter.getHeight())-(5.7*parameter.getAge());
    }
    else
    {
        result = 447.6+(9.2*parameter.getWeight())+(3.1*parameter.getHeight())-(4.3*parameter.getAge());
    }



    return result;
    }

    public List<Users> getAll() {
        return usersRepository.findAll();
    }


}
