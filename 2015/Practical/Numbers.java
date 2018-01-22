/*						-----------------------------------------
 * 						|	Filename	: Numbers.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2015					|
 * 						|	Question 	: 1 					|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	Given two positive numbers M and N, such that M is between 100 and 10000 and 
 *	N is less than 100. Find the smallest integer that is greater than M and whose
 *	digits add up to N. 
 *
 * 	For example, if M=100 and N=11, then the smallest integer greater than
 *	100 whose digits add up to 11 is 119.
 *
 *	Write a program to accept the numbers M and N from the user and print the 
 *	smallest required number whose sum of all its digits is equal to N. 
 *	Also, print the total number of digits present in the required number. 
 *	The program should check for the validity of the inputs and display an 
 *	appropriate message for an invalid input.
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------

import java.util.*;
class Numbers{
	public static void main(String args[])throws InputMismatchException{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter M and N where M is between 100 and 10000 and N is less than 100");
		int m=scan.nextInt();
		byte n = scan.nextByte();
		if(m < 100 || m > 10000){
			System.out.println("INVALID INPUT");
		}
		else if(n >=100){
			System.out.println("INVALID INPUT");
		}
		else{
			int p = m,t;
			byte sum,nod;
			do{
				t = p++; // copy number and increment it for next number
				sum = 0;
				nod = 0;
				//find the sum of digits of the number
				while(t > 0){
				    sum = (byte)(sum + t%10); //extract digit and calculate sum
				    t = t/10;
				    nod++; //count digits
				}
			}while(sum != n); // keep repeating until the sum is not equal to the number n
			System.out.println("The required number = "+(p-1));
			System.out.println("Total number of digits = "+(nod));
	 	}
	}
}

// ------------------------------------{END OF THE CODE}-----------------------------------------