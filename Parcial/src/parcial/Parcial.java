/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial;
import java.util.*;

/**
 *
 * @author estudiante
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca bibli = new Biblioteca("Biblioteca nacional");
        bibli.registro_cat("ciencia");
        bibli.registro_cat("literatura");
        bibli.registro_cat("ingenieria");
        bibli.registro_usuario("Noam");
        bibli.registro_libro((bibli.categorias).get(0),"titulo 1","autor 1");
        bibli.registro_libro((bibli.categorias).get(0),"titulo 2","autor 2");
        bibli.registro_libro((bibli.categorias).get(1),"titulo 3","autor 3");
        bibli.registro_libro((bibli.categorias).get(1),"titulo 4","autor 4");
        bibli.registro_libro((bibli.categorias).get(2),"titulo 5","autor 5");
        bibli.registro_libro((bibli.categorias).get(2),"titulo 6","autor 6");
        
        
    }
    
}
