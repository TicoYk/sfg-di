package com.ticoyk.sfgdi;

import com.ticoyk.sfgdi.controllers.ConstructorInjectedController;
import com.ticoyk.sfgdi.controllers.MyController;
import com.ticoyk.sfgdi.controllers.PropertyInjectedController;
import com.ticoyk.sfgdi.controllers.SetterInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("/////// Property Controller : ");
		PropertyInjectedController prop = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(prop.getGreeting());

		System.out.println("/////// Setter Controller : ");
		SetterInjectedController setter = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setter.getGreeting());

		System.out.println("/////// Constructor Controller : ");
		ConstructorInjectedController constru= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constru.getGreeting());

	}

}
