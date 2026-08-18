package com.example.demo.controller;

abstract class Abstraction {
    String name;
    Abstraction(String name) {
        this.name = name;
    }
    abstract void abstract1();
    void abstract2(){
        System.out.println("Printed from concrete method in abstract class");
    }
}
class Abstraction1 extends Abstraction{

    Abstraction1(String name) {
        super(name);
    }

    @Override
    void abstract1() {
        System.out.println("overrided from abstract method in abstract class");
    }
}
public class Main{
    public static void main(String[] args){
        Abstraction1 a=new Abstraction1("Abstract classes can have variables and constructor");
        a.abstract1();
        a.abstract2();
    }
}
