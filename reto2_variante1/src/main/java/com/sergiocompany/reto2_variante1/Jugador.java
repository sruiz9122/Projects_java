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
public class Jugador extends Personaje {
    //              ^ (Jugador hereda de Personaje)

    //Inserte acá los atributos
    private int numeroBotiquines = 0;

    //Inserte acá el método constructor
    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void usarBotiquin() {
        if (numeroBotiquines > 0) {
            setNumeroBotiquines(getNumeroBotiquines() - 1);

            if (getVida() <= 95) {
                setVida(getVida() + 5);
            }
        }
    }

    public void recogerBotiquin() {
        setNumeroBotiquines(getNumeroBotiquines() + 1);
    }

    public void moverDerecha(double d) {
        setPosicionX(getPosicionX() + d);
    }

    public void moverIzquierda(double d) {
        setPosicionX(getPosicionX() - d);
    }

    public void moverArriba(double d) {
        setPosicionY(getPosicionY() + d);
    }

    public void moverAbajo(double d) {
        setPosicionY(getPosicionY() - d);
    }

    public void golpear(Enemigo p) {
        /*Además de realizar lo que se especifica en la clase padre, debe invocar la evolución del enemigo p */

        if (p.getResistencia() == 2) {
            double x = (Math.pow((p.getPosicionX() - getPosicionX()), 2));
            double y = (Math.pow((p.getPosicionY() - getPosicionY()), 2));
            double d = Math.sqrt(x + y);
            double e = getDamage() / d;
            if (p.getVida() > 0) {
                p.recibirImpacto(e);
            }

        } else {
            double x = (Math.pow((p.getPosicionX() - getPosicionX()), 2));
            double y = (Math.pow((p.getPosicionY() - getPosicionY()), 2));
            double d = Math.sqrt(x + y);
            double e = getDamage() / d;
            p.recibirImpacto(e);
            if (p.getVida() <= 30) {
                p.evolucionar();
            }
        }

    }

    //Inserte acá los SETTERS Y GETTERS
    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
}
