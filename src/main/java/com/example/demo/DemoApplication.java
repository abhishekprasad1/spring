package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

@EnableSwagger2
@SpringBootApplication(scanBasePackages={
		"com.example.demo", "com.hospital.details","com.example.ExceptionHandling","com.example.swagger"})
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationcontext = SpringApplication.run(DemoApplication.class, args);
		System.out.println("test");
		for(String beans : applicationcontext.getBeanDefinitionNames()){
			System.out.println("beans-->"+beans);
		}
		System.out.println("bean definition -->"+applicationcontext.containsBeanDefinition("implementInOneWay"));
		MainClass mc = applicationcontext.getBean(MainClass.class);
		mc.toBeImplementedMethod();

		
	}
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.DemoApplication")).build();	}

}
