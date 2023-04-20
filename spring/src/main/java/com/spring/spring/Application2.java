package com.spring.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Empleados;

public class Application2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("nuevaApliqueixon.xml");

        //Creamos 2 objetos mediante el beans al XML de Spring
                Empleados Ana = contexto.getBean("EmpleadoDirector", Empleados.class);
                System.out.println("A continuación verás la dirección de memoria de Ana");
                System.out.println(Ana);
                       
                Empleados Manolo = contexto.getBean("EmpleadoDirector", Empleados.class);
                System.out.println("A continuación verás la dirección de memoria de Manolo");
                System.out.println(Manolo);
        
        
                if(Ana==Manolo){
                    System.out.println("Es el mismo objeto");
                }else{
                    System.out.println("Son distintos");
                }
         contexto.close();
}
}