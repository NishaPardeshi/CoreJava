package com.designpattern.structural.flyweight;
/**
 * Notice that I have intensionally introduced delay in creating the Object of concrete classes to make the point 
 * that flyweight pattern can be used for Objects that takes a lot of time while instantiated.
 */
import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {
	//intrinsic property
    private boolean fill;
    
	public Oval(boolean f) {
		this.fill = f;
		System.out.println("Creating Oval Object");
		//adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void draw(Graphics circle, int x, int y, int width, int height,
			Color color) {
		circle.setColor(color);
		circle.drawOval(x, y, width, height);
		if(fill){
            circle.fillOval(x, y, width, height);
        }
	}

}
