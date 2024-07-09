package com.weco;

public class App {

    public static void main(String[] args) {
	Horse h = new Horse("Gero");
	h.move(167, 428);

	Pegasus p = new Pegasus("Titanus");
	p.move(33, 146);
	p.fly(466);
    }
}