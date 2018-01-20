/* Filename	: Sentence.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2010
 * Question : 3
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Input a paragraph containing 'n' number of sentences where (1<=n<=4). The words are to be 
 *	separated with single blank space and are in upper case. A sentence may be terminated either 
 *	with a full stop (.) or question mark (?).
 *	Perform the following:
 *		1. Enter the number of sentences, if it exceeds the limit show a message.
 * 	 	2. Find the number of words in the paragraph
 *   	3. Display the words in ascending order with frequency.
 *
 *-----------------------------------------------------------------------------------------------
 */
import java.io.*;
class Sentence{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str, t, r;
		int l, i, c;
		char ch;
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
			}
			else{
    			//STORING CHARACTERS TO FORM A WORD
    			t = t + ch; 
    			//STORING CHARACTERS IN REVERSE ORDER TO GET REVERSED WORD
    			r = ch + r; 
			}
		}
		System.out.println("\nNO OF PALINDROMIC WORDS: "+c);
	}
}
