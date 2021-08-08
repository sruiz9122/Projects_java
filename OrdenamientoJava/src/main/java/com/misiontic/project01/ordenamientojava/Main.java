/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project01.ordenamientojava;

import java.util.Arrays;

/**
 *
 * @author RUIB04
 */
public class Main {

    public static void main(String[] args) {
        int[] vector = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int[] vectorA = new int[vector.length/2];
        int[] vectorB = new int[vector.length/2];
        int[] vectorC = new int[vectorB.length];
        int[] vectorOrdenado = new int[vectorA.length + vectorC.length];
        System.arraycopy(vector,0,vectorA,0,vectorA.length);
        System.arraycopy(vector,vector.length/2,vectorB,0,vectorB.length);

        for(int n : vector) {
            System.out.println(n);
        }
       
        System.out.println("Array A");
        Arrays.sort(vectorA);
        for(int n : vectorA) {
            System.out.println(n);
        }
        
        System.out.println("Array B");
        Arrays.sort(vectorB);
        for(int n : vectorB) {
            System.out.println(n);
        }

        System.out.println("Array C");
        
        for (int i = vectorB.length - 1; i >= 0; i--) {
            int aux = 0;
            Arrays.sort(vectorB);
            int varEmerg = ((vectorB.length -1) - i);
            aux = vectorB[i];
            vectorC[varEmerg] = aux;
        }
        
        for(int n : vectorC) {
            System.out.println(n);
        }
        
        System.out.println("Array Ordenado");
        System.arraycopy(vectorA,0,vectorOrdenado,0,vectorA.length);
        System.arraycopy(vectorC,0,vectorOrdenado,vectorA.length,vectorB.length);
        
        for(int n : vectorOrdenado) {
            System.out.println(n);
        }

    }

}
