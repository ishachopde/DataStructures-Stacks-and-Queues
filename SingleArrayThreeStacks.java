package com.datastructures.Stacks;

public class SingleArrayThreeStacks {
    int sizeofarray, numofstacks;
    int[] top; // indexes of the top elments of the stack
    int[] array; // actual array which stores the values of three stcks
    int[] next; // array similarto size of array[] to store next entry in all stacks and free list
    int available; // to store beginning index of free list

    public SingleArrayThreeStacks(int sizeofarray, int numofstacks){
        sizeofarray = sizeofarray;
        numofstacks = numofstacks;
        array = new int[sizeofarray];
        next = new int[sizeofarray];
        top = new int[numofstacks];

        //initialize all stacks as empty
        for(int i = 0;i<top.length-1;i++){
            top[i]=-1;
        }

        available = 0;
        for(int i =0;i<sizeofarray-1;i++){
            next[i]= i+1;
            next[sizeofarray-1]=-1; //indiactes end of free list
        }
    }

    public void push(int value, int stacknumber){
        // stacknumber is from 0 to numofstacks-1

        int avail = available;
        available = next[avail];
        next[avail] = top[stacknumber];
        top[stacknumber]= avail;

        array[avail]=value;
        System.out.println("value pushed in array from stack number "+stacknumber+" is "+array[avail]);
        System.out.println(available+" "+next[avail]);
         }

    public void pop(int stacknumber){
        int indexoftop = top[stacknumber];
        top[stacknumber]= next[indexoftop];
        next[indexoftop] = available;
        available = indexoftop;
        System.out.println(array[available]);
    }

    public static void main(String args[]){
        SingleArrayThreeStacks s = new SingleArrayThreeStacks(9,3);
        s.push(5,0);
        s.push(6,0);
        s.pop(0);
        s.pop(0);
    }

}
