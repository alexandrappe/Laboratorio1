package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class GestionMusical {

    private List<Artista> artistas = new ArrayList<>();
    private List<Disco> discos = new ArrayList<>();
    private Set<Integer> idsArtistas = new HashSet<>(); //para que sea unico
    private int contadorArtistas = 1;

    public int generarIdArtista() {
        return contadorArtistas++;
    }

    //Agregar un artista
    public void agregarArtista(Artista artista) {
        if (!idsArtistas.contains(artista.getId())) {
            artistas.add(artista);
            idsArtistas.add(artista.getId()); // Añadir el id
        } else {
            System.out.println("El ID del artista ya existe. No se puede agregar.");
        }
    }

    //Agregar un disco
    public void agregarDisco(Disco disco) {
        discos.add(disco);
    }

    //Muestra los artistas existentes
    public void mostrarArtistas() {
        System.out.println("\nArtistas disponibles:");
        if (artistas.isEmpty()) {
            System.out.println("No hay artistas registrados.");
        } else {
            artistas.forEach(artista ->
                    System.out.println("Id: " + artista.getId() + ", Nombre: " + artista.getNombre())
            );
        }
    }

    //Permite saber si hay o no artistas
    public boolean hayArtistasRegistrados() {
        return !artistas.isEmpty();
    }

    //Muestra los Discos que hay registrados
    public void mostrarDiscos() {
        System.out.println("\nDiscos disponibles:");
        if (discos.isEmpty()) {
            System.out.println("No hay discos registrados.");
        } else {
            discos.forEach(disco ->
                    System.out.println(disco.getTitulo() + " - " + disco.getArtista().getNombre())
            );
        }
    }

    public boolean hayDiscosRegistrados() {
        return !discos.isEmpty();
    }

    //Ayuda a relacion disco-artista al momento de agregar un disco
    public Artista buscarArtistaPorId(int id) {
        return artistas.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    //Registra las ventas
    //TODO

    // Metodo que calcula las ventas totales de un artista (total de todos los discos)
    private int calcularVentasTotalesArtista(Artista artista) {
        return discos.stream()
                .filter(disco -> disco.getArtista().equals(artista))
                .mapToInt(Disco::getVentasTotales)
                .sum();
    }

    //Muestra los discos con mas de cierto numero de ventas
    public void mostrarDiscosPopulares(int min) {
        List<Disco> populares = discos.stream()
                .filter(d -> d.getVentasTotales() > min)
                .collect(Collectors.toList());

        if (populares.isEmpty()) {
            System.out.println("No hay discos que superen ese numero.");
            return;  // Regresa al menú si no hay discos populares
        }

        System.out.println("\nDiscos con más de " + min + " ventas:");
        int i = 1;
        for (Disco disco : populares) {
            System.out.println(i++ + ". " + "Disco: " + disco.getTitulo() + " del artista " + disco.getArtista().getNombre() + " con  " + disco.getVentasTotales()+ " ventas totales");
        }
    }

    //Muestra el artista con mas ventas totales (de todos los dicos)
    //TODO

    //Mostrar ventas por Disco (prueba que se actualiza luego de registrar venta de un disco)
    //TODO





}

