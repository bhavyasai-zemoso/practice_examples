package com.patterns.training;

public class Follower implements Observer {

	
		private String name;
	
		public Follower(String name) {
			super();
			this.name = name;
		}

		@Override
		public void post() {
			System.out.println("Hey "+this.name+", check out my new post");
		}


}
