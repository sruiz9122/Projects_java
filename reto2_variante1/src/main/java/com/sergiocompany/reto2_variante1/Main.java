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
public class Main {

    public static void main(String[] args) {
        /*Jugador j = new Jugador("Explorador", 'm', 0, 5, 100);
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
        
        j.golpear(e);
        j.golpear(e);
        j.moverDerecha(10);
        j.moverAbajo(5);
        
        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();

        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        
        e.golpear(j);
        e.golpear(j);
        
        j.golpear(e);
        j.golpear(e);
        
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);*/
        
        /*Jugador j = new Jugador("Exploradora", 'f', -1.0, -1.0, 130.0);
        Enemigo e = new Enemigo("Virico", 'f', 1, 1, 120);
        
        j.golpear(e);
        j.golpear(e);
        j.usarBotiquin();
        j.recogerBotiquin();
        j.recogerBotiquin();
        j.usarBotiquin();
        j.moverArriba(2);
        e.golpear(j);*/
       
        Jugador j = new Jugador("Explorador", 'm', 0, 5, 100);
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
        
        j.golpear(e);
        j.golpear(e);
        j.moverDerecha(10);
        j.moverAbajo(5);
        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();
        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        e.golpear(j);
        e.golpear(j);
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        
    }

}
