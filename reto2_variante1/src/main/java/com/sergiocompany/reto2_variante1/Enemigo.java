/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergiocompany.reto2_variante1;

/**
 *
 * @author Sergio
 */
public class Enemigo extends Personaje {

    //              ^ (Enemigo hereda de Personaje)
    //Inserte acá los atributos
    private int evolucionesAplicadas = 0;
    private int resistencia = 1;

    //Inserte acá el método constructor
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void evolucionar() {

        if (getVida() <= 10 && getEvolucionesAplicadas() == 1) {
            setResistencia(getResistencia() + 1);
            setEvolucionesAplicadas(getEvolucionesAplicadas() + 1);
        } else if (getVida() <= 30 && getEvolucionesAplicadas() == 0) {
            setDamage(getDamage() + 20);
            setEvolucionesAplicadas(getEvolucionesAplicadas() + 1);

            if (getVida() <= 10 && getEvolucionesAplicadas() == 1) {
                setResistencia(getResistencia() + 1);
                setEvolucionesAplicadas(getEvolucionesAplicadas() + 1);
            }

        }
    }

    public void recibirImpacto(double d) {
        double div = d / getResistencia();
        if (getVida() > 0) {
            setVida(getVida() - div);
        }
    }

    //Inserte acá los SETTERS Y GETTERS
    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}
