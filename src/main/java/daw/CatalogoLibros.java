/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author noelia
 */
public class CatalogoLibros {

    public static void main(String[] args) {
        
        Libro l1 = new Libro("123", "Platero y yo", "JRJ", 
                "Planeta", 123);
        
        Libro l2 = new Libro(l1);
        
        Libro l3 = new Libro("13", "Platero y yo", "JRJ", 
                "Planeta", 123);
        
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println("Son iguales? " + l1.equals(l2));
//        System.out.println(l1.hashCode());
//        System.out.println(l2.hashCode());
//        
//        System.out.println("Son iguales l1 y l3? " + l1.equals(l3));
//        System.out.println(l3.hashCode());
        

        ArrayList<Libro> lista = new ArrayList<>();
        
        lista.add(new Libro("123", "Platero y yo", "JRJ", 
                "Planeta", 123));
        lista.add(new Libro("321", "Caperucita", "Anónimo", 
                "Planeta", 10));
        lista.add(new Libro("023", "Don Quijote de la Mancha", "Edebe", 
                "Planeta", 1230));
        
        lista.forEach(System.out::println);
        
        //Ordenar por isbn
        System.out.println("--------------Ordenado por ISBN-----------------");
        Collections.sort(lista, 
                (e1, e2)->e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));
        lista.forEach(System.out::println);
        
        //Ordenar por número de páginas
        System.out.println("-----------Ordenado por páginas------------------");
        Collections.sort(lista, 
                (k1, k2)->Integer.compare(k1.getNumPags(), k2.getNumPags()));
        lista.forEach(System.out::println);
        
        //Ordenar por autor al revés
        System.out.println("-----------Ordenado por autor al revés-----------");
        Comparator<Libro> criterio = 
                (k1, k2)->k1.getAutor().compareToIgnoreCase(k2.getAutor());
        Collections.sort(lista, criterio.reversed());
        lista.forEach(System.out::println);
        
        //Recibe la lista donde buscar un objeto del mismo tipo que contiene
        //la lista con la clave a buscar y el criterio de ordenación de la lista
        //lista --> lista
        //new Libro().setIsbn("loqueyoquiera")
        //criterio -> (e1, e2)->e1.getIsbn().compareToIgnoreCase(e2.getIsbn())
        Libro x = new Libro();
        x.setIsbn("123");
        int posicion = Collections.binarySearch(lista, 
                x, 
                (e1, e2)->e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));
        System.out.println("El libro de isbn 123 está en " + posicion);
        

    }
}
