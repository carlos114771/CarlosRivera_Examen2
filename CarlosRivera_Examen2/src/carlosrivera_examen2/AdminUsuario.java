/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_examen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario Dell
 */
public class AdminUsuario {
    ArrayList<Usuario> listausuario = new ArrayList();
    File archivo = null;

    public AdminUsuario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListausuario() {
        return listausuario;
    }

    public void setListausuario(ArrayList<Usuario> listausuario) {
        this.listausuario = listausuario;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminUsuario{" + "listausuario=" + listausuario + ", archivo=" + archivo + '}';
    }
    public void setUsuario(Usuario u){
        this.listausuario.add(u);
    }
    
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : listausuario) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    public void cargarArchivoBinario(){
        try {
            listausuario = new ArrayList();
            
            Usuario temp;
            if (archivo.exists()){
                FileInputStream entrada= new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    while((temp = (Usuario) objeto.readObject())!=null){
                        listausuario.add(temp);
                    }
                } catch (EOFException e) {
       
                }
                objeto.close();
                entrada.close();       
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
}
