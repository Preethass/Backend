package com.example.demo.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@FunctionalInterface
interface Calculator{
    int add(int a,int b);

}
//static method inside interface
interface displayItems{
    static void display(){
        System.out.println("displayed using static method inside interface");
    }
}
//default method inside interface
interface defaultMethod{
    default void start(){
        System.out.println("printed from default method inside interface");
    }
}

class CreateObj implements defaultMethod{
}


class Student {
    int id;
    String name;
    static String role="ML";

    static {
        System.out.println("Static block executed");
    }

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
        System.out.println("Dispkay using this keyword"+this.name);
        System.out.println(id + name + role);
    }

    static class inner{
        void displayInner(){
            System.out.println("inner class called");
        }
    }
}
public class Practice {
public static void main(){
    Student s1=new Student();
    displayItems.display();
    //Default methods
    CreateObj c=new CreateObj();
    c.start();
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
    Student.inner innerObj=new Student.inner();
            innerObj.displayInner();
            //lambda
    Practice.lambda();
}

public static void lambda(){
    List<String> names= Arrays.asList("P","r","e","e");
    //Method references
    names.forEach(System.out::println);
    names.forEach(name->System.out.println(name));
    Calculator c=(a,b)->a+b;
    System.out.println(c.add(10,20));
    String name=null;
    Optional<String> opt= Optional.ofNullable(name);
    System.out.println(opt.orElse("No name"));
    System.out.println(LocalTime.now());
    System.out.println(LocalDate.now());
    System.out.println(LocalDateTime.now());
    LocalDate birthday =
            LocalDate.of(1999, 9, 10);

    System.out.println(birthday);
    //stream api
    List<Integer> list = Arrays.asList(1,2,3,4,5);
    list.stream().filter(n->n%2==0).forEach(System.out::println);

    //collectors
    List<String> courses=Arrays.asList("java","c","java","html");
    List<String> result = courses.stream().distinct().collect(Collectors.toList());
    System.out.println(result);

    //base64 encoding
    String text = "Java";
    String encoded = Base64.getEncoder().encodeToString(text.getBytes());
    //base64 decoding
    String decoded = new String(Base64.getDecoder().decode(encoded));
    System.out.println(encoded+decoded);

    //parallel sort -> splits into 2 and sorts it and then merges it
    int[] arr={9,6,5,3,8,7,1};
    Arrays.parallelSort(arr);
    System.out.println(Arrays.toString(arr));
}
}
//
//        | ---------------------------- | --------------------------------------------------------------- |
//        | `Optional.of(value)`         | Creates an Optional; `value` must not be `null`                 |
//        | `Optional.ofNullable(value)` | Creates an Optional; accepts `null` and becomes empty if needed |
//        | `Optional.empty()`           | Creates an empty Optional                                       |
//        | `orElse(default)`            | Returns the value if present; otherwise returns `default`       |
//        | `orElseGet(supplier)`        | Computes and returns a default only if the Optional is empty    |
//        | `orElseThrow()`              | Returns the value or throws an exception if empty               |
//        | `isPresent()`                | Returns `true` if a value exists                                |
//        | `ifPresent(action)`          | Executes an action only if a value is present                   |
//        | `get()`                      | Returns the value; throws an exception if the Optional is empty |

