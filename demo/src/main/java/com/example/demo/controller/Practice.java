package com.example.demo.controller;

class Student {
    int id;
    String name;

    //constructor
//    public Student(int id, String name){
//        this.id=id;
//        this.name=name;
//    }

    //Method
    void insertRecord(int d, String n) {
        id = d;
        name = n;
    }
//Method
    void displayInfoUsingMethod() {
        System.out.println(id + name);
    }
}
public class Practice {
public static void main(){
    Student s1=new Student();

    // using Constructor
   // Student s2 = new Student(3,"preethass");
   // s2.displayInfoUsingMethod();

 //   assigning values through reference variables
    s1.id=1;
    s1.name="preetha";
    System.out.println(s1.id+" "+s1.name);
    //using method
    s1.insertRecord(2,"pree");
    s1.displayInfoUsingMethod();

}
}
