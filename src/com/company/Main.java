package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        MyQueue<Object> arr = new MyQueue<>();
        arr.enqueue(5);
        arr.enqueue(4);
        arr.enqueue(9);

         MyStack<Object> list=new MyStack<>();
         list.push(5);
         list.push(4);
         list.push(9);
         MyHeap att=new MyHeap();
         att.add(13);
         att.add(16);
         att.add(31);
         att.add(41);
         att.add(51);
         att.add(100);
         att.add(41);
         att.removeA(41);

         att.print();
    }
}
