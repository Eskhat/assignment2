package com.company;


import java.util.ArrayList;

public class MyStack<T> {
    ArrayList<T> eskhat=new ArrayList<>();

    public void push(T item){
        eskhat.add(0,item);
    }

    public T pop(){
        return eskhat.remove(0);
    }

    public boolean empty(){
        return eskhat.isEmpty();
    }

    public T peek(){
        return eskhat.get(0);
    }

    public void show(){
        System.out.println(eskhat);
    }

}



