
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.AsignaturaDTO;


public class AsignaturaBBDD implements AsignaturaDAO{
    AsignaturaDTO asi = new AsignaturaDTO();
    @Override
    public List listar() {
        ArrayList<AsignaturaDTO> list = new ArrayList<>();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "admini", "12345");
            //Connection conexion = Conexion.obtenerConexion();
            PreparedStatement stmt = conexion.prepareStatement("SELECT * FROM matricula");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AsignaturaDTO as = new AsignaturaDTO();
                as.setId(rs.getInt(1));
                as.setNombre(rs.getString(2));
                as.setProfesor_id(rs.getInt(3));
                list.add(as);
            }
            return list;
        } catch (SQLException |ClassNotFoundException e) {
            return null;
        }
    }

    @Override
    public AsignaturaDTO list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(AsignaturaDTO ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editar(int asignatura_id,String nombre,int idprofe) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","admini","12345");
            PreparedStatement stmt = conexion.prepareStatement("update asignatura set id=?, nombre=?,profesor_id=? where id=?");
            stmt.setInt(1,asignatura_id);
            stmt.setString(2, nombre);
            stmt.setInt(3, idprofe);
            stmt.executeUpdate();
            return true;
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al editar "+e);
            return false;
    }
        
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
