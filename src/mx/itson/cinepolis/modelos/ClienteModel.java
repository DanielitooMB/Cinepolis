/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cinepolis.modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import mx.itson.cinepolis.conexion.ConexionBD;
import mx.itson.cinepolis.entidades.Cliente;


/**
 *
 * @author miria
 */
public class ClienteModel {
    
    ConexionBD con = new ConexionBD();
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    
    public boolean crear(Cliente cliente){
       try {
            // Convertir fecha y booleano a formatos SQL
            String fechaCumpleanosStr = cliente.getFechaCumpleanos().format(FORMATTER);
            int recibirPublicidadInt = cliente.isRecibirPublicidad() ? 1 : 0;
            // Ejecutar consulta de inserción
            con.query("INSERT INTO clientes(nombres, apellidos, recibir_publicidad, correo, fecha_cumple, ciudad, contrasenia) "
                      + "VALUES ('" + cliente.getNombre() + "','" + cliente.getApellido() + "', "
                      + recibirPublicidadInt + ",'" + cliente.getCorreo() + "','"
                      + fechaCumpleanosStr + "','" + cliente.getCiudad() + "','"
                      + cliente.getContrasenia() + "')");
            return true;
        } catch (Exception e) {
            System.err.println("Error al crear cliente: " + e.getMessage());
            return false;
        }
    }
    
    public boolean editar(Cliente cliente){  
              try {
            String fechaCumpleanosStr = cliente.getFechaCumpleanos().format(FORMATTER);
            int recibirPublicidadInt = cliente.isRecibirPublicidad() ? 1 : 0;
            // Actualizar registro (condición por nombres y apellidos porque no se usa ID)
            con.query("UPDATE clientes SET apellidos='" + cliente.getApellido() 
                      + "', recibir_publicidad=" + recibirPublicidadInt
                      + ", correo='" + cliente.getCorreo() 
                      + "', fecha_cumple='" + fechaCumpleanosStr
                      + "', ciudad='" + cliente.getCiudad() 
                      + "', contrasenia='" + cliente.getContrasenia() 
                      + "' WHERE nombres='" + cliente.getNombre() 
                      + "' AND apellidos='" + cliente.getApellido() + "'");
            return true;
        } catch (Exception e) {
            System.err.println("Error al editar cliente: " + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminar(Cliente cliente){
              try {
            // Eliminar registro (se usa nombre+apellido)
            con.query("DELETE FROM clientes WHERE nombres='" + cliente.getNombre()
                      + "' AND apellidos='" + cliente.getApellido() + "'");
            return true;
        } catch (Exception e) {
            System.err.println("Error al eliminar cliente: " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Cliente> listar(){
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            ResultSet rs = con.select("SELECT * FROM clientes");
            while(rs.next()){
                boolean recibirPublicidad = rs.getBoolean("recibir_publicidad");
                java.sql.Date fechaSQL = rs.getDate("fecha_cumple");
                java.time.LocalDate fechaCumpleanos = (fechaSQL != null) ? fechaSQL.toLocalDate() : null;
                Cliente c = new Cliente(
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    recibirPublicidad,
                    rs.getString("correo"),
                    fechaCumpleanos,
                    rs.getString("ciudad"),
                    rs.getString("contrasenia")
                );
                lista.add(c);
            }
        } catch (SQLException ex) {
            System.err.println("Error al listar clientes: " + ex.getMessage());
        }        
        return lista; 
    }
    
}
