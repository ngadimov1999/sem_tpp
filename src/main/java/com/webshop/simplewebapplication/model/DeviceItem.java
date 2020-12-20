package com.webshop.simplewebapplication.model;

import javax.persistence.*;

@Entity
@Table(name = "device_item")
public class DeviceItem {

    public DeviceItem() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Device device;

    public DeviceItem(Item item, Device device) {
        this.item = item;
        this.device = device;
    }
}