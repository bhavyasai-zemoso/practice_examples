package com.patterns.adapter;

public class ChargerAdapter implements newCharger {
	
	OldCharger old;
	public ChargerAdapter(OldCharger old) {
		this.old=old;
	}
	@Override
	public void topSpeed() {
		old.maxPowerOutput();

	}

}
