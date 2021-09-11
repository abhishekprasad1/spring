package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages={
		"com.example.demo", "com.hospital.details"})
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationcontext = SpringApplication.run(DemoApplication.class, args);

		for(String beans : applicationcontext.getBeanDefinitionNames()){
			System.out.println("beans-->"+beans);
		}
		System.out.println("bean definition -->"+applicationcontext.containsBeanDefinition("implementInOneWay"));
		MainClass mc = applicationcontext.getBean(MainClass.class);
		mc.toBeImplementedMethod();


	}

}
