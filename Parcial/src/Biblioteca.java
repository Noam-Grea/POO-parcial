/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author estudiante
 */
public class Biblioteca {
    private String nombre;
    public ArrayList<Categoria> categorias = new ArrayList ();
    public ArrayList<Usuario> usuarios = new ArrayList ();
    
    public void registro_libro(Categoria categoria, String titulo, String autor){
        
        categoria.registro_libro_cat(titulo, autor);
    }
    public void registro_usuario(String nombre){
        Usuario new_user = new Usuario(nombre);
        usuarios.add(new_user);
    }
    public void registro_cat(String nombre){
        Categoria new_cat = new Categoria(nombre);
        categorias.add(new_cat);
    }
    public void dar_libro(Usuario usuario, Libro libro){
        if(usuario.get_libro_prestado()){
            System.out.println("El usuario ya tiene un libro prestado");
        } else {
            for(Categoria cat : categorias){
                if (cat.es_en_cat(libro)){
                    cat.remove_libro(libro);
                    usuario.set_libro_prestado(true);
                    usuario.set_libro(libro);
                    usuario.set_libro_cat(cat);
                }
            }
            if (usuario.get_libro_prestado()== false){
                System.out.println("El libro no existe o ya es prestado");
            }
        }
    }
    public void recuperar_libro(Usuario usuario, Libro libro){
        if(usuario.get_libro_prestado()){
            registro_libro(usuario.get_libro_cat(),(usuario.get_libro()).get_titulo(),(usuario.get_libro()).get_autor());
            usuario.set_libro_prestado(false);
        }
       
    }
    public Biblioteca(String nombre){
        this.nombre=nombre;
    }
}
