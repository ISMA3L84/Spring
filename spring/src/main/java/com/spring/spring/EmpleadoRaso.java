package com.spring.spring;

import com.Empleados;

public class EmpleadoRaso implements Empleados {
    public EmpleadoRaso() {
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'metodoInicioPrueba'");
    }
}
