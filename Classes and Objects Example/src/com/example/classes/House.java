package com.example.classes;

public class House   //class house
{
    private int noofwindows;
    private int noofdoors;
    private String typeofroof;
    private String typeofwall;

    public House() //constructor
    {
        noofdoors=0;
        noofwindows=0;
        typeofroof=null;
        typeofwall=null;
    }
    public House(int noofwindows,int noofdoors,String typeofroof,String typeofwall)
    {
        this.noofdoors=noofdoors;
        this.noofwindows=noofwindows;
        this.typeofroof=typeofroof;
        this.typeofwall=typeofwall;
    }
    public int getNrOfWindows()
    {
        return noofwindows;
    }

    public int getNoofdoors() {
        return noofdoors;
    }

    public String getTypeofroof() {
        return typeofroof;
    }

    public String getTypeofwall() {
        return typeofwall;
    }
    public void setNoofwindows(int noofwindows)
    {
        this.noofwindows=noofwindows;
    }

    public void setNoofdoors(int noofdoors) {
        this.noofdoors = noofdoors;
    }

    public void setTypeofroof(String typeofroof) {
        this.typeofroof = typeofroof;
    }

    public void setTypeofwall(String typeofwall) {
        this.typeofwall = typeofwall;
    }
}
