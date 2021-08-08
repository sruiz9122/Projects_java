/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project01;

/**
 *
 * @author RUIB04
 */
public class Main {

    public static void main(String[] arg) {
        Person persona1 = new Person("Pedro",45);
        System.out.println(persona1.age);
        persona1.age = 35;
        System.out.println(persona1.age);
        Person persona2 = new Person("Jose", 34);
        System.out.println(persona2.age);
    }
}
