/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergiocompany.reto3_variante2;

/**
 *
 * @author Sergio
 */
public class Estudiante extends Persona {

    //Inserte acá el método constructor
    public Estudiante(String id, String nombre, String email, String idioma) {
        super(id, nombre, email, idioma);
    }
    //Inserte acá la implementación del método abstracto de la clase padre

    @Override
    public void dirigir() {
        if ("Español".equals(super.getIdioma())){
            super.setUrl(getUrl() + "/Español/estudiante");
        } else if ("English".equals(super.getIdioma())) {
            super.setUrl(getUrl() + "/English/estudiante");
        }
    }
 
}
