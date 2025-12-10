/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cinepolis.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mariadb://localhost:3306/cinepolis";

    //"Credenciales" de MariaDB
    private static final String USER = "root";
    private static final String PASSWORD = "maria"; 

    public Connection getConnection() {
        Connection connection = null;
        try {
            // Intento de conexión usando el DriverManager
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos Cinepolis");
            
        } catch (SQLException ex) {
            // Manejo de errores
            System.out.println("Error en la conexión: " + ex.getMessage());
        }
        
        return connection;
    }
}
