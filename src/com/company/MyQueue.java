package com.company;

import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> eskhat=new ArrayList<>();

    public void enqueue(T item){
      eskhat.add(item);
    }

    public T dequeue(){
        return eskhat.remove(0);
    }

    public boolean empty(){
        return eskhat.isEmpty();
    }

    public int sizee(){
        return eskhat.size();
    }

    public T peekk(){
        return eskhat.get(0);
    }
    public void show(){
        System.out.println(eskhat);
    }
}
