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
       
        throw new UnsupportedOperationException("Unimplemented method 'getDocumento'");
    }
    public void metodoInicioPrueba(){
        System.out.println("Aunque puedo añadir todas las tareas que yo quiera antes de iniciar el bean, por ahora solo muestro un mensaje");

    }

    public void metodoDestroyPrueba(){
        System.out.println("Aunque puedo añadir todas las tareas que yo quiera en el DESTROY para que se ejecuten DESPUES DE APAGAR el beans, de momento solo muestro un mensaje");
    }
    

}
