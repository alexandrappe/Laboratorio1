package org.example;

public class Disco {
private Artista artista;
private String titulo;
private int ventasTotales;

    public Disco(Artista artista, String titulo, int ventasTotales) {
        this.artista = artista;
        this.titulo = titulo;
        this.ventasTotales = ventasTotales;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(int ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "artista=" + artista +
                ", titulo='" + titulo + '\'' +
                ", ventasTotales=" + ventasTotales +
                '}';
    }

}
