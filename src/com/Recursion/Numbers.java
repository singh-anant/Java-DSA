package com.Recursion;

public class Numbers {
    static void printNumber(int n){
//        That's base case bro....
        if(n==6)
            return;
        System.out.print(n+" ");
        printNumber(n+1);
    }

    public static void main(String[] args) {
        printNumber(1);
    }
}
