package com.oops.java;


public class King extends Piece{
		
		public King(boolean white){
		super(white);
		}
	
		@Override
		public boolean move(Board board, Board x, Board y) {
			if(y.getPiece().isWhite()==this.isWhite())
				return false;
		}
		
}
