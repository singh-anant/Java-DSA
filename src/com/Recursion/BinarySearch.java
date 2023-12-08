package com.Recursion;

public class BinarySearch {
    static boolean getBinarySearch(int[] arr, int low, int high, int element){
        if(low>high)
            return false;
        int mid=low+(high-low)/2;
        if(arr[mid]==element)
            return true;
        else if(arr[mid]>element)
            return getBinarySearch(arr,low,mid-1,element);
        else
            return getBinarySearch(arr,mid+1,high,element);

    }
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50,60,70,80,90};
      boolean isPresent=  getBinarySearch(arr,0,arr.length-1,25);
        System.out.println(isPresent);
    }
}
