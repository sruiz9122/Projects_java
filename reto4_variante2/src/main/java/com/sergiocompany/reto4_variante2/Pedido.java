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
public class Pedido {

    //Inserte acá los atributos
    private String nPedido;
    private String IDCliente;
    private double costoPedido;
    private int diaPedido;
    private int mesPedido;
    private int yearPedido;

    //Inserte acá el método constructor
    public Pedido(String nPedido, String IDCliente, double costoPedido, int diaPedido, int mesPedido, int yearPedido) {
        this.nPedido = nPedido;
        this.IDCliente = IDCliente;
        this.costoPedido = costoPedido;
        this.diaPedido = diaPedido;
        this.mesPedido = mesPedido;
        this.yearPedido = yearPedido;
    }

    //Inserte acá los SETTERS Y GETTERS
    public String getnPedido() {
        return nPedido;
    }

    public void setnPedido(String nPedido) {
        this.nPedido = nPedido;
    }
    
    public String getIDCliente() {
        return IDCliente;
    }
    
    public void setIDCliente(String IDCliente) {
        this.IDCliente = IDCliente;
    }

    public double getCostoPedido() {
        return costoPedido;
    }
    
    public void setCostoPedido(double costosPedido) {
        this.costoPedido = costosPedido;
    }

    public int getDiaPedido() {
        return diaPedido;
    }
    
    public void setDiaPedido(int diaPedido){
        this.diaPedido = diaPedido;
    }
    
    public int getMesPedido() {
        return mesPedido;
    }
    
    public void setMesPedido(int mesPedido) {
        this.mesPedido = mesPedido;
    }
    
    public int getYearPedido() {
        return yearPedido;
    }
    
    public void setYearPedido(int yearPedido) {
        this.yearPedido = yearPedido;
    }
    
}
