package com.ticoyk.sfgdi.controllers;

import com.ticoyk.sfgdi.services.ConstructorGreetingService;
import com.ticoyk.sfgdi.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// No need to specify auto wired
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(
        @Qualifier("constructorGreetingService") ConstructorGreetingService greetingService
        ){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
