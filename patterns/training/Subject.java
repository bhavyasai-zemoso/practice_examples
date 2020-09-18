package com.patterns.training;

public interface Subject {

	void follow(Follower follower);

	void notify_post();

	void upload(String post_name);

}