package com.spring.spring;
import com.Empleados;

public class EmpleadoJefe implements Empleados {
    public EmpleadoJefe() {
        super();
    }

    @Override
    public String getResponsabilidades() {
      
        throw new UnsupportedOperationException("Unimplemented method 'getResponsabilidades'");
    }

    @Override
    public String getDocumento() {
       
        throw new UnsupportedOperationException("Unimplemented method 'getDocumento'");
    }

    @Override
    public void metodoInicioPrueba() {
        System.out.println("Aunque puedo añadir todas las tareas que yo quiera antes de iniciar el beans, de momento solo muestro un mensaje");
    }

  

}
