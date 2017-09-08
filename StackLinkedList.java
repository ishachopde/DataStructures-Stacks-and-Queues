package com.datastructures.Stacks;

public class StackLinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=next;
        }
    }

    Node top = null;

    public void push(int value){
        Node newNode = new Node(value);
        //newNode.data = value;

        if(top == null){
            newNode.next=null;
        }
        else{
            newNode.next = top;
        }
        top = newNode;
        System.out.println(value);
    }

    public void pop(){
        Node value =top;
        top = top.next;

            System.out.println("Removed item is "+ value.data+" "+"New top item is "+top.data);


        //return value;

    }
    public static void main(String args[]){
        StackLinkedList sll = new StackLinkedList();
        sll.push(5);
        sll.push(6);
        sll.push(7);
        sll.pop();

    }
}
