package com.annotation.annotation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationApplication.class, args);
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		
		Empleados Maria = contexto.getBean("empleadoDirector", Empleados.class);

		System.out.println(Maria.getDocumento());
        System.out.println(Maria.getResponsabilidades());
		contexto.close();

	}

}
