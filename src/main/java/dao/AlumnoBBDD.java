/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.AlumnoDTO;
import modelo.Conexion;
import modelo.Sesion;

/**
 *
 * @author f_fig
 */
public class AlumnoBBDD  {
/*
    @Override
    public ArrayList<Profesor> listarProfesores(int idAlumno) {

    }

    @Override
    public ArrayList<AlumnoDTO> listarAlumnos(int idAlumno) {
        Sesion sesion = Sesion.obtenerSesionActual();
        int id = sesion.getUsuario().getID();
        String query = "SELECT nombre, apellido FROM alumnos NATURAL JOIN matricula"
                + "WHERE asignatura_id IN(SELECT asignatura_id FROM alumnos"
                + " NATURAL JOIN matricula WHERE alumno_id = ?)";
        PreparedStatement ps = Conexion.obtenerConexion().prepareStatement(query);
        Usuario us = Sesion.obtenerSesionActual().getUsuario();
        ps.setInt(1,us.getId());
        ResultSet rs = ps.executeQuery(query);
        
        while (rs.next()) {
            
        }
    }

    @Override
    public ArrayList<Nota> listarNotas(int idAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

}
