package com.webshop.simplewebapplication.database.Item;

import com.webshop.simplewebapplication.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ItemDAO {
    void addItem(Item item);
    List<Item> findAll();
    Item findById(int id);
    void deleteItem(int id);
    int countOfItems();
    List<Item> findAllInDevice();
    void addItemToDevice(int id);
    void deleteFromDevice(int id, boolean isSold);
    int getSumInDevice();
}