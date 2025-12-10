/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cinepolis.entidades;

/**
 *
 * @author miria
 */
public class Sala {
    
    private long id;
    private String nombre;
    private int numAsientos;
    private long sucursal;
    private double precio;

    public Sala() {
    }

    public Sala(long id, String nombre, int numAsientos, long sucursal, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.numAsientos = numAsientos;
        this.sucursal = sucursal;
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", numAsientos=").append(numAsientos);
        sb.append(", sucursal=").append(sucursal);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public long getSucursal() {
        return sucursal;
    }

    public void setSucursal(long sucursal) {
        this.sucursal = sucursal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
