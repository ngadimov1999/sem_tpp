package com.webshop.simplewebapplication.model;

import javax.persistence.*;

@Entity
@Table(name = "my_user")
public class MyUser {

    public MyUser(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String login;

    @Column
    private String password;

    @ManyToOne
    private Device device;


    public MyUser(int user_id, String login, String password, Device device) {
        this.id = user_id;
        this.login = login;
        this.password = password;
        this.device = device;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}