package com.webshop.simplewebapplication.controller;

import com.webshop.simplewebapplication.Service.DeviceService;
import com.webshop.simplewebapplication.model.Device;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class ListController {

    static final Logger logger = LoggerFactory.getLogger(ListController.class);

    @GetMapping("/")
    public ModelAndView index() {
        DeviceService deviceService = new DeviceService();
        List<Device> items = deviceService.findAll();
        logger.info("Got all items");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("items", items);
        return modelAndView;
    }

    @GetMapping("/device")
    public ModelAndView Device() {
        DeviceService deviceService = new DeviceService();

        logger.info("Got all items in Device");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("device");

        return modelAndView;
    }
}