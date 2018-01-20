/* Filename	: Numbers.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2010
 * Question : 2
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Given the two positive integers p and q, where p < q. Write a program to determine how many 
 * 	kaprekar numbers are there in the range between 'p' and 'q'(both inclusive) and output them.
 *	About 'kaprekar' number:
 *		A positive whole number 'n' that has 'd' number of digits is squared and split 
 *		into 2 pieces, a right hand piece that has 'd' digits and a left hand piece that 
 *		has remaining 'd' or 'd-1' digits. If sum of the pieces is equal to the number 
 *		then it's a kaprekar number.
 *-----------------------------------------------------------------------------------------------
 */
import java.util.*;
class KaprekarNumber{
	public static void main(String args[])throws InputMismatchException{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range : ");
		int p=scan.nextInt();
		int q=scan.nextInt();
		int d,i,n,a,b,s,freq;
		freq=0;// to find the frequency of kaprekar numbers
		System.out.println("The Kaprekar numbers are : ");
		for(i=p;i<=q;i++){
			n=i;
			d=0;//to store the number of digits
			while(n>0){
				d++;
				n/=10;
			}
			s=i*i;// find the square of the number
			//extract 'd' digits from the right of the square 
			//of the number
			a=s%(int)Math.pow(10,d);
			//extract 'd' or 'd-1' digits from the left of the square 
			//of the number
			b=s/(int)Math.pow(10,d);
			//Check if the two parts add up to the original number
			//i.e. Condition for Kaprekar number
			if(a+b==i){
				System.out.print(i+" ");
				freq++;
			}
		}
		System.out.println("\nFREQUENCY OF KAPREKAR NUMBER IS : "+freq);
	}
}
