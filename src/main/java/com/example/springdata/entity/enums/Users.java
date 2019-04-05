package com.example.springdata.entity.enums;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")

public class Users {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "users")
    private Set<Parametrs> parametr;





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

    public Set<Parametrs> getParametr() {
        return parametr;
    }
}
