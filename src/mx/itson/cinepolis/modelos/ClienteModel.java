/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cinepolis.modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mx.itson.cinepolis.conexion.ConexionBD;
import mx.itson.cinepolis.entidades.Cliente;


/**
 *
 * @author miria
 */
public class ClienteModel {
    
    ConexionBD con = new ConexionBD();
    
    public boolean crear(Cliente cliente){
        try {
            con.query("INSERT INTO clientes(id_clientes,nombres,apellidos,recibir_publicidad,correo,fecha_cumple,ciudad,contrasenia)"
            + " values ('"+cliente.getId()+"','"+cliente.getNombre()+"','"+cliente.getApellido()+"',"
                    + "'"+cliente.isRecibirPublicidad()+"','"+cliente.getCorreo()+"',"
                            + "'"+cliente.getFechaCumpleanos()+"','"+cliente.getCiudad()+"',"
                                    + "'"+cliente.getContrasenia()+"')");
        return true;
            } catch (Exception e) { 
        return false;       
        } 
    }
    
    public void editar(){  
    }
    
    public void eliminar(){
        
    }
    
    public ArrayList<Cliente> listar(){
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            ResultSet rs = con.select( "SELECT * FROM clientes");

            
            while(rs.next()){ 
                //primero se saca de la base de datos recibirpublicidad primero
                boolean recibirPublicidad = rs.getBoolean("recibir_publicidad");
            
                java.sql.Date fechaSQL = rs.getDate("fecha_cumple");
                java.time.LocalDate fechaCumpleanos = (fechaSQL != null) ? fechaSQL.toLocalDate() : null;
                
        Cliente c = new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        recibirPublicidad,
                        rs.getString("correo"),
                        fechaCumpleanos,
                        rs.getString("ciudad"),
                        rs.getString("contrasenia")
                    );
            }
        } catch (SQLException ex) {
            System.err.println("Error al listar clientes: " + ex.getMessage());
        }        
        return lista; 
    }
    
    public void ver(){
        
    }
    
}
