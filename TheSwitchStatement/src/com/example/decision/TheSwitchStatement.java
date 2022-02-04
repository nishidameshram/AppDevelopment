package com.example.decision;

import javax.swing.*;

public class TheSwitchStatement {
    public static void main(String[] args) {
        int number;
        String input= JOptionPane.showInputDialog("Pls enter 1,2 or 3:");
        number= Integer.parseInt(input);
        switch (number)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"You entered 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"You entered 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"You entered 3");
                break;
            default:
                JOptionPane.showMessageDialog(null,"u didnt enter 1,2 or 3!!!");
        }
        System.exit(0);
    }
}
