package com.example.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Libros {

    private int id_libro;

    private String titulo;

    private int isbn;

    private String autor;

    private String Tematica;

    private String FechaEdicion;



    public Libros(int id_libro, String titulo, int isbn, String autor, String tematica, String fechaEdicion) {
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        Tematica = tematica;
        FechaEdicion = fechaEdicion;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTematica() {
        return Tematica;
    }

    public void setTematica(String tematica) {
        Tematica = tematica;
    }

    public String getFechaEdicion() {
        return FechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        FechaEdicion = fechaEdicion;
    }

    @Override
    public String toString() {
        return titulo +" "+ autor +" "+ Tematica ;
    }
}
