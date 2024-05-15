package com.java.game;

import java.util.Scanner;

public class NumberGuessing {
	public static void main(String args[]) {
		int guessNumber=(int) Math.round(Math.random()*5);
		Scanner obj=new Scanner(System.in);
		System.out.println("welcome to the Guesslend");
		System.out.println("Are you willing to play game: (yes/no)");
		String Willing =obj.next();
		
		
		int gameon=0;
		System.out.println("You have a three Chance");
		while(gameon<3) {
			
			System.out.println("Enter the number");
			
			double num=obj.nextDouble();
			
			if(Willing.equals("yes")) {
			if(guessNumber>num) {
				System.out.println("your enter number is near to guessNumber");
				
			}
			else if(guessNumber<num) {
				System.out.println("your Enter number is moved forward of the guessNumber");
				
			}
			else if(guessNumber==num) {
				System.out.println("Your won the game");
				break;
				
			}
			else {
				System.out.println("Your loss the Game");
				break;
			}
			}
			else {
				System.out.println("Your not interested in the game");
			}
			gameon++;
		}
	}

}
