/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author f_fig
 */
public class Sesion {
    /*
    private static Sesion sesion;
    private Usuario usuario;
    
    private Sesion() {
        
    }
    public static void main(String[] args) {
       
    }
    
    private Sesion(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public static Sesion obtenerSesionActual() {
        if (sesion != null) {
            return sesion;
        } else {
            return new Sesion();
        }
    }
    
    /*public static Usuario validarUsuario(String usuario, String contraseña, String cargo) {
        
        Usuario us =null;
        Connection con = Conexion.obtenerConexion();
        String query = "SELECT * FROM ? WHERE login = ? AND contraseña = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cargo);
            ps.setString(2, usuario);
            ps.setString(3, contraseña);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //Crear el usuario para almacenarlo en la sesion
                Sesion.obtenerSesionActual().setUsuario(us);
                return us;
            } else {
                return null;
            }
            
        } catch (SQLException ex) {
            return; 
        }
        if (cargo == "Profesor") {
            
        } else if ( cargo == "Alumno") {
            
        } else if ( cargo == "Administrador") {
            
        }
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }*/
    
    
    
    
}
