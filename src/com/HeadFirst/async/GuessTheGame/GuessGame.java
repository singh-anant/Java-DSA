package com.HeadFirst.async.GuessTheGame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;


public void startTheGame(){
    p1=new Player();
    p2=new Player();
    p3=new Player();

boolean isP1Right=false;
    boolean isP2Right=false;
    boolean isP3Right=false;



    int numberToBeGuessed= (int)(Math.random()*10);
    while(true){
        System.out.println("Number to guess is " + numberToBeGuessed);
        p1.guessTheNumber();
        p2.guessTheNumber();
        p3.guessTheNumber();

        System.out.println("Player 1 guessed--"+p1.number);
        System.out.println("Player 2 guessed--"+p2.number);
        System.out.println("Player 3 guessed--"+p3.number);

        if(p1.number==numberToBeGuessed)
            isP1Right=true;
        if(p2.number==numberToBeGuessed)
            isP2Right=true;
        if(p3.number==numberToBeGuessed)
            isP3Right=true;

        if(isP1Right || isP2Right || isP3Right){
            System.out.println("We have our Winners");
            System.out.println("Has Player 1 Won??--"+isP1Right);
            System.out.println("Has Player 2 Won??--"+isP2Right);
            System.out.println("Has Player 3 Won??--"+isP3Right);
            System.out.println("Thank You For Participating");
            break;
        }
        else {
            System.out.println("Try Again Guys");
        }
    }
}



}
