package com.example.demo.controller;

import java.util.Scanner;

public class Practice2 {
    String name;
   public Practice2(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Practice2 practice2 = new Practice2("preetha");
        System.out.println(practice2);
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2.equals(s3));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String name = sc.nextLine();
//        System.out.println("Name :" + name);
    }
    @Override
    public String toString(){
       return name; //toString() is a method used to define how an object should be represented as text when you print it.
    }

}
