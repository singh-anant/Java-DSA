package com.Loops;

public class LargestNumber {
    public int getLargestNumber(int a,int b,int c){
//        Using ternary operator
        return (a>b)?((a > c)? a : c):(( b > c ) ? b : c);
    }

    public static void main(String[] args) {
        System.out.println (new LargestNumber().getLargestNumber(1,2,3));

    }
}
