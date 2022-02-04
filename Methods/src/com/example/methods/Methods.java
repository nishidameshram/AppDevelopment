package com.example.methods;

public class Methods
{
    public static void main(String[] args) {
        printavg(20,30);
        getavg(30,30);

    }
    public static void printavg(int val1, int val2)
    {
        double average=(val1 +val2)/2.0;
        System.out.println("Average:"+average);
    }
    public static void getavg(int val1,int val2)
    {
        double average =(val1+ val2)/2.0;
        System.out.println("Average:"+average);


    }
}
