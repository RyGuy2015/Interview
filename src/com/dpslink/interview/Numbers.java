package com.dpslink.interview;

import java.util.Scanner;

public class Numbers {
	Scanner scanner = new Scanner(System.in);

	private int firstNumber;
	private int lastNumber;
	
	public Numbers() {
		this.firstNumber = 0;
		this.lastNumber = 0;	
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}
	public int getLastNumber() {
		return lastNumber;
	}
	
	// This could break. Fix it.
	public void setRange() {
		boolean keepAskingForRange = true;
		while (keepAskingForRange) {
			System.out.println("Enter the first number in the range: ");
			this.firstNumber = scanner.nextInt();
			
			System.out.println("Enter the last number in the range: ");
			int tempNumber = scanner.nextInt();
			if (tempNumber > firstNumber) {
				lastNumber = tempNumber;
				keepAskingForRange = false;
			} else {
				System.out.println("The last number must be larger than the first number");
			}
		}
	}
	
	public void setRange(int firstNumber, int lastNumber) {
		if (firstNumber > lastNumber) {
			this.firstNumber = firstNumber;
			this.lastNumber = lastNumber;
		} else {
			System.out.println("The last number must be larger than the first number!");
		}
	}
	
	public void printRange () {
		for (int i=firstNumber; i<= lastNumber; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}
