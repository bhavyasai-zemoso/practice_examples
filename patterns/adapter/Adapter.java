package com.patterns.adapter;

public class Adapter {

	public static void main(String[] args) {
		
		OldCharger t1 = new Type1();
		newCharger t3 = new ChargerAdapter(t1); //wrapping type1 in charger adapter so that it acts like type2
		t3.topSpeed();
	}

}
