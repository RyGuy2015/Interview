package com.dpslink.interview;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	private int userSelection;
	private boolean keepGoing;
	
	Scanner scanner = new Scanner(System.in);
	
	public Menu() {
		this.keepGoing = true;
	}

	public boolean showMenu() {
		printMenu();
		this.userSelection = getUserSelection();
		if(testVal(this.userSelection)) {
			executeMenuOption(this.userSelection);
		} else {
			tryAgain(this.userSelection);
		}
		return keepGoing;
	}
	
	public void printMenu() {
		System.out.println("/*****************************/");
		System.out.println("1 - Prime Numbers");
		System.out.println("2 - Fun With Arrays");
		System.out.println("3 - Numbers");
		System.out.println("4 - Quit");
		System.out.println("/*****************************/");		
		System.out.println("Please choose a menu option:");
	}
	
	private int getUserSelection() {
		try{
			userSelection = scanner.nextInt();
			return userSelection;
		} catch (InputMismatchException e) {
			System.out.println("IndexOutOfBoundsException" + e.getMessage());
			userSelection = -1;
			return userSelection;			
		}
	}
	
	private boolean testVal(int userSelection) {
		if (userSelection >= 1 && userSelection <= 3 ) {
			return true;
		} else { 
			return false; 
		}
	}
	
	private void tryAgain(int userSelection) {
		System.out.println(userSelection + " is not a valid option. Try again.");
		showMenu();
	}
	
	
	public void pause() {
		scanner.nextLine();
		scanner.nextLine();
	}
	
	public void executeMenuOption(int userSelection) {
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		
		switch (userSelection) {
		case 1:
			PrimeNumbers primeNumber = new PrimeNumbers();
			primeNumber.setRange();
			primeNums = primeNumber.findPrimes(primeNumber.getFirstNumber(), primeNumber.getLastNumber());
			primeNumber.printRange(primeNums);
			pause();
			break;
		case 2:
			FunWithArrays arrayOption = new FunWithArrays();
			pause();
			break;
		case 3:
			Numbers number = new Numbers();
			number.setRange();
			number.printRange();
			pause();
			break;
		case 4:
			keepGoing = false;
			break;
		
		}
		
	}
}
