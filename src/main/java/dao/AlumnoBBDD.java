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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.AlumnoDTO;
import modelo.AsignaturaDTO;
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
        Connection con = Conexion.obtenerConexion();
        try {
            String query = "SELECT p.nombre , apellido, a.nombre asignatura"
                    + " FROM profesor p JOIN asignatura a ON p.id = a.profesor_id";

            Statement ps = con.createStatement();
            ArrayList<ProfesorDTO> profesores = new ArrayList<>();
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String asignatura = rs.getString("asignatura");
                ProfesorDTO profe = new ProfesorDTO();
                profe.setName(nombre);
                profe.setLast_name(apellido);
                profe.setAsignatura(asignatura);
                profesores.add(profe);

            }
            return profesores;
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
    public ArrayList<AlumnoDTO> listarAlumnos(int idAlumno) {

        Connection con = Conexion.obtenerConexion();
        try {
            String query = "SELECT * FROM alumno";

            Statement ps = con.createStatement();
            ArrayList<AlumnoDTO> alumnos = new ArrayList<>();
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
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
    public ArrayList<AsignaturaDTO> listarAsignaturas(int idAlumno) {
        
        Connection con = Conexion.obtenerConexion();
        try {
            String query = "SELECT DISTINCT nombre, asignatura_id FROM asignatura a JOIN matricula m ON m.asignatura_id = a.id WHERE alumno_id = 20";

            //PreparedStatement ps = con.prepareStatement(query);
            //ps.setInt(1, idAlumno);
            ArrayList<AsignaturaDTO> asignatura = new ArrayList<>();
            
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int idAsig = rs.getInt("asignatura_id");
                AsignaturaDTO asig = new AsignaturaDTO();
                asig.setNombre(nombre);
                asig.setId(idAsig);
                asignatura.add(asig);

            }
            return asignatura;
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
    public ArrayList<Integer> listarNotasAsignatura(int idAsign, int idAlum) {
        Connection con = Conexion.obtenerConexion();
        try {
            
            String query = "SELECT nota FROM matricula WHERE alumno_id = ?"
                    + " AND asignatura_id= ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idAlum);
            ps.setInt(2, idAsign);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<Integer> notas = new ArrayList<>();
            while (rs.next()) {
                int nota = rs.getInt("nota");
                notas.add(nota);
                
            }
            return notas;
            
        } catch (Exception ex) {
            return null;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnoBBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
