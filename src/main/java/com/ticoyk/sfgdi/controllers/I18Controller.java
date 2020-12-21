package com.ticoyk.sfgdi.controllers;

import com.ticoyk.sfgdi.services.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18Controller {
    
    public final GreetingService greetingService;

    public I18Controller(
        @Qualifier("i18Service") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return this.greetingService.sayGreeting();
    }

}
