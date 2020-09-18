package com.patterns.training;

public class Instagram {
	public static void main(String args[]) {
		IGPage page = new IGPage();
		Follower o1 = new Follower("Bhavya");
		Follower o2 = new Follower("Sai");
	
		page.follow(o1);
		page.follow(o2);
		page.upload("My new post!!!");
	
	}
}
