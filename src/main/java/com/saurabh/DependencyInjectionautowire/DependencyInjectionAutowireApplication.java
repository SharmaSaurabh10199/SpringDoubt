package com.saurabh.DependencyInjectionautowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.saurabh.DependencyInjectionautowire")
@SpringBootApplication
public class DependencyInjectionAutowireApplication {

	public static void main(String[] args) {
		// this returns the spring container which contains all the spring beans
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionAutowireApplication.class,
				args);
		// here we try to get the object of alien type, but it is not accessible as
		// spring container don't have it till now
		// in order to let spring have that object, we have to use @component directly
		// or indirectly
		Alien a = context.getBean(Alien.class);
		a.show();
		// Alien a= new Alien();

	}

}
