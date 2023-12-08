package com.Recursion;

public class SumOfDigits {

    public int getSumOfDigit(int number){
        if(number==0)
            return 0;

        return number%10+getSumOfDigit(number/10);
    }
    public static void main(String[] args) {
        System.out.println(new SumOfDigits().getSumOfDigit(123));
    }
}
