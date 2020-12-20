package com.webshop.simplewebapplication.Service;

import com.webshop.simplewebapplication.database.Item.ItemDAOHib;
import com.webshop.simplewebapplication.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemDAOHib dataBase = new ItemDAOHib();

    public boolean addItem(Item item) {
        dataBase.addItem(item);
        return true;
    }

    public void addItemToDevice(int id) {
        dataBase.addItemToDevice(id);
    }

    public List<Item> findAll() {
        return dataBase.findAll();
    }


    public Item findById(int id) {
        return dataBase.findById(id);
    }

    public int countOfItems(){
        return dataBase.countOfItems();
    }

    public void deleteFromDevice(int id, boolean isSold){
        dataBase.deleteFromDevice(id, isSold);
    }


    public boolean deleteItem(int id) {
        dataBase.deleteItem(id);
        return true;
    }

    public List<Item> findAllInDevice(){
        return dataBase.findAllInDevice();
    }

    public int getSumInDevice() {
        return dataBase.getSumInDevice();
    }
}