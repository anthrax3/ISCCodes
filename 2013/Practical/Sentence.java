/*						-----------------------------------------
 * 						|	Filename	: Sentence.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2013					|
 * 						|	Question 	: 3	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A palindrome is a word that may be read the same way in either direction. Accept a sentence 
 *	in UPPER CASE which is terminated by either ".", "?", or "!". Each word of the sentence is 
 *	separated by a single blank space.
 *	Perform the following taks:
 *	    1. Display the count of palindromic words in the sentence.
 *   	2. Display the palindromic words in the sentence.
 *	Example of palindromic words:
 *		MADAM, ARORA, NOON
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Sentence{
	public static void main(String args[])throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str, t, r; int l, i, c; char ch;
	System.out.println("Enter a sentence (terminated by '.','?', '!') : ");
	str = br.readLine();
	l = str.length();
	c = 0; 
	t = ""; 
	r = ""; 
	for(i=0; i < l; i++){
		ch = str.charAt(i);
		if(ch == ' ' || ch == '.' || ch == '?' || ch == '!'){
		    if(t.equals(r)){
		        System.out.print(t+" ");
		        c++; 
		    }
		    t = "";
		    r = "";
		}
		else{
			t = t + ch; 
    		r = ch + r; 
		}
	}
	System.out.println("\nNO OF PALINDROMIC WORDS: "+c);
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------