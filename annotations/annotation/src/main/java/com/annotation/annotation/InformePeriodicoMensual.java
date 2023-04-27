package com.annotation.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
public class InformePeriodicoMensual implements CrearDocumentos {
    @Override
    public String getDocumento() {
       return "Informe periodico mensual";
        
    }
    
}
