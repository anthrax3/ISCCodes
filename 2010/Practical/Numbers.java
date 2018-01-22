/*						-----------------------------------------
 * 						|	Filename	: Numbers.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2010					|
 * 						|	Question 	: 2	    				|
 * 						-----------------------------------------
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
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.*;
class Numbers{
	public static void main(String args[])throws InputMismatchException{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range : ");
		int p=scan.nextInt();
		int q=scan.nextInt();
		int d,i,n,a,b,s,freq;
		freq=0;
		System.out.println("The Kaprekar numbers are : ");
		for(i=p;i<=q;i++){
			n=i;
			d=0;
			while(n>0){
				d++;
				n/=10;
			}
			s=i*i;
			a=s%(int)Math.pow(10,d);
			b=s/(int)Math.pow(10,d);
			if(a+b==i){
				System.out.print(i+" ");
				freq++;
			}
		}
		System.out.println("\nFREQUENCY OF KAPREKAR NUMBER IS : "+freq);
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------