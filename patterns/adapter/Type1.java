package com.patterns.adapter;

public class Type1 implements OldCharger {

	@Override
	public void width() {
		System.out.println("small width");

	}

	@Override
	public void maxPowerOutput() {
		System.out.println("power output is 2.5W");
	}

}
