package com.example.springdata.entity.enums;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity


public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Basic
    @Column(name = "login")
    private String login;

    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "users")
    @JsonIgnore
    private Collection<Parametrs> parametr;

    public Users(){

    }
    public Users(long id, String login, String password, String email){
        this.id= id;
        this.login = login;
        this.password = password;
        this.email = email;
    }




    public long getId(){
        return id;
    }
    public  void setId(long id){
        this.id = id;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Parametrs> getParametr() {
        return parametr;
    }

    public void setParametr(Collection<Parametrs> parametr) {
        this.parametr = parametr;
    }
}
