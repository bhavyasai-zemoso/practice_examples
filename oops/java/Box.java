package com.oops.java;

public class Box {
	private Piece piece;
	private int x;
	private int y;
	
	public Box(int x,int y,Piece piece){
	this.setPiece(piece);
	this.setX(x);
	this.setY(y);
	}
	
	public void setPiece(Piece piece){
		this.piece = piece;
	}
	public Piece getPiece(){
		return this.piece;
	}
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return this.x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getY(){
		return this.y;
	}
}
