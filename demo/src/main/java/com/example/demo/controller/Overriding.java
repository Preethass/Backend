package com.example.demo.controller;

public class Overriding extends Overloading {
    @Override
    public void override(){
        System.out.println("Printed using override");
    }
    public static void main(String[] args){
        Overriding o=new Overriding();
        o.override();
    }
}
