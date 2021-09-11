package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationcontext = SpringApplication.run(DemoApplication.class, args);

		for(String beans : applicationcontext.getBeanDefinitionNames()){
			System.out.println("beans-->"+beans);
		}
		/*MainClass mc = applicationcontext.getBean(MainClass.class);
		mc.toBeImplementedMethod();*/
	}

}
