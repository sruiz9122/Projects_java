/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sergio
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> people;
        people = new ArrayList<>();

        people.add("Sergio");
        people.add("Andres");
        people.add("Christian");
        people.add("Camilo");
        people.add("Sergio");
        System.out.println(people.contains("Sergio"));//Saber si existe un elemento, devuelve True o False
        people.remove("Sergio");//Si se quiere por posición "people.remove(0);", Si es por el contenido solo lo hará por el primer dato que encuentre
        System.out.println(people.size());

        Iterator<String> iterator = people.iterator();
        
        /*Forma principal de obtener datos de una lista*/
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
        
        /*Otra forma de leer datos de una lista*/
        for (int i = 0; i < people.size(); i++) {
            String item = people.get(i);
            System.out.println(item);
        }

    }

}