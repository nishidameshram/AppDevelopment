package com.example.calculations;

import javax.swing.*;

public class RunningTotals {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalsales=0.0; //running total
        String input= JOptionPane.showInputDialog("for how many days do we have sales? " +"figures");
        days=Integer.parseInt(input);
        for(int count=1; count<=days;count++)
        {
            input= JOptionPane.showInputDialog("Enter the sales for day"+count);
            sales =Double.parseDouble(input);
            totalsales=totalsales +sales;
        }
    JOptionPane.showMessageDialog(null,
            "The total sales are: $"+totalsales);
    System.exit(0);
    }
}
