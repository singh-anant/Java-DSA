package com.Recursion;

public class ReverseAString {
    public String getReversedString(String str){
        if(str.length()==1)
            return str;

        return str.charAt(str.length()-1)+getReversedString(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {
        System.out.println(new ReverseAString().getReversedString("anant"));
    }
}
