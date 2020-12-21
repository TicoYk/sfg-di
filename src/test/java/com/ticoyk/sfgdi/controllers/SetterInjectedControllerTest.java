package com.ticoyk.sfgdi.controllers;

import com.ticoyk.sfgdi.services.SetterGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {
    
    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new SetterGreetingService());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
    
}
