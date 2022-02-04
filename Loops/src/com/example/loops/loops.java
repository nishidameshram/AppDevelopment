package com.example.loops;

public class loops {
    public static void main(String[] args) {
        int x=0;

        //while loop

        while(x<5) //pre-test loop
        {
            System.out.println("Hello world");
            x++;
        }
        System.out.println("");

        //do-whileloop

        int y=0;    //use when u want it to execute atleast once
        do {
            System.out.println("hello world!!");
            y++;
        }while(y<5); //post-test loop
        System.out.println("");

        //for loop
        for(int i=0; i<5;i++)   //pre-test loop
        {
            System.out.println("hiiii"); //use when u know how many times u want to execute
        }
    }
}
