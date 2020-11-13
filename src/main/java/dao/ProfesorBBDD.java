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

       
    //Metodos para el admin
    

    @Override
    public ProfesorDTO list(int id) {
        ProfesorDTO pf = new ProfesorDTO();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM","progra","Humano12");
            PreparedStatement stmt = conexion.prepareStatement("select * from profesor where id="+id);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                pf.setId(rs.getInt("id"));
                pf.setUsername(rs.getString("usuario"));
                pf.setPassword(rs.getString("password"));
                pf.setName(rs.getString("nombre"));
                pf.setLast_name(rs.getString("apellido"));
                pf.setEmail(rs.getString("email"));
                pf.setSpecialist(rs.getString("especialidad"));
                
            }
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar" + e);
        }
        return pf;
        
    }

    @Override
    public boolean add(ProfesorDTO userP) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM","progra","Humano12");
            PreparedStatement stmt = conexion.prepareStatement("Insert into profesor(usuario, password, nombre, apellido, email, especialidad) values('"
                
                +userP.getUsername()+"','"
                +userP.getPassword()+"','"
                +userP.getName()+"','"
                +userP.getLast_name()+"','"
                +userP.getEmail()+"','"
                +userP.getSpecialist()
                +"')");
            stmt.executeUpdate();
        } catch(ClassNotFoundException | SQLException e) {
        }
        return false;
        
    }

    @Override
    public boolean edit(ProfesorDTO userP) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM","progra","Humano12");
            PreparedStatement stmt = conexion.prepareStatement("update profesor set usuario='"+userP.getUsername()
                +"',password='"+userP.getPassword()
                +"',nombre='"+userP.getName()
                +"',apellido='"+userP.getLast_name()
                +"',email='"+userP.getEmail()
                +"',especialidad='"+userP.getSpecialist()
                +"'where id='"+userP.getId()+"'");
            stmt.executeUpdate();
                    
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al editar "+e);
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM","progra","Humano12");
            PreparedStatement stmt = conexion.prepareStatement("delete from profesor where id='"+id+"'");
            stmt.executeUpdate();
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al editar "+e);
        }
        return false;
    }
    
}
