/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author PARRA
 */
public class Materia {
    private int id;
    private String nombre;
    private String observaciones;
    private String abreviatura;
    private String profesor;
    private int creditos;
    private boolean bactive;

    public Materia(int id, String nombre, String observaciones, String abreviatura, String profesor,int creditos, boolean bactive) {
        this.id = id;
        this.nombre = nombre;
        this.observaciones = observaciones;
        this.abreviatura = abreviatura;
        this.profesor = profesor;
        this.creditos = creditos;
        this.bactive= bactive;
    }

    public Materia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public boolean isBactive() {
        return bactive;
    }

    public void setBactive(boolean bactive) {
        this.bactive = bactive;
    }
    
    
    
}
