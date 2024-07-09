package com.weco;

public class Pegasus extends Horse {
    private int aPosZ;

    public Pegasus(String name) {
	super(name);
	this.aPosZ = 100;
    }

    public void move(int x, int y) {
	super.move(x, y);
	System.out.println("Le Pegase se deplace ( X = " + this.aPosX + " Y = " + this.aPosY + ")");
    }

    public void fly(int z) {
	this.aPosZ = z;
	System.out.println("Le Pegase s'eleve dans les airs ( Z = " + this.aPosZ + " )");
    }
}