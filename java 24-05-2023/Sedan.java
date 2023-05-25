package com.Java;

public class Sedan  implements Car{
	 @Override
	    public void start() {
	        System.out.println("Sedan starting...");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Sedan stopping...");
	    }

	    @Override
	    public void accelerate() {
	        System.out.println("Sedan accelerating...");
	    }

	    @Override
	    public void brake() {
	        System.out.println("Sedan braking...");
	    }
	
 public static void main(String[] args) {
 	Sedan sedan = new Sedan();
     sedan.start();
     sedan.accelerate();
     sedan.brake();
     sedan.stop();
 }
}
