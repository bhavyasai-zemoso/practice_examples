package com.oops.java;

public class Game {
	public static void main(String a[]) {
		private Board board;
		board.initializeBoard();
		public Boolean playerMove(int x1 , int y1 , int x2 , int y2){
		Box start = board[x1][y1];
		Box end = board[x2][y2];
		Piece currPlayer = start.getPiece();
		currPlayer.move(board , start , end);
		
		}
		}
}

