package com.dpslink.interview;

public class Main {

	public static void main(String[] args) {
		boolean keepLooping = true;
		while(keepLooping) {
			Menu menu = new Menu();
			keepLooping = menu.showMenu();	
		}
	}
}
