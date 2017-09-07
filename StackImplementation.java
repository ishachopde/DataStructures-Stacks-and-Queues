package com.datastructures.Stacks;

public class StackImplementation {

    int stack[] = new int[5];
    int top;

    StackImplementation(){
        top =-1;
    }

    public void push(int item){
        if(top>stack.length) {
            System.out.println("Stack overflow");
        }
        else {

            top++;
            stack[top]=item;

            System.out.print(stack[top]+ " ");
        }
    }

    public int pop(int item){
        if(stack[top]!=item){
            System.out.println("Check item value");
        }
        else
        {

            item = stack[top];
            top--;
            System.out.println();
            System.out.println(stack[top]);
        }
        return item;
    }

    public static void main(String args[]){
        StackImplementation si= new StackImplementation();
        si.push(5);
        si.push(6);
        si.pop(6);
    }

}
