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
public class Usuario {
    private int id;
    private String usuario;
    private String contrasenia;
    private String semestre_actual;
    private boolean bactive ;
    private String correo;
    private int idcarrera;
    private int tipo_usuario;

    public Usuario(int id, String usuario, String contrasenia, String semestre_actual, String correo, int idcarrera) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.semestre_actual = semestre_actual;
        this.correo = correo;
        this.idcarrera = idcarrera;
    }
    

    
    
    public Usuario(int id, String usuario, String contrasenia, String semestre,String correo) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.semestre_actual = semestre;
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

    public String getSemestre() {
        return semestre_actual;
    }

    public void setSemestre(String semestre) {
        this.semestre_actual = semestre;
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

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    
    
    
    
}
