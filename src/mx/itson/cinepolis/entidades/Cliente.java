/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cinepolis.entidades;

import java.time.LocalDate;

/**
 *
 * @author miria
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private boolean recibirPublicidad;
    private String correo;
    private LocalDate fechaCumpleanos;
    private String ciudad;
    private String contrasenia;

    public Cliente() {
        
    }

    public Cliente(String nombre1, String apellido1, boolean recibePublicidad, String correo1, String fechaCumple, String ciudad1, String contrasenia1) {
    }

    public Cliente(String nombre1, String telefono, String correo1, int nivel, String ciudad1, int edad) {
    }

    public Cliente(int par, String nombre1, String apellido1, boolean publicidad, String correo1, LocalDate fechaNacimiento, String ciudad1, String contrasenia1) {
    }

    public Cliente(String nombre, String apellido, boolean recibirPublicidad, String correo, LocalDate fechaCumpleanos, String ciudad, String contrasenia) {
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
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", recibirPublicidad=").append(recibirPublicidad);
        sb.append(", correo=").append(correo);
        sb.append(", fechaCumpleanos=").append(fechaCumpleanos);
        sb.append(", ciudad=").append(ciudad);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append('}');
        return sb.toString();
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

    public LocalDate getFechaCumpleanos() {
        return fechaCumpleanos;
    }

    public void setFechaCumpleanos(LocalDate fechaCumpleanos) {
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
