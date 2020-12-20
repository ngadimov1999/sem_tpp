package com.webshop.simplewebapplication.controller;

import com.webshop.simplewebapplication.Service.ItemService;
import com.webshop.simplewebapplication.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class ListController {

    static final Logger logger = LoggerFactory.getLogger(ListController.class);

    @GetMapping("/")
    public ModelAndView index() {
        ItemService itemService = new ItemService();
        List<Item> items = itemService.findAll();
        logger.info("Got all items");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("items", items);
        return modelAndView;
    }

    @GetMapping("/device")
    public ModelAndView Device() {
        ItemService itemService = new ItemService();
        List<Item> items = itemService.findAllInDevice();
        int sumInDevice = itemService.getSumInDevice();
        logger.info("Got all items in Device");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("device");
        modelAndView.addObject("items", items);
        modelAndView.addObject("sum",sumInDevice);
        return modelAndView;
    }
}