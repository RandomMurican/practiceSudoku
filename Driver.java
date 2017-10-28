package com.randommurican.practiceSudoku;

public class Driver {
	public static void main(String[] args) {
		boolean success = false;
		long time = System.currentTimeMillis();
		int count = 0;
		Board board;
		do {
			board = new Board();
			success = board.getSuccess();
			count++;
		} while(!success);
		time = System.currentTimeMillis() - time;
		System.out.println("Success in " + count + " tries. Board:");
		board.printBoard();
		
		
	}
}
