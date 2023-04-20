package com.spring.spring;

import com.Empleados;

public class EmpleadoDirector implements Empleados {
    public EmpleadoDirector() {
        super();
    }

    @Override
    public String getResponsabilidades() {
       
        throw new UnsupportedOperationException("Unimplemented method 'getResponsabilidades'");
    }
    private String emailDepartamental;
    private String empresa;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDocumento'");
    }


}
