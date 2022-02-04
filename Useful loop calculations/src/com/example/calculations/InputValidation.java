package com.example.calculations;

import javax.swing.*;

public class InputValidation {
    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog(
                "Please enter a umber in the range 1-100");
        int number=Integer.parseInt(input);
        while (number<1 || number>100)
        {
            JOptionPane.showMessageDialog(null,
                    "That number is not valid");
            input=JOptionPane.showInputDialog("Pls enter number in range of 1-100");
            number=Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null,"CORRECT");
    }
}
