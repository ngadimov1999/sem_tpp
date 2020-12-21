package com.webshop.simplewebapplication.database.Device;

import com.webshop.simplewebapplication.model.Device;

import java.util.List;

public interface DeviceDAO {
    void addDevice(Device device);
    List<Device> findAll();
    Device findById(int id);
    void deleteDevice(int id);
    int countOfDevices();
}