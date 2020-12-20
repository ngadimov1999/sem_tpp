package com.webshop.simplewebapplication.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "garanty")
public class Garanty {

    public Garanty(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;


    public Garanty(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Garanty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}