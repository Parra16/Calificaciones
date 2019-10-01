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
public class Usuario {
    private int id;
    private String usuario;
    private String contrasenia;
    private int semestre;
    private boolean bactive ;
    private String correo;

    public Usuario(int id, String usuario, String contrasenia, int semestre,String correo) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.semestre = semestre;
        this.bactive=true;
        this.correo=correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public boolean isBactive() {
        return bactive;
    }

    public void setBactive(boolean bactive) {
        this.bactive = bactive;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
}
