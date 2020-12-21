package com.ticoyk.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("es")
@Service("i18Service")
public class I18SpanishService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hola Mundo - SpanishService";
	}
    
}
