import java.util.*;

public class averageNumber {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	
	
	// count the number of positive numbers
	int positive = 0;
	
	// count the number of negative numbers
	int negative = 0;
	
	// count all numbers
    int count = 0;
    
    // accumulate total
    double total = 0;
    
    
    
    // prompt the user to enter an integer and zero to show the end of the input
    System.out.print("enter an integer and zero to end the input:");
    int number = input.nextInt();
    
    
    // checking the type of integers entered
    if (number == 0) {
    	System.out.print("no numbers are entered excepet for zero");
    	System.exit(1);
    			
    }
    
// checking integer value
    while (number !=0) {
    if (number > 0) 
    	
    	// Increase positive
    	positive++;
    else
    	
    	// Increase negatives
    	negative++;
    
    // accumulate total
    total += number;
    
    // increase the total 
    count++;
    number = input.nextInt();
    
			
	}

    // calculate the average
   double average = total / count;

    		
    // display results
   System.out.print(
		   "the number of positive is " + positive +
		   "\nthe number of negative is " + negative +
		   "\nthe total is total " + total +
		   "\nthe average is " + average		   
		   );    
	}
}