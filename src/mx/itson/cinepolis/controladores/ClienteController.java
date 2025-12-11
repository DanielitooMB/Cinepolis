/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cinepolis.controladores;

import java.util.ArrayList;
import mx.itson.cinepolis.entidades.Cliente;
import mx.itson.cinepolis.modelos.ClienteModel;

/**
 *
 * @author miria
 */
public class ClienteController {
    
    private ClienteModel modelo = new ClienteModel();
    
    public boolean crear(Cliente cliente) {
        return modelo.crear(cliente);
    }
    
    public boolean editar(Cliente cliente){
        return modelo.editar(cliente);
    }    
    
    public boolean eliminar(Cliente cliente){
        return modelo.eliminar(cliente);
    }
    
    public ArrayList<Cliente> listar() {
        return modelo.listar();
}
    
    public void ver(){}
}
