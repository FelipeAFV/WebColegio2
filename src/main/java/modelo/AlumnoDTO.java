/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author f_fig
 */
public class AlumnoDTO extends User  {
    
    private int idNivel;
    private String nombre;
    private String apellido;

    public AlumnoDTO() {
    }

    
    public AlumnoDTO(int id, String usuario, String contraseña, String nombre, String apellido,int idNivel) {
        super(id,usuario,contraseña);
        this.idNivel = idNivel;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
    
}
