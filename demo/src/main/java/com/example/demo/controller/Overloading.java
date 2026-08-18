package com.example.demo.controller;

public class Overloading {
    public void overload(int num){
        System.out.println(num);
    }
    public void override(){
        System.out.println("Printed using override in Parent file");
    }
    public void overload(String name){
System.out.println(name);
    }
    public static void main(String[] args){
Overloading o= new Overloading();
o.overload(5);
o.overload("printed using overload");
    }

}
