/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author andre
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena="Voy al gimnasion por la noche";
        System.out.println(cadena);
        
        System.out.printf("\n");
        
        //creo un nuevo atributo llamado fin. 
        String fin=cadena.replaceAll("[aeiouAEIOU]", "");
        
        System.out.println(fin);        
    }
    
}
