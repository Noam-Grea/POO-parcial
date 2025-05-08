/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author estudiante
 */
public class Categoria {
    private String nombre;
    public ArrayList<Libro> libros = new ArrayList ();
    
    public void registro_libro_cat(String titulo, String autor){
        libros.add(new Libro(titulo, autor));
    }
    public boolean es_en_cat(Libro libro){
        for (Libro libr : libros){
            if (libro == libr){
                return true;
            }
        }
        return false;
    }
    public void remove_libro(Libro libro){
        if (es_en_cat(libro)){
            libros.remove(libro);
        }
        
    }    
    public void add_libro(Libro libro){
        libros.add(libro);
    }
        
    public Categoria (String nombre){
        this.nombre = nombre;
    }
}
