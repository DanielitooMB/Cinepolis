/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cinepolis.entidades;

import java.time.LocalDateTime;


/**
 *
 * @author miria
 */
public class Funcion {
    
    private long id;
    private Pelicula pelicula;
    private Sala sala;
    private LocalDateTime horario;
    private int sucursalId;

    public Funcion() {
    }

    public Funcion(long id, Pelicula pelicula, Sala sala, LocalDateTime horario, int sucursalId) {
        this.id = id;
        this.pelicula = pelicula;
        this.sala = sala;
        this.horario = horario;
        this.sucursalId = sucursalId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcion{");
        sb.append("id=").append(id);
        sb.append(", pelicula=").append(pelicula);
        sb.append(", sala=").append(sala);
        sb.append(", horario=").append(horario);
        sb.append(", sucursalId=").append(sucursalId);
        sb.append('}');
        return sb.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public int getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(int sucursalId) {
        this.sucursalId = sucursalId;
    }
    
}
