package com.compare.strings;

import javax.swing.*;

public class CompareStrings {
    public static void main(String[] args) {
    String name1= JOptionPane.showInputDialog("Please enter name1:");
    String name2= JOptionPane.showInputDialog("Please enter name 2:");

    if(name1.compareTo(name2)==0)
    {
        System.out.println("Name1 is equal to name2");
    }
    else
    {
        System.out.println("Not equal");
    }
    System.exit(0);
    }
}
