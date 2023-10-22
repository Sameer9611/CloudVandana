package com.demo.d1;

import java.awt.AlphaComposite;
import java.util.Scanner;

public class CheckPanagram {
	
	
	public static Boolean  checkLogic(String input) {
		String albhabet ="abcdefghijklmnopqrstuvwxyz";
		

		for (int i = 0; i < albhabet.length(); i++) {
			int temp=0;
			for (int j = 0; j < input.length(); j++) {
				if(albhabet.charAt(i)==input.toLowerCase().charAt(j)) {
					temp++;
				}
			}
			if(temp==0) {
				return false;
			}
		}
		return true;
				
	
	}
	
	public static void main(String[] args) {
		System.out.print("Enter String here:");
		Scanner scanner = new Scanner(System.in);
		
		if(checkLogic(scanner.nextLine())==true) {
			System.out.println("Entered line is a Panagram");
		}
		else {
			System.out.println("Entered Line is not a Panagram");
		}
		
		main(args);
		
	}

}
