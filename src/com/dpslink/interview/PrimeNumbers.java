package com.dpslink.interview;

import java.util.ArrayList;

public class PrimeNumbers extends Numbers{

	public PrimeNumbers() {
		super();
		
	}

	public ArrayList<Integer> findPrimes(int firstNumber, int lastNumber) {
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		int countPrimes = 0;
		
		for (int i=firstNumber; i<=lastNumber; i++) {
			boolean isPrime = true;
			
			for (int j=2; j <i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				primeNums.add(i);
				countPrimes++;
			}
		}
		
		return primeNums;
	}

	public void printRange(ArrayList<Integer> primeNums) {
		primeNums.forEach((a)->System.out.print(a + " ") );;
		System.out.println();
	}
}
