package com.spring.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Empleados;
public class ApplicationPruebaBeans {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext8.xml");
        
       Empleados empleado1 = new EmpleadoDirector();
       empleado1.metodoInicioPrueba();
    
       
        
        
        contexto.close();

    }

    
    

   
}