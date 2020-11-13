/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.AlumnoDTO;
import modelo.Conexion;

/**
 *
 * @author f_fig
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        Connection con = Conexion.obtenerConexion();

        String query = "SELECT * FROM '?' WHERE login = ? AND clave = ? ";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, "ALUMNO");
        ps.setString(2, "al");
        ps.setString(3, "alumno1");
        ResultSet rs = ps.executeQuery();

        //String query2 = "SELECT * FROM alumno WHERE login = 'al' AND clave = 'alumno1' ";
       //PreparedStatement ps = con.prepareStatement(query2);
        ArrayList<AlumnoDTO> alumnos = new ArrayList<>();

        //ResultSet rs = ps.executeQuery(query2);
        rs.next();
        System.out.println(rs.getString("nombre"));

    }

}
