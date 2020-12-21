package com.webshop.simplewebapplication.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "garanty")
public class Garanty {

    public Garanty(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Date date;
    @ManyToOne
    private Device device;

    public Garanty(int id, Date date, Device device) {
        this.id = id;
        this.date = date;
        this.device = device;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Garanty{" +
                "id=" + id +
                ", date='" + date + '\'' +
                '}';
    }
}