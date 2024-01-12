/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica;

import java.util.Objects;


/**
 *
 * @author noelia
 * 
 * Clase recopilatorio
 * metodos
 * añadir, borrar, ordenar, buscar
 * 
 */
public class Cancion {
    
    private String titulo;
    private String interprete;
    private String album;
    private String genero;
    private int duracion;

    public Cancion() {
    }

    public Cancion(String titulo, String interprete, String album, String genero, int duracion) {
        this.titulo = titulo;
        this.interprete = interprete;
        this.album = album;
        this.genero = genero;
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.titulo);
        hash = 43 * hash + Objects.hashCode(this.interprete);
        hash = 43 * hash + Objects.hashCode(this.album);
        hash = 43 * hash + Objects.hashCode(this.genero);
        hash = 43 * hash + this.duracion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (this.duracion != other.duracion) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.interprete, other.interprete)) {
            return false;
        }
        if (!Objects.equals(this.album, other.album)) {
            return false;
        }
        return Objects.equals(this.genero, other.genero);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cancion{");
        sb.append("titulo=").append(titulo);
        sb.append(", interprete=").append(interprete);
        sb.append(", album=").append(album);
        sb.append(", genero=").append(genero);
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
