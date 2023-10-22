package com.demo.d1;

import java.util.Scanner;

public class RomanToInteger {
	
	public static int inputRomanGetInteger(String input) {
		switch (input) {
		case "I":return 1;
		case "II":return 2;
		case "III":return 3;
		case "IV":return 4;
		case "V":return 5;
		case "VI":return 6;
		case "VII":return 7;
		case "VIII":return 8;
		case "IX":return 9;
		case "X":return 10;
		default:return 00;
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.print("Enter Roman Numerical:");
		Scanner scanner = new Scanner(System.in);
		System.out.println(inputRomanGetInteger(scanner.nextLine()));
		main(args);
	}

}
