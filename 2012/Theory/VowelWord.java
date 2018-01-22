/*						-----------------------------------------
 * 						|	Filename	: VowelWord.java		|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2012					|
 * 						|	Question 	: 9	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Design a class VowelWord to accept a sentence and calculate the frequency of words that 
 *	begin with a vowel. The words in the input string are separated by a single blank space and 
 * 	terminated by a full stop. The description of the class is given below:
 *			Class Name						:	VowelWord
 *			Data members/instance variables	:
 *				str							:	to store a sentence
 *				freq						:	to store the frequency of words beginning with 
 *												a vowel.
 *			Member functions				:
 *				VowelWord()					:	constructor to initialize data members to legal 
 *												initial values.
 *				voidreadstr()				:	to accept a sentence.
 *				voidfreq_vowel()			:	counts the frequency of the words beginning 
 *												with a vowel.
 *				void display()				:	to display the original string and the frequency 
 *												of the words that begin with a vowel.
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class VowelWord{
	int freq; String str;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	VowelWord(){
 		freq=0; str="";
	}
	void readstr() throws Exception{
 		System.out.print("\nEnter the sentence:");
 		str=br.readLine();
	}
	void freq_vowel(){
		String s,s1; int i; freq=0; s=str.toUpperCase();
		while(true){
 			i=s.indexOf(" ");
 			if(i<0)
 				break;
		    s1=s.substring(0,i);
		    s=s.substring(i+1);
		    switch(s1.charAt(0)){
            	case 'A':
   				case 'E':
   				case 'I':
   				case 'O':
   				case 'U':
   				freq++;
  			}
		}
 		switch(s.charAt(0)){
		   case 'A':
		   case 'E':
		   case 'I':
		   case 'O':
		   case 'U':
		   freq++;
		}
	}            
	void display(){
 		System.out.print("\nEntered sentence:"+str + " and frequency of words started with vowel="+freq);
	}
	public static void main(String args[]) throws Exception{
 		VowelWord ob=new VowelWord();
 		ob.readstr(); ob.freq_vowel(); ob.display();
 	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------