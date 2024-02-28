package com.example.models;

import java.util.Date;

public class Prestamo {
   private int id_libro;

   private String dni_usuario;

   private Date fecha_devolucion;

    public Prestamo(int id_libro, String dni_usuario, Date fecha_devolucion) {
        this.id_libro = id_libro;
        this.dni_usuario = dni_usuario;
        this.fecha_devolucion = fecha_devolucion;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getDni_usuario() {
        return dni_usuario;
    }

    public void setDni_usuario(String dni_usuario) {
        this.dni_usuario = dni_usuario;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    @Override
    public String toString() {
        return  id_libro  +" "+ dni_usuario +" "+  fecha_devolucion;
    }
}
