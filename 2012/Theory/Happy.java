/*						-----------------------------------------
 * 						|	Filename	: Happy.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2012					|
 * 						|	Question 	: 10	   				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A happy number is a number in which the eventual sum of the square of the digits of the 
 * 	number is equal to 1.
 *	Example :
 *		28 = 2^2 + 8^2 = 4 + 64 = 68
 *			68 = 6^2 + 8^2 = 36 + 64 = 100 
 *				100 = 1^2 + 0^2 + 0^2 = 1 + 0 + 0 = 1
 *	Hence 28 is a happy number.
 *	Design a class Happy to check if a given number is a happy number. 
 *	Some of the members of the class are given below:
 *		Class Name						:	Happy
 *		Data Members/instance variables	:	
 *			n							:	stores the number
 *		Member functions				:
 *			Happy() 					:	constructor to assign 0 to n
 *			void getnum(int nn) 		:	to assign the parameter value to the number n = nn
 *			int sum_sq_digits(int x)	:	returns the sum of the square of the digits of the 
 *											number x, using the recursive technique.
 *			void ishappy()				:	checks if the given number is a happy by calling 
 *											the functionsum_sq_digits(int) and displays an 
 *											appropriate message.
 *	Specify the class Happy giving details of the constructor( ), void getnum( int), 
 *	intsum_sq_digits(int) and void ishappy(). Also define a main function to create an object 
 *	and call the methods to check for a happy number.
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Happy{
	int n,j;
 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	Happy(){            
  		n=0;
  	}
  	void getnum(int nn){
   		n=nn;
   	}
   	int sum_sq_digits(int x){
   		if(x/10==0)
			return x*x;
		else
			return (int)Math.pow(x%10,2)+ sum_sq_digits(x/10);
   	}
 	void ishappy(){
  		while((j=sum_sq_digits(n))/10!=0)       
			n=j;				
		if ( j==1)
			System.out.println("It is a happy number ");
		else
			System.out.println("Not a happy number");
	}
	public static void main(String args[]) throws Exception{
 		Happy ob = new Happy();
 		int x;
 		System.out.println("Enter the number:");
 		x=Integer.parseInt(ob.br.readLine());
 		ob.getnum(x);
 		ob.ishappy();
 	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------