/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author noelia
 */
public class ReproductorMusica {

    public static void main(String[] args) {
        
        ArrayList<Cancion> listaMusica = new ArrayList<>();
        
        Cancion c1 = new Cancion("Me muero", "Yo ahora mismo",
                "La vida", "Country", 180);
        Cancion c2 = new Cancion("Hasta nunca", "Vico", 
                "No venir a dar clase", "Pop", 60);
        Cancion c3 = new Cancion("Está dura la cosa", "Varios artistas", 
                "", "Rock indie", 210);
        
        listaMusica.add(c1);
        listaMusica.add(c2);
        listaMusica.add(c3);
        
        listaMusica.forEach(System.out::println);
        
        System.out.println("--------------Ordenado por titulo-----------------");
        Collections.sort(listaMusica, 
                (m1, m2)->m1.getTitulo().compareToIgnoreCase(m2.getTitulo()));
        listaMusica.forEach(System.out::println);
        
        System.out.println("-----------Ordenado por duración------------------");
        Collections.sort(listaMusica, 
                (m1, m2)->Integer.compare(m1.getDuracion(), m2.getDuracion()));
        listaMusica.forEach(System.out::println);
        
        System.out.println("-----------Ordenado por interprete al revés-------");
        Comparator<Cancion> criterioInterprete = 
                (m1, m2)->m1.getInterprete().compareToIgnoreCase(m2.getInterprete());
        Collections.sort(listaMusica, criterioInterprete.reversed());
        listaMusica.forEach(System.out::println);
        
        //Búsqueda binaria
        Cancion c4 = new Cancion();
        c4.setInterprete("Vico");
        int posicion = Collections.binarySearch(listaMusica, 
                c4, 
                (e1, e2)->e1.getInterprete().compareToIgnoreCase(e2.getInterprete()));
        System.out.println("La cancion de Vico está en la posicion " + posicion);
        
        //Doble criterio
        Comparator<Cancion> criterioTitulo = (m1, m2)->m1.getTitulo().compareToIgnoreCase(m2.getTitulo());
        Comparator<Cancion> criterioInterpreteTitulo = criterioInterprete.thenComparing(criterioTitulo);
        
    }
    
}
