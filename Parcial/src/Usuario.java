/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author estudiante
 */
public class Usuario {
    private String nombre;
    private boolean libro_prestado;
    private Libro libro;
    private Categoria libro_cat;
    
    public Usuario(String nombre){
        this.nombre=nombre;
    }
    public boolean get_libro_prestado(){
        return libro_prestado;
    }
    public void set_libro_prestado(boolean bool){
        libro_prestado = bool;
    }
    public Libro get_libro(){
        return libro;
    }
    public void set_libro(Libro libr){
        libro = libr;
    }
    public Categoria get_libro_cat(){
        return libro_cat;
    }
    public void set_libro_cat(Categoria cat){
        libro_cat = cat;
    }
    
}
