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
public class Personaje {

    //Inserte acá los atributos
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida = 100;

    //Inserte acá el método constructor
    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void golpear(Personaje p) {

        double x = (Math.pow((p.getPosicionX() - getPosicionX()), 2));
        double y = (Math.pow((p.getPosicionY() - getPosicionY()), 2));
        double d = Math.sqrt(x + y);
        double e = getDamage() / d;
        if (p.getVida() > 0) {
            p.setVida(p.getVida() - e);
        }
    }

    public void recibirImpacto(double d) {

        setVida(getVida() - d);

    }

    public double calcularDistanciaRespectoPersonaje(Personaje p) {
        double x = (Math.pow((p.getPosicionX() - getPosicionX()), 2));
        double y = (Math.pow((p.getPosicionY() - getPosicionY()), 2));
        double d = Math.sqrt(x + y);
        return d;
    }

    //Inserte acá los SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}
