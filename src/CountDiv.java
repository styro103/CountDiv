/*
 * Shaun Mbateng
 * Count Divisors
 * This program counts the number of divisors given a denominator and range.
 * This program has an O(1) time complexity.
 */
import java.util.Scanner; //For Inputs

public class CountDiv 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		int A; //Start Value in Range
		int B; //End Value in Range
		int K; //Denominator
		int count; //Number of Divisors
		DivCounter Divisors = new DivCounter();
		
		//Get Input Values
		System.out.print("Beginning Range Value: ");
		A = cin.nextInt(); //Start
				
		System.out.print("Ending Range Value: ");
		B = cin.nextInt(); //End
		
		System.out.print("Divisor: ");
		K = cin.nextInt(); //Denominator
		
		cin.close(); //No More Inputs Needed
		
		count = Divisors.getCount(A, B, K); //Get Count of Integers Divisible by K Within Range
		
		System.out.println(); //Print Line Space
		System.out.println("There are "+count+" integers divisible by "+K+" within the range "+A+" to "+B+"."); //Display Count
	}
}