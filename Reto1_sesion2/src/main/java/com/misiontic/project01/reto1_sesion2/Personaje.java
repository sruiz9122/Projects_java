/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project01.reto1_sesion2;

/**
 *
 * @author RUIB04
 */
public class Personaje {

    //Inserte acá los atributos
    private String nombre;
    private char sexo;
    private double posicionX = 0;
    private double posicionY = 0;
    private double distanciaTotal = 0;
    private int numeroBotiquines = 0;
    private double vida = 100;

    //Inserte acá el método constructor
    public Personaje(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void usarBotiquin() {
        //Resta 1 a numeroBotiquines y suma 5 a vida
        double cantBot = getNumeroBotiquines();

        if (cantBot > 0) {
            setNumeroBotiquines(getNumeroBotiquines() - 1);
            setVida(getVida() + 5);
        }

    }

    public void recogerBotiquin() {
        setNumeroBotiquines(getNumeroBotiquines() + 1);
    }

    public void moverDerecha(double d) {
        setPosicionX(getPosicionX() + d);
        setDistanciaTotal(getDistanciaTotal() + d);
    }

    public void moverIzquierda(double d) {
        setPosicionX(getPosicionX() - d);
        setDistanciaTotal(getDistanciaTotal() + d);
    }

    public void moverArriba(double d) {
        setPosicionY(getPosicionY() + d);
        setDistanciaTotal(getDistanciaTotal() + d);
    }

    public void moverAbajo(double d) {
        setPosicionY(getPosicionY() - d);
        setDistanciaTotal(getDistanciaTotal() + d);
    }

    public double calcularDistanciaRespectoOrigen() {
        /*Retorna la distancia entre el origen de coordenadas 
        y el punto en el que se encuentra el personaje. */
        double calculoInterno = Math.pow(getPosicionX(), 2) + Math.pow(getPosicionY(), 2);

        double resultado = Math.sqrt(calculoInterno);

        return resultado;
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

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

}
