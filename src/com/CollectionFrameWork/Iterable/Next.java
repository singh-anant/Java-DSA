package com.CollectionFrameWork.Iterable;

import java.util.*;

public class Next {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        Iterator<Integer> iteratorValues=list.iterator();
        while(iteratorValues.hasNext()){
            int value=iteratorValues.next();
            System.out.println(value);
            if(value==40)
                iteratorValues.remove();
        }
        System.out.println(list);
//        Its a method
        list.forEach((Integer val)->System.out.print(val+" "));
    }

}
