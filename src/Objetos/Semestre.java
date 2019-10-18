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
public class Semestre {
    private int semestre ;
    private int id;


    public Semestre(int semestre, int id) {
        this.semestre = semestre;
        this.id = id;
        
    }

    public Semestre(int semestre, boolean bactive) {
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
