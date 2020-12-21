package com.ticoyk.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"en", "default"})
@Service("i18Service")
public class I18EnglishService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EnglishService";
    }
    
}
