/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.AlumnoDTO;
import modelo.AsignaturaDTO;
import modelo.ProfesorDTO;
import modelo.ProfesorJoinDTO;

/**
 *
 * @author samuel
 */
public class ProfesorBBDD implements ProfesorDAO{

    @Override
    public List listar() {
        try{
            ArrayList<ProfesorDTO> lista = new ArrayList<>();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM","progra","Humano12");
            PreparedStatement stmt = conexion.prepareStatement("SELECT * FROM profesor");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                ProfesorDTO prof = new ProfesorDTO();
                prof.setId(rs.getInt("id"));
                prof.setName(rs.getString("nombre"));
                prof.setLast_name(rs.getString("apellido"));
                lista.add(prof);
            }
            return lista;
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
        
        
    }

    @Override
    public List listarasignaturas() {
        
        try{
            ArrayList<AsignaturaDTO> lista = new ArrayList<>();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM","progra","Humano12");
            PreparedStatement stmt = conexion.prepareStatement("SELECT * FROM asignatura WHERE profesor_id = 1");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                AsignaturaDTO asig = new AsignaturaDTO();
                asig.setId(rs.getInt("id"));
                asig.setNombre(rs.getString("nombre"));
                lista.add(asig);
            }
            return lista;
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
        
    }

    @Override
    public List listaralumnosasignatura(int idasig) {
        
        try{
            ArrayList<ProfesorJoinDTO> lista = new ArrayList<>();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM","progra","Humano12");
            PreparedStatement stmt = conexion.prepareStatement("SELECT m.alumno_id,m.asignatura_id,al.nombre,al.apellido,m.trimestre,m.nota FROM asignatura a join matricula m on (a.id = m.asignatura_id) join alumno al on(m.alumno_id = al.id) WHERE a.id = ?");
            stmt.setInt(1, idasig);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                ProfesorJoinDTO profj = new ProfesorJoinDTO();
                profj.setId_alumno(rs.getInt("alumno_id"));
                profj.setId_asignatura(rs.getInt("asignatura_id"));
                profj.setNombre(rs.getString("nombre"));
                profj.setApellido(rs.getString("apellido"));
                profj.setTrimestre(rs.getInt("trimestre"));
                profj.setNota(rs.getDouble("nota"));
                lista.add(profj);
            }
            return lista;
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }

    @Override
    public boolean updatearnota(int id,int asignatura_id,double nota) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM","progra","Humano12");
            PreparedStatement stmt = conexion.prepareStatement("Update matricula set nota = ? WHERE alumno_id = ? AND asignatura_id = ?");
            stmt.setDouble(1, nota);
            stmt.setInt(2, id);
            stmt.setInt(3, asignatura_id);
            stmt.executeUpdate();
            
            return true;
        }catch(ClassNotFoundException | SQLException e){
            return false;
        }
    }
    
}
