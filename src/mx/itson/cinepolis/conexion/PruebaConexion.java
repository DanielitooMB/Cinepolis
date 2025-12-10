/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cinepolis.conexion;

/**
 *
 * @author miria
 */
public class PruebaConexion {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        
        // Si imprime "Conexión exitosa", todo está listo.
        conexion.getConnection();
    }
}
