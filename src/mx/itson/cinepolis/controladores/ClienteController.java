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
    
    public void crear(){}
    
    public void editar(){}
    
    public void eliminar(){}
    
    public ArrayList<Cliente> listar() {
        ClienteModel modelo = new ClienteModel();
        return modelo.listar();
}
    
    public void ver(){}
}
