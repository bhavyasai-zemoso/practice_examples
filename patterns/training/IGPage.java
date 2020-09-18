package com.patterns.training;
import java.util.List;
import java.util.ArrayList;
public class IGPage implements Subject{
	
	private List<Follower> followers = new ArrayList<>();
	private String post_name;
	
	@Override
	public void follow(Follower follower) {
		followers.add(follower);
	}
	
	@Override
	public void notify_post() {
		for(Observer o : followers) {
			o.post();
		}
	}
	@Override
	public void upload(String post_name) {
		this.post_name = post_name;
		System.out.println(this.post_name);
		notify_post();
	}
}
