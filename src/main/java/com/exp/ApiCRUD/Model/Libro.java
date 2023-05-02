package com.exp.ApiCRUD.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idlib;      // id del Libro
    private String titlib;  // titulo del Libro
    private int idedi;      // id del Editorial del Libro
    private int aniopub;    // año de publicacion del libro
    private String temlib;  // tema del libro (descripcion)
    private String idiolib; // idioma del libro
    
    public Libro() {
    }

    public Libro(int idlib, String titlib, int idedi, int aniopub, String temlib, String idiolib) {
        this.idlib = idlib;
        this.titlib = titlib;
        this.idedi = idedi;
        this.aniopub = aniopub;
        this.temlib = temlib;
        this.idiolib = idiolib;
    }

    public int getIdlib() {
        return idlib;
    }

    public void setIdlib(int idlib) {
        this.idlib = idlib;
    }

    public String getTitlib() {
        return titlib;
    }

    public void setTitlib(String titlib) {
        this.titlib = titlib;
    }

    public int getIdedi() {
        return idedi;
    }

    public void setIdedi(int idedi) {
        this.idedi = idedi;
    }

    public int getAniopub() {
        return aniopub;
    }

    public void setAniopub(int aniopub) {
        this.aniopub = aniopub;
    }

    public String getTemlib() {
        return temlib;
    }

    public void setTemlib(String temlib) {
        this.temlib = temlib;
    }

    public String getIdiolib() {
        return idiolib;
    }

    public void setIdiolib(String idiolib) {
        this.idiolib = idiolib;
    }

    
}
