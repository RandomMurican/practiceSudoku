package com.randommurican.practiceSudoku;

import java.util.Random;

public class Board {
	private boolean success;
	private int[][] board;
	private static int BOARD_SIZE = 9;

	Board() {
		success = true;
		board = new int[BOARD_SIZE][BOARD_SIZE];
		for(int ROW = 0; ROW < BOARD_SIZE; ROW++)
			for(int COLUMN = 0; COLUMN < BOARD_SIZE; COLUMN++)
				if(setValue(ROW, COLUMN)) {}
				else {
					//System.out.println("There was an error on panel " + ROW + ", " + COLUMN + "\n\n");
					success = false;
					ROW = BOARD_SIZE;
					COLUMN = BOARD_SIZE;
				}
		
	}
	
	private boolean setValue(int ROW, int COLUMN) {
		Random rand = new Random();
		int START = rand.nextInt(9) + 1;
		int VALUE = START;
		do {
			if(checkGrid(ROW, COLUMN, VALUE) && checkRow(ROW, VALUE) && checkColumn(COLUMN, VALUE)) {
				board[ROW][COLUMN] = VALUE;
				return true;
			}
			if(VALUE == BOARD_SIZE)
				VALUE = 1;
			else
				VALUE++;
		} while(VALUE != START);
		return false;
	}
	
	private boolean checkGrid(int ROW, int COLUMN, int VALUE) {
		boolean test = true;
		for(int BOARD_ROW = 0; BOARD_ROW < BOARD_SIZE; BOARD_ROW++)
			for(int BOARD_COLUMN = 0; BOARD_COLUMN < BOARD_SIZE; BOARD_COLUMN++)
				if((int) (3 * Math.ceil(ROW/3) + Math.ceil(COLUMN/3)) == (int) (3 * Math.ceil(BOARD_ROW/3) + Math.ceil(BOARD_COLUMN/3)))
					if(board[BOARD_ROW][BOARD_COLUMN] == VALUE)
						return false;
		return test;
	}
	
	private boolean checkRow(int ROW, int VALUE) {
		boolean test = true;
		for(int BOARD_COLUMN = 0; BOARD_COLUMN < BOARD_SIZE; BOARD_COLUMN++) {
			if(board[ROW][BOARD_COLUMN] == VALUE)
				return false;
		}
		return test;
	}
	
	private boolean checkColumn(int COLUMN, int VALUE) {
		boolean test = true;
		for(int BOARD_ROW = 0; BOARD_ROW < BOARD_SIZE; BOARD_ROW++) {
			if(board[BOARD_ROW][COLUMN] == VALUE)
				return false;
		}
		return test;
	}
	
	public void printBoard() {
		for(int ROW = 0; ROW < BOARD_SIZE; ROW++) {
			for(int COLUMN = 0; COLUMN < BOARD_SIZE; COLUMN++) {
				if(COLUMN == 3 || COLUMN == 6)
					System.out.print("| ");
				System.out.print(board[ROW][COLUMN] + " ");
			}
			System.out.println("");
			if(ROW == 2 || ROW == 5)
				System.out.println("---------------------");
		}
	}
	
	public boolean getSuccess() {return success;}
}

/*    Just for reference
00 01 02 | 03 04 05 | 06 07 08
10 11 12 | 13 14 15 | 16 17 18
20 21 22 | 23 24 25 | 26 27 28
------------------------------
30 31 32 | 33 34 35 | 36 37 38
40 41 42 | 43 44 45 | 46 47 48
50 51 52 | 53 54 55 | 56 57 58
------------------------------
60 61 62 | 63 64 65 | 66 67 68
70 71 72 | 73 74 75 | 76 77 78
80 81 82 | 83 84 85 | 86 87 88
*/