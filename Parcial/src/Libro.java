/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author estudiante
 */
public class Libro {
    private String titulo;
    private String autor;
 
    
    public String get_titulo(){
        return titulo;
    }
    public String get_autor(){
        return autor;
    }

    
    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    
}
