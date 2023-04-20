package com.spring;



import com.spring.spring.GestionDocumentos;

public class Documento implements GestionDocumentos {
    private GestionDocumentos documentoNuevo;
    @Override
    public String getDocumento(){
        return "Presentacion del documento";
    }
       /* este getDocumento y su contenido será la característica común de todos los demás objetos.*/
public void setDocumentoNuevo(GestionDocumentos documentoNuevo){
    this.documentoNuevo = documentoNuevo;
    
}
}
