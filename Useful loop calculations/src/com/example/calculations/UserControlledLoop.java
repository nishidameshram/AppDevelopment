package com.example.calculations;

import javax.swing.*;

public class UserControlledLoop {
    public static void main(String[] args) {
        int maxValue;
        String input= JOptionPane.showInputDialog("how high should i go to square the number?");

        maxValue=Integer.parseInt(input); //4
        System.out.println("Number          Number squared");
        System.out.println("------------------------------");
        for( int number=1; number<=maxValue; number++)
        {
            System.out.println(number + "\t\t" +number*number);
        }
    }
}
