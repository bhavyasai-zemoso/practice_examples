package com.oops.java;

public class Board {

	Box[][] box;
	public Board(){
	this.initializeBoard();
	}
	public void initializeBoard(){

	box[0][0]=new Box(0,0,new King(true));
	box[1][3]=new Box(1,3,null);
	}
	}
