package com.example.demo.controller;

public class Polymorphism {
    public void student(){
        System.out.println("printed from parent class");
    }
    public void display() {
        this.student(); // calls student() of the current object
    }
    public static void main(String[] args){
Polymorphism p1 = new Polymorphism1();
Polymorphism p2 = new Polymorphism2();
        Polymorphism p3 = new Polymorphism3();

        //instanceof
        if (p1 instanceof Polymorphism2) {
            Polymorphism2 c1 = (Polymorphism2) p1;
            c1.student();
        } else {
            System.out.println("p1 is not an instance of Polymorphism2");
        }
        if (p1 instanceof Polymorphism1) {
            Polymorphism1 c1 = (Polymorphism1) p1; //casting
            c1.student();
        }

        p1.display(); // prints the actual object that invoked the method . This is called runtime polymorphism
        p1.student();
        p2.student();
        p3.student();

    }
}
class Polymorphism1 extends Polymorphism{
    @Override
    public void student(){
        System.out.println("printed from child class 1");
    }
}
class Polymorphism2 extends Polymorphism{
    @Override
    public void student(){

        System.out.println("printed from child class 2");
    }
}
class Polymorphism3 extends Polymorphism{
    @Override
    public void student(){
        super.student();
        System.out.println("printed from child class 3");
    }
}
