package com.designpattern.behavioural.mediator;
/**
 * 
 * @author pardeshi_n
 *Colleague Interface
 *Users can send and receive messages, 
 *so we can have User interface or abstract class. 
 *I am creating User as abstract class like below.
 *Notice that User has a reference to the mediator object, 
 *it�s required for the communication between different users.
 */
public abstract class User {
	protected ChatMediator mediator;
	protected String name;
	public User(ChatMediator med, String name) {
		this.mediator= med;
		this.name = name;
	}
	public abstract void send(String msg);
	public abstract void receive(String msg);
}
