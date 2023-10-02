package org.oscrdrgz.diagnostico;

import org.oscrdrgz.diagnostico.mamiferos.*;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Tigre tigre = new Tigre("Jungla",80.5f, 45.5f, "Tigrus", 15.5f,50, "Albino");
        Leon leon = new Leon("Sabana",90.5f,60.88f,"Leonius", 20.5f, 55, 6, 80.0f);
        Guepardo guepardo= new Guepardo("Selva", 70.5f, 50.5f,"Guepardus", 25.5f,50);
        Lobo lobo = new Lobo("Bosque",90.5f,60.2f,"Caninus Lobus", "Gris", 35.2f, 10, "Lobo comun");
        Perro perro = new Perro("Casa", 40.5f, 25.5f, "Caninus", "Blano", 25.5f, 50);
        List<Mamifero> mamiferos= new ArrayList<>();
        mamiferos.add(tigre);
        mamiferos.add(leon);
        mamiferos.add(guepardo);
        mamiferos.add(lobo);
        mamiferos.add(perro);

        mamiferos.forEach(mamifero-> {
            System.out.println("----------"+ mamifero.getNombreCientifico()+"-----------");
            System.out.println(mamifero.toString());
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());

        });

    }
}