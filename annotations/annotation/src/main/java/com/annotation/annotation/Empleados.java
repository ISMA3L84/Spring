package com.annotation.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public interface Empleados {
    public abstract String getResponsabilidades();

    public String getDocumento();

   

    

    
}