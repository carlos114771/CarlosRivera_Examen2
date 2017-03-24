/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_examen2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario Dell
 */
public class Usuario implements Serializable {

    String nombre;
    int edad;
    String username;
    String password;
    ArrayList<Playlist> playlist = new ArrayList();
    ArrayList<Canciones> favoritos = new ArrayList();

    private static final long SerialVersionUID = 777L;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Playlist> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Canciones> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Canciones> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
