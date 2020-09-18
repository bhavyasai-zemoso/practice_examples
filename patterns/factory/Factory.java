package com.patterns.factory;

public class Factory {
	
	public static void main(String[] args) {
		FactoryImplement fi = new FactoryImplement();
		OS obj = fi.getInstance("IOS");
		obj.specifications();
	}
}
