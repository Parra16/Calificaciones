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
public class Carrera {
    private int folio; 
    private String nombre; 
    private String abreviatura;

    public Carrera(int folio, String nombre) {
        this.folio = folio;
        this.nombre = nombre;
    }

    
    
    public Carrera(int folio, String nombre, String etiqueta) {
        this.folio = folio;
        this.nombre = nombre;
        this.abreviatura = etiqueta;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEtiqueta() {
        return abreviatura;
    }

    public void setEtiqueta(String etiqueta) {
        this.abreviatura = etiqueta;
    }
    
    
    
    
    
    
}
