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
    private static String user;
    private static String password;
    private static String url;

    private Conexion() {

    }

    public static Connection obtenerConexion() {
        try {
            if (conn.isClosed()) {
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
