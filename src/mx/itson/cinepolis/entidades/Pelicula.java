/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cinepolis.entidades;

/**
 *
 * @author miria
 */
public class Pelicula {
    
    private long id;
    private String titulo;
    private String sinopsis;
    private int duracion;
    private String pais;
    private String triler;
    private int calificacion;

    public Pelicula() {
    }

    public Pelicula(long id, String titulo, String sinopsis, int duracion, String pais, String triler, int calificacion) {
        this.id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.duracion = duracion;
        this.pais = pais;
        this.triler = triler;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{");
        sb.append("id=").append(id);
        sb.append(", titulo=").append(titulo);
        sb.append(", sinopsis=").append(sinopsis);
        sb.append(", duracion=").append(duracion);
        sb.append(", pais=").append(pais);
        sb.append(", triler=").append(triler);
        sb.append(", calificacion=").append(calificacion);
        sb.append('}');
        return sb.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTriler() {
        return triler;
    }

    public void setTriler(String triler) {
        this.triler = triler;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
}
