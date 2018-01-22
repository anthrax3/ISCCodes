/*						-----------------------------------------
 * 						|	Filename	: Exchange.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2013					|
 * 						|	Question 	: 9	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Design a class Exchange to accept a sentence and interchange the first alphabet with the 
 * 	last alphabet for each word in the sentence, with single letter word remaining unchanged.
 * 	The words in the input sentence are separated by a single blank space and terminated by 
 * 	a full stop.
 *		Example: Input: It is a warm day.
 *		Output: tI si a marw yad
 *	Some of the data members and member functions are given below:
 *		Class name 						:	Exchange
 *		Data members/instance variables	:
 *			sent 						: 	stores the sentence
 *			rev 						: 	to store the new sentence
 *			size 						: 	stores the length of the sentence
 *		Member functions				:
 *			Exchange()					: 	default constructor
 *			void readsentence()			: 	to accept the sentence
 *			void exfirstlast()			: 	extract each word and interchange the first and 
 *											the last alphabet of the word and form a new 
 *											sentence ‘rev’ using the changed words
 *			void display()				: 	display the original sentence along with the 
 *											new changed sentence.
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.*;
public class Exchange{
	String sent,rev; int size;
	Exchange(){ 
		sent=null; rev="";
	}
	void readsentence(){ 
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter a sentence ");
		sent=sc.nextLine();
		size=sent.length();
	}
	void exfirstlast(){
		int p=0; char ch; String b;
		for(int i=0;i<size;i++){ 
			ch=sent.charAt(i);
			if(ch ==' '||ch =='.'){ 
				b=sent.substring(p,i);
				if(b.length() != 1){ 
					rev += b.charAt(b.length()-1);
					rev = rev + b.substring(1,b.length()-1);
					rev += b.charAt(0);
				}
				else
					rev = rev + b;
				rev = rev + " ";
				p=i+1;
			}
		}
	}
	void display(){ 
		System.out.print("\n Input: " + sent);
		System.out.print("\n Output: " + rev );
	}
	public static void main(){ 
		Exchange obj = new Exchange();
		obj.readsentence();
		obj.exfirstlast();
		obj.display();
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------