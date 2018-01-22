/*						-----------------------------------------
 * 						|	Filename	: Numbers.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2013					|
 * 						|	Question 	: 1	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	An ISBN ( International Standard Book Number) is a ten digit code which uniquely identifies 
 *	a book. The first nine digits represent the Group, Publisher and Title of the book and the 
 * 	last digit is used to check whether ISBN is correct or not.
 *
 *	Each of the first nine digits of the code can take a value between 0 and 9. Sometimes it is
 *	necessary to make the last digit equal to ten; this is done by writing the last digit of 
 *	the code as X. To verify an ISBN, calculate 10 times the first digit, plus 9 times the 
 *	second digit, plus 8 times the third and so on until we add 1 time the last digit. If the 
 *	final number leaves no remainder when divided by 11, the code is a valid ISBN.
 *		For example:
 *		    02011003311 = 10x0 + 9x2 + 8x0 + 7x1 + 6x1 + 5x0 + 4x3 + 3x3 + 2x1 + 1x1 = 55 
 *		    Since 55 leaves no remainder when divisible by 11, hence it is a valid ISBN.
 *
 *	Design a program to accept a ten digit code from the user. For an invalid input, display 
 *	an appropriate message. Verify the code for its validity in the format specified below:
 *			INPUT 	: 0201530821
 *			OUTPUT 	: SUM = 99
 *					  LEAVES NO REMAINDER - VALID ISBN CODE
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Numbers{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("INPUT CODE: ");
		String isbn = br.readLine();
		int l = isbn.length();
		int i, t, ctr, s;
		char ch;
		if(l!= 10){
			System.out.println("INVALID INPUT");
		}
		else{
			ctr = 10; s = 0;
			for(i=0;i < l;i++){
				ch = isbn.charAt(i);
				if(ch == 'X') 
					t = 10;
				else
					t = ch - 48; 
				s= s + ctr*t; 
				ctr--;
			}
			if(s%11 == 0){
				System.out.println("SUM = "+s);
				System.out.println("LEAVES NO REMAINDER - VALID ISBN CODE");
			}
			else{
				System.out.println("SUM = "+s);
				System.out.println("LEAVES REMAINDER - INVALID ISBN CODE");
			}
		}
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------