package com.company;
import java.util.ArrayList;

public class MyHeap {
    int length;
    int[]arr=new int[15];

    private int LeftChild(int index){
        return (2*index);
    }
    private int RightChild(int index){
        return(2*index)+1;
    }
    private int Parent(int index){return (index/2);}

    public void add(int item){
        int a=++length;
        arr[a] = item;
        int c =length;
        while (arr[c] < arr[Parent(c)]) {
            swap(c,Parent(c));
        }
    }
    private void swap(int index1,int index2){
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public void removeA(int item){
        for(int i=0;i<arr.length;i++){
            if(item==arr[i]){
                int n=i;
                int j=arr[n];
                arr[n]=arr[length];
                length=length-1;
                Heapify(n);
            }
        }
    }
    private void Heapify(int i) {
        int left=LeftChild(i);
        int right=RightChild(i);
        int large=i;
        if(left<=length && arr[left]<arr[large])
            large=left;
        if(right<=length && arr[right]<arr[large])
            large=right;
        if(large!=i){
            swap(i,large);
            Heapify(large);
        }
    }
    public void print() {
        for (int i=1;i<=length/2;i++) {
            System.out.print("parent:"+arr[i]+" leftchild:"+arr[2*i]+" rightchild:"+arr[2*i+1]);
            System.out.println();
        }
    }
}
