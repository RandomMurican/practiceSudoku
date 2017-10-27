package com.randommurican.practiceSudoku;

public class Driver {
	public static void main(String[] args) {
		
		// Just playing around with a concept here
		int BOARD_SIZE = 9;
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++)
				System.out.print((int) (3 * Math.ceil(i/3) + Math.ceil(j/3)) + " ");
			System.out.println("");
		}
	}
}
