/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_examen2;

/**
 *
 * @author Usuario Dell
 */
public class Canciones {

    String nombre;
    String canciones;
    int duracion;
    String genero;

    public Canciones() {
    }

    public Canciones(String nombre, String canciones, int duracion, String genero) {
        this.nombre = nombre;
        this.canciones = canciones;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCanciones() {
        return canciones;
    }

    public void setCanciones(String canciones) {
        this.canciones = canciones;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
