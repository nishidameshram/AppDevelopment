package com.example.classes;

public class DriverClass
{
    public static void main(String[] args)
    {
        House house=new House(10,2,"Tiles","Brick");
        house.setNoofdoors(3);
        house.setTypeofwall("Plaster");

        System.out.println("House:");
        System.out.println("Number of windows: " +house.getNrOfWindows());
        System.out.println("Number of doors: " + house.getNoofdoors());
        System.out.println("Type of roof: " + house.getTypeofroof());
        System.out.println("Type of wall: " +house.getTypeofwall());

    }

}
