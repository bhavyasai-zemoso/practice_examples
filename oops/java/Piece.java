package com.oops.java;

public abstract class Piece {
	private boolean white=false;
	public Piece(boolean white){
	this.setWhite(white);
	}
	public void setWhite(boolean white){
	this.white=white;
	}
	public Boolean isWhite(){
	return this.white == true;
	}
	public abstract boolean move(Board board , Board start , Board end);
}
