package com.Heaps;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> list;
    public Heap(){
        list=new ArrayList<>();
    }
    private void swap(int first,int second){
        int temp= list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    private int parentIndex(int childIndex){
        return (childIndex-1)/2;
    }

    private int leftChildIndex(int parentIndex){
       return parentIndex*2+1;
    }
    private int rightChildIndex(int parentIndex){
          return parentIndex*2+2;
    }

      public void insertInHeap(int element){
        list.add(element);
        upheap(list.size()-1);
      }
//swapping down to up
private void upheap(int index){
        int parentIndex=parentIndex(index);
        if(index==0)
            return;
          if(list.get(index)<list.get(parentIndex)){
              swap(index,parentIndex);
              upheap(parentIndex);
          }

      }
    public int removeFromHeap() throws Exception{
        if(list.isEmpty())
            throw new Exception("You are trying to remove from empty heap 🙂🙂");
        int firstElement=list.get(0);
        if(!list.isEmpty()){
            list.set(0,list.remove(list.size()-1));
            downHeap(0);
        }

        return firstElement;
}
    private void downHeap(int index){
        int minElementIndex=index;
        int leftChildIndex=leftChildIndex(index);
        int rightChildIndex=rightChildIndex(index);
        if(leftChildIndex< list.size() && list.get(minElementIndex)>list.get(leftChildIndex)){
            minElementIndex=leftChildIndex;
        }
        if(rightChildIndex< list.size() && list.get(minElementIndex)>list.get(rightChildIndex)){
            minElementIndex=rightChildIndex;
        }
        if(minElementIndex!=index){
            swap(minElementIndex,index);
            downHeap(minElementIndex);
        }

    }
public void displayHeap(){
    System.out.println(list);
}

}
