package com.randommurican.practiceSudoku;

public class Driver {
	public static void main(String[] args) {
		boolean success = false;
		int count = 0;
		Board board;
		do {
			board = new Board();
			success = board.getSuccess();
			System.out.println(count++);
		} while(!success);
		System.out.println("Success in " + count + " tries. Board:");
		board.printBoard();
		
		
	}
}
