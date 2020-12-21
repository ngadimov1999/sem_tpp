package com.webshop.simplewebapplication.controller;

import com.webshop.simplewebapplication.Service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AddController {

    @Autowired
    DeviceService deviceService;

    @PostMapping("/add/confirm")
    public ModelAndView add(@RequestParam("name") String name,
                            @RequestParam("price") int price)  {


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("confirm");
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addItem");
        return modelAndView;
    }
}
