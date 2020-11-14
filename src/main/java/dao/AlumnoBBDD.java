/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
            String query = "SELECT p.nombre , apellido, a.nombre asignatura " +
            "FROM profesor p JOIN asignatura a ON p.id = a.profesor_id " +
            "WHERE a.id IN(SELECT asignatura_id FROM matricula WHERE alumno_id = ?) ";

            PreparedStatement ps = con.prepareStatement(query);
            ArrayList<ProfesorDTO> profesores = new ArrayList<>();
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
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
            String query = "SELECT DISTINCT nombre, apellido FROM matricula m JOIN alumno a ON m.alumno_id = a.id "
                    + "WHERE asignatura_id IN(SELECT asignatura_id FROM matricula WHERE alumno_id = ?)"
                    + " MINUS (SELECT nombre, apellido FROM alumno WHERE id = ?)";

            ArrayList<AlumnoDTO> alumnos = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idAlumno);
            ResultSet rs = ps.executeQuery();
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
            String query = "SELECT DISTINCT nombre, asignatura_id FROM asignatura a JOIN matricula m ON m.asignatura_id = a.id WHERE alumno_id = ?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ArrayList<AsignaturaDTO> asignatura = new ArrayList<>();

            ResultSet rs = ps.executeQuery();
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
    public ArrayList<Double> listarNotasAsignatura(int idAsign, int idAlum) {
        Connection con = Conexion.obtenerConexion();
        try {

            String query = "SELECT nota FROM matricula WHERE alumno_id = ?"
                    + " AND asignatura_id= ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idAlum);
            ps.setInt(2, idAsign);
            ResultSet rs = ps.executeQuery();

            ArrayList<Double> notas = new ArrayList<>();
            while (rs.next()) {
                double nota = rs.getDouble("nota");
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

    @Override
    public List listar() {
        try {
            ArrayList<AlumnoDTO> lista = new ArrayList<>();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM", "progra", "Humano12");
            PreparedStatement stmt = conexion.prepareStatement("select * from alumno");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AlumnoDTO al = new AlumnoDTO();
                al.setId(rs.getInt("id"));
                al.setUsername(rs.getString("usuario"));
                al.setPassword(rs.getString("password"));
                al.setIdNivel(rs.getInt("Idnivel"));
                al.setNombre(rs.getString("nombre"));
                al.setApellido(rs.getString("apellido"));
                lista.add(al);
            }
            return lista;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error " + e);
        }
        return null;
    }

    @Override
    public AlumnoDTO list(int id) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM", "progra", "Humano12");
            PreparedStatement stmt = conexion.prepareStatement("select * from alumno where id=" + id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AlumnoDTO al = new AlumnoDTO();
                al.setId(rs.getInt("id"));
                al.setUsername(rs.getString("usuario"));
                al.setPassword(rs.getString("password"));
                al.setIdNivel(rs.getInt("Idnivel"));
                al.setNombre(rs.getString("nombre"));
                al.setApellido(rs.getString("apellido"));

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error " + e);
        }
        return null;
    }

    @Override
    public boolean add(AlumnoDTO userA) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM", "progra", "Humano12");
            PreparedStatement stmt = conexion.prepareStatement("Insert into alumno(usuario, password, nombre, apellido) values('"
                    + userA.getUsername() + "','"
                    + userA.getPassword() + "','"
                    + userA.getIdNivel() + "','"
                    + userA.getNombre() + "','"
                    + userA.getApellido()
                    + "')");
            stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return false;
    }

    @Override
    public boolean edit(AlumnoDTO userA) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM", "progra", "Humano12");
            PreparedStatement stmt = conexion.prepareStatement("update alumno set usuario='" + userA.getUsername()
                    + "',password='" + userA.getPassword()
                    + "',Idnivel='" + userA.getIdNivel()
                    + "',nombre='" + userA.getNombre()
                    + "',apellido='" + userA.getApellido()
                    + "'where id='" + userA.getId() + "'");
            stmt.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al editar " + e);
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM", "progra", "Humano12");
            PreparedStatement stmt = conexion.prepareStatement("delete from alumno where id='" + id + "'");
            stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al editar " + e);
        }
        return false;
    }

}
