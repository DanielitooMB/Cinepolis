/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cinepolis.entidades;

/**
 *
 * @author miria
 */
public class Clientes {
    
    private int id;
    private String nombre;
    private String apellido;
    private boolean recibirPublicidad;
    private String correo;
    private String fechaCumpleanos;
    private String ciudad;
    private String contrasenia;

    public Clientes() {
    }

    public Clientes(int id, String nombre, String apellido, boolean recibirPublicidad, String correo, String fechaCumpleanos, String ciudad, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.recibirPublicidad = recibirPublicidad;
        this.correo = correo;
        this.fechaCumpleanos = fechaCumpleanos;
        this.ciudad = ciudad;
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientes{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", recibirPublicidad=").append(recibirPublicidad);
        sb.append(", correo=").append(correo);
        sb.append(", fechaCumpleanos=").append(fechaCumpleanos);
        sb.append(", ciudad=").append(ciudad);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append('}');
        return sb.toString();
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isRecibirPublicidad() {
        return recibirPublicidad;
    }

    public void setRecibirPublicidad(boolean recibirPublicidad) {
        this.recibirPublicidad = recibirPublicidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaCumpleanos() {
        return fechaCumpleanos;
    }

    public void setFechaCumpleanos(String fechaCumpleanos) {
        this.fechaCumpleanos = fechaCumpleanos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
