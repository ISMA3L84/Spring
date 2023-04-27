package com.annotation.annotation;

import org.springframework.stereotype.Component;

@Component
public class InformePeriodicoAnual implements CrearDocumentos {

    @Override
    public String getDocumento() {
       return "Informe periodico anual";
        
    }
    
}
