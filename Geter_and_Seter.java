/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project01;

/**
 *
 * @author juanz
 */
public class Main {
    
    public static void main(String[] args) {
        int age = 160, age2 = 60;
        Person person1 = new Person("Juan", 27);
        Person person2 = new Person("Juan", 27);
        person1.walk();
        System.out.println(person1.getAge());
        person1.setAge(60);
        System.out.println(person1.getAge());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project01;

/**
 *
 * @author juanz
 */
public class Person {
    
    private String fullname; //setFullname
    private int age; // setAge
    private int identification; //setIdentification

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }
    
    Person(String fullname, int age){
        this.age = age;
        this.fullname = fullname;
    }
    
    public void walk(){
        System.out.println("Estoy caminando");
    }
    
    public int getAge(){
        
        return this.age;
    }
    
    public void setAge(int age){
        if(age > 150){
            System.out.println("Error la edad no puede ser mayor a 150 años");
        }
        else{
            this.age = age;
        } 
    }
}
