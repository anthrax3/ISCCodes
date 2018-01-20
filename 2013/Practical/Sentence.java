/* Filename	: Sentence.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2013
 * Question : 3
 */
/*
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
 *-----------------------------------------------------------------------------------------------
 */ 
import java.io.*;
class Sentence{
	public static void main(String args[])throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str, t, r; int l, i, c; char ch;
	System.out.println("Enter a sentence (terminated by '.','?', '!') : ");
	str = br.readLine();
	l = str.length();
	c = 0; // TO COUNT PALINDROMIC WORDS
	t = ""; // TO STORE A WORD
	r = ""; // TO STORE THE REVERSED WORD
	for(i=0; i < l; i++){
		ch = str.charAt(i);
		//CHECK FOR BLANK OR SENTENCE TERMINATOR
		if(ch == ' ' || ch == '.' || ch == '?' || ch == '!'){
			//IF BOTH THE WORD AND REVERSED WORD MATCH, IT IS A PALINDROME
		    if(t.equals(r)){
		        System.out.print(t+" ");
		        c++; 
		    }
		    //RESET THE VARIABLES TO STORE THE NEXT WORD
		    t = "";
		    r = "";
		}// IF
		else{
		    //STORING CHARACTERS TO FORM A WORD
			t = t + ch; 
    		//STORING CHARACTERS IN REVERSE ORDER TO GET REVERSED WORD
    		r = ch + r; 
		}//ELSE
	}//END OF FOR LOOP
	System.out.println("\nNO OF PALINDROMIC WORDS: "+c);
	}//end of main
}//end of class
