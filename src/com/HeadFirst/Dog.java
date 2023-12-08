package com.HeadFirst;

public class Dog {
    String name;

    public Dog(String name){
        this.name=name;
    }

    public void bark(){
        System.out.println("Bow Bow Bow Said-"+name);
    }

    public static void main(String[] args) {
        Dog [] myDog=new Dog[3];
        myDog[0]=new Dog("Tobi");
        myDog[1]=new Dog("Puffy");
        myDog[2]=new Dog("Chopper");
        for (Dog dog : myDog) dog.bark();
    }
}
