/*						-----------------------------------------
 * 						|	Filename	: Disariun.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2016					|
 * 						|	Question 	: 7						|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * A disarium number is a number in which the sum of the digits to the power of their respective
 * position is equal to the number itself.
 *	Example: 135 = 1^1 + 3^2 + 5^3
 *  Hence, 135 is a disarium number.
 *  Design a class Disarium to check if a given number is a disarium number or not. Some
 *    of the members of the class are given below:
 *		Class name 							:	Disarium
 *		Data members/instance variables		:
 *			int num							: 	stores the number
 *			int size						: 	stores the size of the number
 *		Methods/Member functions			:
 *			Disarium(int nn)				: 	parameterized constructor to initialize the data
 *							  	  			  	members n = nn and size = 0
 *			void countDigit( )				: 	counts the total number of digits and assigns it 
 *			                                  	to size
 *			int sumofDigits(int n, int p) 	: 	returns the sum of the digits of the number(n)
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------

import java.util.Scanner;
public class Disarium{ 
	int num,size;
	static Scanner sc=new Scanner(System.in);
	Disarium(int nn){
		num=nn;
		size=0;
	}
	void countDigits(){ 
		int a=num;
		while(a!=0){ 
			a=a/10;
			size++;
		}
	}
	int sumofDigits(int n, int p){ 
		return (n==0)? 0: sumofDigits(n/10,p-1) + (int)Math.pow(n%10,p);
	}
	void check(){ 
		if(num==sumofDigits(num,size))
			System.out.print("\n Disarium Number");
		else
			System.out.print("\n Not a Disarium Number");
	}
	static void main(){ 
		System.out.println("Input a Number");
		int m=sc.nextInt();
		Disarium x= new Disarium(m);
		x.countDigits();
		x.check();
	}
}

// ------------------------------------{END OF THE CODE}-----------------------------------------