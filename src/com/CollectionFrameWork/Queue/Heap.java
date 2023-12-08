package com.CollectionFrameWork.Queue;

import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(2);
        minHeap.add(3);
        System.out.println(minHeap);
    }
}
