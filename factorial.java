import java.util.*;
import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		
		//asking user to enter positive integer
		System.out.println("please enter positive integer ");		
		System.out.println();
		
	    
		int num = input.nextInt();
		
		int i = 1;
		int factorial = 1;
		while(i <= num) {
			factorial *= i ;
			i++;
		}
		System.out.printf("factorial of " + num + " is " + factorial);
	}
}
	
  