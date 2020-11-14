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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author f_fig
 */
public class Sesion {

    private static Sesion sesion = null;
    private User usuario;

    private Sesion() {

    }

    public static void main(String[] args) {

    }

    private Sesion(User usuario) {
        this.usuario = usuario;
    }

    public static Sesion obtenerSesionActual() {
        if (sesion == null) {
            sesion = new Sesion();
            return sesion;
        } else {
            return sesion;
        }
    }

    public static User validarUsuario(String usuario, String contraseña, String cargo) {

        
        Connection con = Conexion.obtenerConexion();
        String query = "";
        if ("Alumno".equals(cargo)) {
            query = "SELECT * FROM alumno WHERE login = ? AND clave = ? ";
        } else if ("Profesor".equals(cargo)) {
            query = "SELECT * FROM profesor WHERE login = ? AND clave = ? ";
        } else if ("Administrador".equals(cargo)) {
            query = "SELECT * FROM administrador WHERE login = ? AND clave = ? ";
        } else {
            return null;
        }
       

        try {
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //Crear el usuario para almacenarlo en la sesion
                User us = new User();
                int id = rs.getInt("id");
                us.setId(id);
                Sesion.obtenerSesionActual().setUsuario(us);
                return us;
            } else {
                return null;
            }

        } catch (SQLException ex) {
            return null;
        }

    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

}
