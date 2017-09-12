/*DEsign a stack that supports stack operations and a function to find the minimum element in the stack in constant time O(1)*/

package com.datastructures.Stacks;

import java.util.Stack;

public class StackMinElement extends Stack {
    Stack s;
    int minElement;

    StackMinElement(){
        s = new Stack();
    }

    public void push(int value){
       if(s.isEmpty()){
            minElement = value;
            s.push(value);
          // System.out.println("min element is "+minElement);
           System.out.println("inserted value is "+value);
           System.out.println("-------------------------");
           return;
       }
       if(value<minElement){
           int insertvalue = 2*value - minElement;
           minElement = value;
           s.push(insertvalue);
           System.out.println("inserted value is "+insertvalue);
          // System.out.println("--------------------------------");
       }
       else
       {
           s.push(value);
           System.out.println("inserted element is "+ value);
       }

        System.out.println("min element is "+ minElement);
       // System.out.println("inserted element is "+value);
        System.out.println("-----------------");
    }



    public void minElement(){
        if(s.empty()){
            System.out.println("Stack is empty ");
        }
        else
        {
            System.out.println("the min element is "+minElement);
        }
    }
    public static void main(String args[]){
        StackMinElement sme = new StackMinElement();
        //sme.minElement();
        sme.push(4);
       sme.push(5);
      sme.minElement();
        sme.push(3);
        sme.push(6);
        sme.minElement();
        //sme.pop();
    }
}
