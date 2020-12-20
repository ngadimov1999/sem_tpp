package com.webshop.simplewebapplication.model;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {

    public Item(int i, String name, int price, String доступно_для_покупки){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;

    @Column
    private int price;

    @Column
    private String phone;

    @ManyToOne
    private Garanty garanty;

    @ManyToOne
    private MyUser myUser;

    public Item(int id, String name, int price, String phone, Garanty garanty, MyUser myUser) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.phone = phone;
        this.garanty = garanty;
        this.myUser = myUser;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String status) {
        this.phone = status;
    }

    public Garanty getGaranty(){return garanty;}

    public void setGaranty(Garanty Garanty){ this.garanty = Garanty; }



    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +

                '}';
    }
}