/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_examen2;

import java.util.ArrayList;

/**
 *
 * @author Usuario Dell
 */
public class Album {

    String nombre;
    String artista;
    ArrayList<Canciones> listacanciones = new ArrayList();

    public Album() {
    }

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Canciones> getListacanciones() {
        return listacanciones;
    }

    public void setListacanciones(ArrayList<Canciones> listacanciones) {
        this.listacanciones = listacanciones;
    }

    @Override
    public String toString() {
        return "Album{" + "nombre=" + nombre + ", artista=" + artista + ", listacanciones=" + listacanciones + '}';
    }

}
