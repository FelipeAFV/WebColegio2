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
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM","hr","Humano12");
            PreparedStatement stmt = conexion.prepareStatement("SELECT * FROM employees");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                ProfesorDTO prof = new ProfesorDTO();
                prof.setId(rs.getInt("employee_id"));
                prof.setName(rs.getString("first_name"));
                prof.setLast_name(rs.getString("last_name"));
                lista.add(prof);
            }
            return lista;
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
        
        
    }
    
}
