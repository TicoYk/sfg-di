package com.ticoyk.sfgdi.controllers;

import com.ticoyk.sfgdi.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @Autowired
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
