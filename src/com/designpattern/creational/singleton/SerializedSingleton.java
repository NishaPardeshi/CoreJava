package com.designpattern.creational.singleton;

import java.io.Serializable;

/**
 * 
 * @author pardeshi_n
 *Sometimes in distributed systems, we need to implement Serializable interface in Singleton class so 
 *that we can store it�s state in file system and retrieve it at later point of time. 
 *Here is a small singleton class that implements Serializable interface also.
 *The problem with above serialized singleton class 
 *is that whenever we deserialize it, it will create a new instance of the class.
 */
public class SerializedSingleton implements Serializable {
	private static final long serialVersionUID = -7604766932017737115L;
	private SerializedSingleton() {}
	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}
	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}
}
