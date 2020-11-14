package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.AsignaturaDTO;

/**
 *
 * @author jvarg
 */
public class AdminBBDD implements AdminDAO {

    @Override
    public List listar() {
        ArrayList<AsignaturaDTO> list = new ArrayList<>();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:BBDDSAM", "progra", "Humano12");
            PreparedStatement stmt = conexion.prepareStatement("select * from asignatura");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                AsignaturaDTO asig = new AsignaturaDTO();
                asig.setId(rs.getInt("id"));
                asig.setNivel_id(rs.getInt("nivel_id"));
                asig.setProfesor_id(rs.getInt("profesor_id"));
                asig.setNombre(rs.getString("nombre"));
                list.add(asig);
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error " + e);
            return null;
        }
    }

    @Override
    public AsignaturaDTO list(int id) {
        AsignaturaDTO a = new AsignaturaDTO();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:orcl","user","256980");
            PreparedStatement stmt = conexion.prepareStatement("select * from asignatura where id="+id);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                a.setId(rs.getInt("id"));
                a.setNivel_id(rs.getInt("nivel_id"));
                a.setProfesor_id(rs.getInt("profesor_id"));
                a.setNombre(rs.getString("nombre"));
                
            }
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar" + e);
        }
        return a;
    }

    @Override
    public boolean add(AsignaturaDTO asig) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:orcl", "user", "256980");
            PreparedStatement stmt = conexion.prepareStatement("Insert into asignatura(nivel_id, profesor_id, nombre) values('"
                    + asig.getNivel_id() + "','"
                    + asig.getProfesor_id() + "','"
                    + asig.getNombre()
                    + "')");
            stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al agregar " + e);
        }
        return false;

    }

    @Override
    public boolean edit(AsignaturaDTO asig) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:orcl", "user", "256980");
            PreparedStatement stmt = conexion.prepareStatement("update asignatura set nivel_id='" + asig.getNivel_id()
                    + "',profesor_id='" + asig.getProfesor_id()
                    + "',nombre='" + asig.getNombre()
                    + "'where id='" + asig.getId() + "'");
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
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1525:orcl","user","256980");
            PreparedStatement stmt = conexion.prepareStatement("delete from asignatura where id='"+id+"'");
            stmt.executeUpdate();
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al borrar "+e);
        }
        return false;
    }

}
