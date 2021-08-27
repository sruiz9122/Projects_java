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
import java.util.ArrayList;

public class Restaurante {

    //Inserte acá los atributos
    private ArrayList<Pedido> pedidos;

    //Inserte acá el método constructor
    public Restaurante() {
        this.pedidos = new ArrayList<>();
    }

    //Inserte acá los SETTERS Y GETTERS
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void agregarPedidoLista(Pedido p) {

        int maxIndex = this.pedidos.size();
        int x = 0;
        String mensaje;
        int estado = 0;

        while (x < maxIndex) {
            if (this.pedidos.get(x).getnPedido().contains(p.getnPedido())) {
                mensaje = "El número de pedido ya existe";
                estado = 1;
            }
            x++;
        }

        if (x == maxIndex && estado == 0) {
            this.pedidos.add(p);
            mensaje = "El número de pedido ha sido guardado";
        }

    }

    public void eliminarPedido(String nPedido) {
        int maxIndex = this.pedidos.size();
        int x = 0;
        String mensaje;
        int estado = 0;

        while (x < maxIndex) {
            if (this.pedidos.get(x).getnPedido().contains(nPedido)) {
                this.pedidos.remove(x);
                mensaje = "El número de pedido ha sido eliminado";
                estado = 1;
            }

            if (estado == 1) {
                x = maxIndex;
            } else {
                x++;
            }

        }

        if (x == maxIndex && estado == 0) {
            mensaje = "El número de pedido no existe o ha sido eliminado anteriormente";
        }
    }

    public double calcularGanancias() {

        int maxIndex = this.pedidos.size();
        int x = 0;
        double sumatoria = 0;

        while (x < maxIndex) {
            sumatoria = this.pedidos.get(x).getCostoPedido() + sumatoria;
            x++;
        }

        return sumatoria;

    }

    public double promedioGananciasTotales() {
        int maxIndex = this.pedidos.size();
        double promedio = calcularGanancias() / maxIndex;

        return promedio;

    }

    public double desviacionEstandarGananciasTotales() {
        int maxIndex = this.pedidos.size();
        int x = 0;
        double cuadroDistancia = 0;
        double sumatoria = 0;
        double resDivision = 0;
        double resRaiz = 0;

        //Calcular la media.
        double media = promedioGananciasTotales();
        //calcular el cuadrado de la distancia a la media para cada dato y sumar los valores.
        while (x < maxIndex) {
            cuadroDistancia = this.pedidos.get(x).getCostoPedido() - media;
            double elevadoCuadrado = Math.pow(cuadroDistancia, 2);
            sumatoria = elevadoCuadrado + sumatoria;
            x++;
        }

        //dividir entre el número de datos
        resDivision = sumatoria / maxIndex;

        //sacar la raíz cuadrada.
        resRaiz = Math.sqrt(resDivision);

        return resRaiz;

    }

    public double retornarCostoPedido(String ID) {

        int maxIndex = this.pedidos.size();
        int x = 0;
        double costoPedido = 0.0;

        while (x < maxIndex) {
            if (this.pedidos.get(x).getnPedido().contains(ID)) {
                costoPedido = this.pedidos.get(x).getCostoPedido();
                x = maxIndex;
            }

            x++;
        }

        return costoPedido;

    }

}
