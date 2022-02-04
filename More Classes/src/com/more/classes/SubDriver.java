package com.more.classes;

public class SubDriver
{
    public static void main(String[] args)
    {
        Subject subject1 = new Subject("TPG10AB","Technical Programming 1");
        Subject subject2 = new Subject("TPG10AB","Technical Programming 1");

        if(subject1.equals(subject2))
        {
            System.out.println("They are the Same!");
        }
        System.out.println(subject1);
    }
}
