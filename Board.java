package com.randommurican.practiceSudoku;

public class Board {
	private int[][] board;
	
	Board() {
		board = new int[9][9];
		for(int i = 0; i < 9; i++)
			for(int j = 0; j < 9; j++)
				if(setValue(i, j)) {}
				else {
					System.out.println("There was an error on panel " + i + ", " + j);
					i = 9;
					j = 9;
				}
	}
	
	private boolean setValue(int i, int j) {
		
		return false;
	}
	
	private int getGrid(int i, int j) {
		return (int) (3 * Math.ceil(i/3) + Math.ceil(j/3));
	}
}

/* 
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