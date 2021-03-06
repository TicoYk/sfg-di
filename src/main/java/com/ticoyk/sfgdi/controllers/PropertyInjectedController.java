package com.ticoyk.sfgdi.controllers;

import com.ticoyk.sfgdi.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // Injectiion of the Property
    @Autowired
    @Qualifier("propertyGreetingService")
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
    
    
}
