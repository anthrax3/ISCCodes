/*						-----------------------------------------
 * 						|	Filename	: Numbers.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2011					|
 * 						|	Question 	: 1	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * Write a program to input a natural number less than 1000 and display it in words. 
 *		For Example :
 *			Input: 29
 *			Output: TWENTY NINE
 *			Input: 17001
 *			Output: OUT OF RANGE
 *			Input: 119
 *			Output: ONE HUNDRED AND NINETEEN
 *			Input: 500
 *			Output: FIVE HUNDRED
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.*;
public class Numbers {	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt(); String a = Integer.toString(x); int len = a.length();
		String[] ones = {"",
			"one", "two", "three",
			"four", "five", "six",
			"seven", "eight", "nine"			
		};
		String[] tens = {"",
			"eleven", "twelve", "thirteen",
			"fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen"
		};
		String[] huns = {"",
		 	"ten", "twenty", "thirty",
			"fourty", "fifty", "sixty",
			"seventy", "eighty", "ninety"
		};
		int one=0;
		int hun=0;
		int thu=0;
		if(len==1)
			System.out.println(ones[x]);		
		else if(len==2){
			if(x>19){
				hun = Character.getNumericValue(a.charAt(0));
				one = Character.getNumericValue(a.charAt(1));
				System.out.println(huns[hun]+" "+ones[one]);
			}
			else if(x<20&&x>11)
				System.out.println(tens[x%10]);
		}
		else if(len==3){
			one = Character.getNumericValue(a.charAt(0));
			hun = Character.getNumericValue(a.charAt(1));
			thu = Character.getNumericValue(a.charAt(2));
			System.out.println(ones[one]+" hundred "+huns[hun]+" "+ones[thu]);
		}
	}
}

// ------------------------------------{END OF THE CODE}-----------------------------------------