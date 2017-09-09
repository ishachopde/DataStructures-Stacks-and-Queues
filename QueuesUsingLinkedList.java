package com.datastructures.Queues;

public class QueuesUsingLinkedList {

    class Node{
    int data;
    Node next;

    Node(){
        this.data = data;
        this.next = next;
    }
    }

    Node front = null;
    Node rear = null;


    public void enQueue(int value){
        Node newNode = new Node();
        newNode.next = null;
        newNode.data = value;
        if(rear == null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(newNode.data);
    }

    public int deQueue(){
        //Node temp = front;
        if(front==null){
            return 0;
        }
        else{
            while(front.next!=null) {
                front = front.next;
                System.out.println(front.data );
            }
        }

            return 0;
    }


    public static void main(String args[]){
        QueuesUsingLinkedList qull = new QueuesUsingLinkedList();
        qull.enQueue(6);
        qull.enQueue(4);
        qull.enQueue(2);
        qull.enQueue(0);
        System.out.println();
        qull.deQueue();
    }
}
