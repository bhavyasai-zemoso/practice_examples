package com.patterns.factory;

public class FactoryImplement {
	public OS getInstance(String os) {
		if(os.equals("Android"))
			return new Android();
		else
			return new IOS();
	}
}
