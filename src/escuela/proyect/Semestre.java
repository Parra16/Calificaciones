/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela.proyect;

/**
 *
 * @author PARRA
 */
public class Semestre {
    private int semestre ;
    private int id;
    private int Nomaterias;
    private int Nomateriasapro;
    private int Nomateriasrepro;
    private boolean bactive;

    public Semestre(int semestre, int id, int Nomaterias, int Nomateriasapro, int Nomateriasrepro, boolean bactive) {
        this.semestre = semestre;
        this.id = id;
        this.Nomaterias = Nomaterias;
        this.Nomateriasapro = Nomateriasapro;
        this.Nomateriasrepro = Nomateriasrepro;
        this.bactive = bactive;
    }

    public Semestre(int semestre, boolean bactive) {
        this.semestre = semestre;
        this.bactive = bactive;
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

    public int getNomaterias() {
        return Nomaterias;
    }

    public void setNomaterias(int Nomaterias) {
        this.Nomaterias = Nomaterias;
    }

    public int getNomateriasapro() {
        return Nomateriasapro;
    }

    public void setNomateriasapro(int Nomateriasapro) {
        this.Nomateriasapro = Nomateriasapro;
    }

    public int getNomateriasrepro() {
        return Nomateriasrepro;
    }

    public void setNomateriasrepro(int Nomateriasrepro) {
        this.Nomateriasrepro = Nomateriasrepro;
    }

    public boolean isBactive() {
        return bactive;
    }

    public void setBactive(boolean bactive) {
        this.bactive = bactive;
    }
    
    
}
