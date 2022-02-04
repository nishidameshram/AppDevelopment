package com.example.textfiles;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args)throws IOException
    {

        File file = new File("OutputFile.txt");

        if(file.exists())
        {
            Scanner inputFile=new Scanner(file);

            System.out.println(inputFile.nextLine());
            System.out.println(inputFile.nextLine());
            System.out.println(inputFile.nextLine());
            System.out.println(inputFile.nextLine());

            inputFile.close();
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "The file does" + "not exist!");
        }

    }
}
