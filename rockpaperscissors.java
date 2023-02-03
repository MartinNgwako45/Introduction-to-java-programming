package rockPaperScissors.java;

import java.util.*;
// import the scanner and the random functions
import java.util.Random;
import java.util.Scanner;


public class rockPaperScissors{
	// assign the max and the min numbers of the range that that will be used for the rondom
	static int min= 0;
	static int max= 2; 


	public static void main(String arg[]){
		// create new scanner
		Scanner hand= new Scanner(System.in);
		//get input from user 
		System.out.print("enter a number (0 for paper),(1 for rock),(2 for scisscors): ");

		// assign number to hand and use nextint to scan the input as an integer
		int number= hand.nextInt();

		// generate the random number in the earlier given range
		int comphand= (int)Math.floor(Math.random()*(max-min+1)+min);

		// print the random number 
		System.out.println(comphand);

		// if the user input and number randomly generated are equal print its a tie
		if (comphand == number){
			System.out.println("it's a tie");

			// if the user or the computer get rock and the other gets paper print paper wins
		}else if ((number == 1 && comphand == 0) || (number == 0 && comphand == 1)) {
			System.out.println("paper wins");

			// if the user or the computer get paper and the other gets scissor,print scissor wins
		}else if ((number == 2 && comphand == 0) || (number == 0 && comphand == 2)) {
			System.out.println("scissor wins");

			// if the user or the computer gets rock and the other gets scissor print rock wins
		}else if ((number == 1 && comphand == 2) || (number == 2 && comphand == 1)) {
			System.out.println("rock wins");
		}


	}

}
