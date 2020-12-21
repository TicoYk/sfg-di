package com.ticoyk.sfgdi.controllers;

import com.ticoyk.sfgdi.services.PropertyGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new PropertyGreetingService();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
    
}
