/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
        Sesion sesion = Sesion.obtenerSesionActual();
        int id = sesion.getUsuario().getId();

        try {
            String query = "SELECT nombre, apellido FROM alumnos NATURAL JOIN matricula"
                    + "WHERE asignatura_id IN(SELECT asignatura_id FROM alumnos"
                    + " NATURAL JOIN matricula WHERE alumno_id = ?)";
            PreparedStatement ps = Conexion.obtenerConexion().prepareStatement(query);
            ArrayList<AlumnoDTO> alumnos = new ArrayList<>();
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int idAlum = rs.getInt("id");
                String login = rs.getString("login");
                String clave = rs.getString("clave");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int idNivel = rs.getInt("nivel_id");
                AlumnoDTO al = new AlumnoDTO(id, login, clave, nombre, apellido,idNivel);
                alumnos.add(al);

            }
            return alumnos;
        } catch (SQLException ex) {
            return null;
        }

    }

    @Override
    public ArrayList<NotaDTO> listarNotas(int idAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
