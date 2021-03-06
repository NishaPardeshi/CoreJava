package com.designpattern.behavioural.chainOfResponsibility;
/**
 * 
 * @author pardeshi_n
 *Concrete Chain Implementations
 *We need to create different processor classes that will implement the DispenseChain interface 
 *and provide implementation of dispense methods. 
 *Since we are developing our system to work with three types of currency bills � 50$, 20$ and 10$, 
 *we will create three concrete implementations.
 */
public class Dollar10Dispenser implements DispenseChain {
	private DispenseChain chain;
	@Override
	public void setNextCHain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency curr) {
		if(curr.getAmount() >= 10) {
			int num = curr.getAmount()/10;
			int remainder = curr.getAmount()%10;
			System.out.println("Dispensing "+num+" 10$ note");
			if(remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			} 
		} else {
			this.chain.dispense(curr);
		}
	}

}
