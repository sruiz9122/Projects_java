/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergiocompany.reto4_variante2;

/**
 *
 * @author Sergio
 */
public class Main {

    public static void main(String[] args) {
        Pedido p1 = new Pedido("A1", "701543", 25000.02, 26, 8, 2021);
        Pedido p2 = new Pedido("A1", "701543", 20000, 2, 5, 2021);
        Pedido p3 = new Pedido("A2", "701543", 88000.03, 26, 8, 2021);
        Pedido p4 = new Pedido("A1", "701543", 20000, 2, 5, 2021);
        Pedido p5 = new Pedido("A3", "701543", 25000.05, 26, 8, 2021);
        Pedido p6 = new Pedido("A2", "701543", 20000, 2, 5, 2021);
        Restaurante r1 = new Restaurante();

        r1.agregarPedidoLista(p1);
        r1.agregarPedidoLista(p2);
        r1.agregarPedidoLista(p3);
        r1.agregarPedidoLista(p4);
        r1.agregarPedidoLista(p5);
        r1.agregarPedidoLista(p6);
        
        r1.eliminarPedido("A1");
        r1.eliminarPedido("A1");
        r1.eliminarPedido("A3");
        r1.eliminarPedido("A8");
        
        r1.agregarPedidoLista(p1);
        r1.agregarPedidoLista(p5);
        
        r1.calcularGanancias();
        r1.promedioGananciasTotales();
        
        r1.desviacionEstandarGananciasTotales();
        
        r1.retornarCostoPedido("A3");

    }
}
