/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author f_fig
 */
public class Conexion {

    private static Connection conn;
    private static String user = "HR";
    private static String password = "190298";
    private static String url = "jdbc:oracle:thin:@localhost:1521:BBDDEJ";

    private Conexion() {

    }

    public static Connection obtenerConexion() {
        try {
            if (conn == null || conn.isClosed() ) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                return conn;
            }
        } catch (Exception e) {
            return null;
        }
    }

}
