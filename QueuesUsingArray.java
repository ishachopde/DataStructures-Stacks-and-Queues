package com.datastructures.Queues;

public class QueuesUsingArray {
    int size =8;
    int[] queue =new int[size];
    int front = -1, rear = -1;


    public void enQueue(int value){
      if(rear == size-1){
         System.out.println("Full");
     }
     else{
         rear++;
         queue[rear] = value;
      }
      System.out.println(queue[rear]);
}

    public void deQueue(){
       // front = 0;

        if(front == rear){
            System.out.println("Empty");
        }
        else{
            front++;
            for(int i=front+1;i<=rear;i++){
                System.out.println(queue[i]);
           }
        }
    }

    public static void main(String args[]){
        QueuesUsingArray qua =  new QueuesUsingArray();
        qua.enQueue(6);
        qua.enQueue(4);
        qua.enQueue(2);
        qua.enQueue(1);
        System.out.println("---------------");
        qua.deQueue();
       qua.enQueue(3);
        System.out.println("---------------");
       qua.deQueue();
       




    }



}


