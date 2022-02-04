package com.reading.input.scanner;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        int firstnum;
        int secnum;

        Scanner kb= new Scanner(System.in);
        System.out.println("Please enter the first number:");
        firstnum= kb.nextInt();
        System.out.println("Please enter secnd numbr:");
        secnum= kb.nextInt();

        double average= (firstnum + secnum) /2.0;

        System.out.println("the average is:" + average);


        String name;
        String surname;

        kb.nextLine();
        System.out.println("Please enter your name:");
        name=kb.nextLine();

        System.out.println("Please enter your surname:");
        surname=kb.nextLine();

        System.out.println(name+ " "+surname);

    }
}
