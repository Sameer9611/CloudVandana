package com.demo.d1;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
	
	
	public static String getShuffledArray(int[] inputArray) {
		Random random = new Random();
		
		//could have used collections.shuffle
		for (int i = 0; i < inputArray.length; i++) {
			int randomIndex = random.nextInt(inputArray.length);
			int temporayNum = inputArray[randomIndex];
			inputArray[randomIndex] = inputArray[i];
			inputArray[i] = temporayNum;
		}
		return Arrays.toString(inputArray);
	}
	
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(getShuffledArray(array));
		
	}

}
