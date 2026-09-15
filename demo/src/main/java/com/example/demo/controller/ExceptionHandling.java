package com.example.demo.controller;

import ch.qos.logback.core.encoder.EchoEncoder;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling extends Exception {
    public static void main(String[] args) {
        //Arithmetic Exception
        try {
            method1();
//       int a=10/0;
//       System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("cannot be divided by zero" + e);
        }
        System.out.println("Program completed");
        ExceptionHandling exceptionHandling = new ExceptionHandling();
//    exceptionHandling.ArrayoutofBoundException();
//    exceptionHandling.MultipleCatchBlocks();
//    exceptionHandling.NestedTry();
//    exceptionHandling.NestedTrywithExceptions();
        // exceptionHandling.ThrowException();
        // exceptionHandling.ThrowsMethod();
        //  exceptionHandling.CheckedException();
        //exceptionHandling.inputMismatch();
        //  exceptionHandling.numberFormatExp();
        //   exceptionHandling.StringoutofBoundExp();
        //InvalidAgeException invalidAgeException= new InvalidAgeException("Hello");
        InvalidAgeException.customExp();

    }

    //ArrayoutofBound Exception
    public void ArrayoutofBoundException() {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
            //catching exception
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace(); // need to be used like this only;
        }
        System.out.println("End of program");
    }

    //multiple catch blocks
    public void MultipleCatchBlocks() {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[5]);
            int a = 10 / 0;
            System.out.println(a);

        } catch (ArithmeticException e) {
            System.out.println("arithemetic exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of bound exception");
        } catch (Exception e) {
            System.out.println("Default exception");
        } finally {

            System.out.println("Finally block executed");
        }
        System.out.println("End of program");
    }

    //Nested try
    public void NestedTry() {
        try {
            System.out.println("outer try block");
            try {
                int a = 10 / 0;
                System.out.println(a);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Nested try with different exceptions
    public void NestedTrywithExceptions() {
        try {
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner exception handled");
            }
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer exception handled");
        }
    }

    //Manually throw an exception + try-catch
    public void ThrowException() {
        try {
            int age = 15;
            if (age < 18) {
                throw new ArithmeticException("Age must be 18 or above");
            }
            System.out.println("Eligible");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divide() {
        int a = 10 / 0;
        System.out.println(a);
    }

    public void ThrowsMethod() {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
    }

    //Checked exception with throws
    static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt");
        System.out.println("File opened");
        file.close();
    }

    public void CheckedException() {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //Exception Propagation
    static void method1() {
        method2();
    }

    static void method2() {
        method3();
    }

    static void method3() {
        int result = 10 / 0;
        System.out.println(result);
    }

    //User input + inputmismatchexception
    public void inputMismatch() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your age :");
            int age = scanner.nextInt();
            System.out.println("Age = " + age);
        } catch (Exception e) {
            System.out.println(e);
        }
        scanner.close();
    }

    //NumberFormat Exception
    public void numberFormatExp() {
        String value = "abc";
        String name = null;
        try {

            int number = Integer.parseInt(value);
            System.out.println(number);
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Name is null");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }

    //StringIndexOutOfBoundsException
    public void StringoutofBoundExp() {
        String name = "Java";
        try {
            System.out.println(name.charAt(-1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid string index");
        }
    }
}
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message){
        super(message);
    }
    //Custom Exception
    static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be above 18");
        }
        System.out.println("Valid age");
    }
    public static void customExp(){
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    //custom runtime exception
}

