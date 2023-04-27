package com.annotation.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpleadoDirector implements Empleados {
    
    public EmpleadoDirector(CrearDocumentos documentoDirector) {
        this.documentoDirector = documentoDirector;
       
    }

   

    @Override
    public String getResponsabilidades() {
      return "Dirige los departamentos y objetivos de la empresa"; 
        
    }
    private String emailDepartamental;
    private String empresa;
    @Autowired
    private CrearDocumentos documentoDirector;
    public String getEmailDepartamental() {
        return emailDepartamental;
    }


    public void setEmailDepartamental(String email) {
        this.emailDepartamental = email;
    }


    public String getEmpresa() {
        return empresa;
    }


    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String getDocumento() {
       return "Documento generado por el Director";
        
    }
   
    

}