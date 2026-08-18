package com.example.demo.controller;

public class Inheritance1 extends Inheritance{

    public Inheritance1 (){
        super();
    }
    public void child1(){
        System.out.println("called using this");
    }
    public void child(){
        this.child1();
        String parentName = super.name;
        System.out.println(parentName);
        super.parent();
        System.out.println("Multilevel inheritance");
    }

    public static void main(String[] args) {
        Inheritance1 i1 = new Inheritance1();
        i1.parent();
        i1.child();
    }


}
