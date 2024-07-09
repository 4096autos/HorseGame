package com.weco;

public class Horse {
    protected String aName;
    protected int aPosX;
    protected int aPosY;

    public Horse(String name) {
	this.aName = name;
	this.aPosX = 50;
	this.aPosY = 50;
    }

    public void move(int x, int y) {
	this.aPosX = x;
	this.aPosY = y;
	//System.out.println("L'animal se deplace ( X = " + this.aPosX + " Y = " + this.aPosY + ")");
    }

}