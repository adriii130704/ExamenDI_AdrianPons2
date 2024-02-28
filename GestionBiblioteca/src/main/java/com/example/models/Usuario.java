package com.example.models;

import java.util.Date;

public class Usuario {

    private String dni_usuario;

    private Date fecha_alta_sancion;

    public Usuario(String dni_usuario, Date fecha_alta_sancion) {
        this.dni_usuario = dni_usuario;
        this.fecha_alta_sancion = fecha_alta_sancion;
    }

    public String getDni_usuario() {
        return dni_usuario;
    }

    public void setDni_usuario(String dni_usuario) {
        this.dni_usuario = dni_usuario;
    }

    public Date getFecha_alta_sancion() {
        return fecha_alta_sancion;
    }

    public void setFecha_alta_sancion(Date fecha_alta_sancion) {
        this.fecha_alta_sancion = fecha_alta_sancion;
    }

    @Override
    public String toString() {
        return dni_usuario ;
    }
}
