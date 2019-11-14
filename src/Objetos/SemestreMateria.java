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
public class SemestreMateria {
    private int id_semestreMateria;
    private int id_ctrlSemestre;
    private int id_materia;
    private int parcial1;
    private int parcial2;
    private int Ordinario;
    private int extra;
    private int titulo;
    private int tipo_aprovacion;

    public SemestreMateria(int id_semestreMateria, int id_ctrlSemestre, int id_materia, int parcial1, int parcial2, int Ordinario, int extra, int titulo, int tipo_aprovacion) {
        this.id_semestreMateria = id_semestreMateria;
        this.id_ctrlSemestre = id_ctrlSemestre;
        this.id_materia = id_materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.Ordinario = Ordinario;
        this.extra = extra;
        this.titulo = titulo;
        this.tipo_aprovacion = tipo_aprovacion;
    }

    public int getId_semestreMateria() {
        return id_semestreMateria;
    }

    public void setId_semestreMateria(int id_semestreMateria) {
        this.id_semestreMateria = id_semestreMateria;
    }

    public int getId_ctrlSemestre() {
        return id_ctrlSemestre;
    }

    public void setId_ctrlSemestre(int id_ctrlSemestre) {
        this.id_ctrlSemestre = id_ctrlSemestre;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public int getParcial1() {
        return parcial1;
    }

    public void setParcial1(int parcial1) {
        this.parcial1 = parcial1;
    }

    public int getParcial2() {
        return parcial2;
    }

    public void setParcial2(int parcial2) {
        this.parcial2 = parcial2;
    }

    public int getOrdinario() {
        return Ordinario;
    }

    public void setOrdinario(int Ordinario) {
        this.Ordinario = Ordinario;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public int getTipo_aprovacion() {
        return tipo_aprovacion;
    }

    public void setTipo_aprovacion(int tipo_aprovacion) {
        this.tipo_aprovacion = tipo_aprovacion;
    }
    
    
    
    
}
