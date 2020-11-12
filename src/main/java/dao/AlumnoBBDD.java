/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.AlumnoDTO;
import modelo.Conexion;
import modelo.NotaDTO;
import modelo.ProfesorDTO;
import modelo.Sesion;

/**
 *
 * @author f_fig
 */
public class AlumnoBBDD implements AlumnoDAO {

    @Override
    public ArrayList<ProfesorDTO> listarProfesores(int idAlumno) {
        return null;
    }

    @Override
    public ArrayList<AlumnoDTO> listarAlumnos(int idAlumno) {
        //Sesion sesion = Sesion.obtenerSesionActual();
        //int id = sesion.getUsuario().getId();
        Connection con = Conexion.obtenerConexion();
        try {
            /*String query = "SELECT nombre, apellido FROM alumno a1 JOIN matricula m1 ON "
                    + " m.alumno_id = a1.id = m1.alumno_id "
                    + "WHERE asignatura_id IN(SELECT asignatura_id FROM alumno a"
                    + "JOIN  matricula m ON a.id = m.alumno_id WHERE alumno_id = ?)";*/
            String query2 = "SELECT * FROM employees";
            PreparedStatement ps = con.prepareStatement(query2);
            ArrayList<AlumnoDTO> alumnos = new ArrayList<>();
            //ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery(query2);
            while (rs.next()) {
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");
                AlumnoDTO al = new AlumnoDTO();
                al.setNombre(nombre);
                al.setApellido(apellido);
                alumnos.add(al);

            }
            return alumnos;
        } catch (SQLException ex) {
            return null;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnoBBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public ArrayList<NotaDTO> listarNotas(int idAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
