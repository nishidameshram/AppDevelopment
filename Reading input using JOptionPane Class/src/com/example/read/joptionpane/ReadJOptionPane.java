package com.example.read.joptionpane;

import javax.swing.*;

public class ReadJOptionPane {
    public static void main(String[] args) {
        String name;
        String surname;
        name= JOptionPane.showInputDialog("Please enter your name:");
        surname= JOptionPane.showInputDialog("Please enter your surname");
        JOptionPane.showMessageDialog(null, name+ ""+surname);

        int firstnumber;
        int secndnmber;
        String input;

        input=JOptionPane.showInputDialog("Please enter ur first number:");
        firstnumber=Integer.parseInt(input);

        input=JOptionPane.showInputDialog("Please enter the second number:");
        secndnmber=Integer.parseInt(input);

        double average=(firstnumber+secndnmber)/2.0;  //this is the average bw first and second number
        JOptionPane.showMessageDialog(null, "Average:" +average);

    }
}

/*
Hiii nishida this is comment
 */