package com.Recursion;

public class Starting {

    static void message(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    static void message1(){
        System.out.println("Hello World 🌎");
        message2();
    }
    static void message2(){
        System.out.println("Hello World 🌎🌎");
        message3();
    }
    static void message3(){
        System.out.println("Hello World 🌎🌎🌎");
        message4();
    }
    static void message4(){
        System.out.println("Hello World 🌎🌎🌎🌎");
        message5();

    }
    static void message5(){
        System.out.println("Hello World 🌎🌎🌎🌎🌎");
    }


    public static void main(String[] args) {
    //write function that print hello world
        // print it five time...but only one function
        message1();
    }
}
