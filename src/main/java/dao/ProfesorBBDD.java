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
            ArrayList<AlumnoDTO> lista = new ArrayList<>();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM","progra","Humano12");
            PreparedStatement stmt = conexion.prepareStatement("SELECT * FROM asignatura WHERE id = ?");
            stmt.setInt(1, idasig);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                AlumnoDTO alum = new AlumnoDTO();
                alum.setId(rs.getInt("id"));
                lista.add(alum);
            }
            return lista;
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
    
}
