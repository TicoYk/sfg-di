package com.ticoyk.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("br")
@Service("i18Service")
public class I18PortugueseService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Olá Mundo - PortugueseService";
	}
    
}
