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
import java.util.ArrayList;
import java.util.List;
import modelo.AlumnoDTO;
import modelo.AsignaturaDTO;
import modelo.Conexion;
import modelo.MatriculaDTO;
//import modelo.Sesion;

/**
 *
 * @author jvarg
 */
public class MatriculaBBDD implements MatriculaDAO {
    MatriculaDTO m = new MatriculaDTO();
    @Override
    public List listar() {
        ArrayList<MatriculaDTO> list = new ArrayList<>();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "admini", "12345");
            //Connection conexion = Conexion.obtenerConexion();
            PreparedStatement stmt = conexion.prepareStatement("SELECT * FROM matricula");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                MatriculaDTO m = new MatriculaDTO();
                m.setAlumno_id(rs.getInt(1));
                m.setAsignatura_id(rs.getInt(2));
                m.setTrimestre(rs.getInt(3));
                m.setNota(rs.getDouble(4));
                list.add(m);
            }
            return list;
        } catch (SQLException |ClassNotFoundException e) {
            return null;
        }
    }

    @Override
    public MatriculaDTO list(int id_alumno) {
        MatriculaDTO mat = new MatriculaDTO();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","admini","12345");
            PreparedStatement stmt = conexion.prepareStatement("select * from matricula where alumno_id="+id_alumno);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                mat.setAlumno_id(rs.getInt(1));
                mat.setAsignatura_id(rs.getInt(2));
                mat.setTrimestre(rs.getInt(3));
                mat.setNota(rs.getDouble(4));
                
            }
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar" + e);
        }
        return mat;
    }

    @Override
    public boolean add(MatriculaDTO m) {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","admini","12345");
            PreparedStatement stmt = conexion.prepareStatement("Insert into matricula(alumno_id, asignatura_id, trimestre, nota) values(?,?,?,?)");
            stmt.setInt(1, m.getAlumno_id());
            stmt.setInt(2, m.getAsignatura_id());
            stmt.setInt(3, m.getTrimestre());
            stmt.setDouble(4, m.getNota());
            stmt.executeUpdate();

        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("error "+e);
        }
        return false;
    }

    @Override
    public boolean editar(int id,int asignatura_id,int trimestre,double nota) {
       
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","admini","12345");
            PreparedStatement stmt = conexion.prepareStatement("update matricula set alumno_id=?, asignatura_id=?,trimestre=?, nota=? where alumno_id=?");
            stmt.setInt(1,id);
            stmt.setInt(2, asignatura_id);
            stmt.setInt(3, trimestre);
            stmt.setDouble(4, nota);
            stmt.executeUpdate();
            return true;
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al editar "+e);
            return false;
        }

    }

    @Override
    public boolean eliminar(int id_alumno) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","admini","12345");
            PreparedStatement stmt = conexion.prepareStatement("delete from matricula where alumno_id="+id_alumno);
            stmt.executeUpdate();
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al borrar "+e);
        }
        return false;
    }

}
