package com.patterns.singleton;

public class Singleton{
	public static void main(String args[]){
		Single obj1= Single.getSingleton();
		Single obj2= Single.getSingleton();
	}
}
class Single{
	static Single singleton_obj = new Single();

	private Single() {
		System.out.println("Creating instance once");
	}

	public static Single getSingleton() {
		return singleton_obj;	
		}
}


