package com.HeadFirst.async.GuessTheGame;

public class Player {
//    Here we have to generate only random numbers...
    int number=0;
    public void guessTheNumber(){
        number=(int)(Math.random()*10);
        System.out.println("The number I have guessed is--"+number);
    }
}
