package com.Springboottutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${welcome.meassage}")
    private String welcomeMeassage;

    @Value("${Some.configuration}")
    private String config;

    //@RequestMapping(value ="/", method = RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld(){
        System.out.println("Welcome !!!");
        return welcomeMeassage;
    }

    @GetMapping("/config")
    public String config(){
        System.out.println("Welcome !!!");
        return config;
    }

}
