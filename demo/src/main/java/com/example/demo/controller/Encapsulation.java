package com.example.demo.controller;


class Encapsulation {
    private int num;
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }
}

class Encapsulation1 {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setNum(1000);
        //e.num = 10; //error if private
        System.out.println(e.getNum());
    }
}
