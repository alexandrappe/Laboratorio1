package org.example;

public class Artista {

    private int id;
    private String nombre;
    private String genero;
    private String discoMasVendido;
    private String ventasTotales;

    public Artista(int id, String nombre, String genero, String discoMasVendido, String ventasTotales) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.discoMasVendido = discoMasVendido;
        this.ventasTotales = ventasTotales;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    public String getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(String ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", discoMasVendido='" + discoMasVendido + '\'' +
                ", ventasTotales='" + ventasTotales + '\'' +
                '}';
    }

}
