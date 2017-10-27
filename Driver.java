package com.randommurican.practiceSudoku;

public class Driver {
	public static void main(String[] args) {
		int MOD_LIMIT = 9;
		for(int i = 0; i < MOD_LIMIT; i++) {
			for(int j = 0; j < MOD_LIMIT; j++)
				System.out.print((int) (3 * Math.ceil(i/3) + Math.ceil(j/3)) + " ");
			System.out.println("");
		}
	}
}
