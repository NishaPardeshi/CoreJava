package com.designpattern.structural.decorator;
/**
 * 
 * @author pardeshi_n
 *Concrete Decorators � 
 *Extending the base decorator functionality and modifying the component behavior accordingly. 
 *We can have concrete decorator classes as LuxuryCar and SportsCar.
 */
public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		car.assemble();
		System.out.println("Adding features of Sports Car");
	}

}
