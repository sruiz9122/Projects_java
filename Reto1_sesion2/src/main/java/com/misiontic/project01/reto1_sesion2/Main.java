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
public class Main {
    
    public static void main(String[] args) {
        Personaje explorer = new Personaje("Explorador", 'm');
        explorer.moverDerecha(2);
        explorer.moverAbajo(5);
        explorer.moverIzquierda(1);
        System.out.println(explorer.calcularDistanciaRespectoOrigen());
        explorer.setVida(explorer.getVida() - 40);
        System.out.println(explorer.getVida());
        explorer.recogerBotiquin();
        explorer.recogerBotiquin();
        explorer.recogerBotiquin();
        explorer.usarBotiquin();
        explorer.usarBotiquin();
        
    }
    
}
