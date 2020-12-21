package com.ticoyk.sfgdi.controllers;

import com.ticoyk.sfgdi.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    
    public GreetingService greetingService;

    // Setter is specified on the Setter Method
    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
    
}
