/*						-----------------------------------------
 * 						|	Filename	: ConsChange.java		|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2016					|
 * 						|	Question 	: 9						|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * A class ConsChange has been defined with the following details :
 *		Class name 							: 	ConsChange
 *		Data members/instance variables		:
 * 			word							:	stores the word
 *			len								:	stores the length of the word
 *		Methods/Member functions			:
 *			ConsChange() 			    	: 	default constructor
 *			void readword( ) 				:   accepts the word in the lower case
 *			void shifticons() 				: 	shifts all the consonants of the word at the
 *												beginning followed by the vowels
 *			void changeword()				:   changes the case of all occurring consonants of
 *												the shifted word to uppercase, for e.g. (spnoo
 *												becomes SPNoo)
 *			void show( ) 					: 	displays the original word, shifted word and the
 *												changed word					
 * 	Specify the class ConsChange giving the details of the constructor( ), void readword( ), 
 *  void shiftcons( ), void changeword( ) and void show( ). Define the main( ) function to 
 *  create an object and call the functions accordingly to enable the task.
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.Scanner;
public class ConsChange{ 
	String word; int len;
	static Scanner sc=new Scanner(System.in);
	ConsChange(){
		len=0; word= “”; 
	}
	void readword(){ 
		System.out.println("Enter word in Lower case"); word=sc.next(); len=word.length(); 
	}
	void shiftcons(){ 
		String s=""; char c;
		for(int i=0;i<len;i++){ 
			c=word.charAt(i);
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
				s +=c;
		}
		for(int i=0;i<len;i++){ 
			c=word.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				s +=c; 
		}
		System.out.print("\n Sorted Word="+s); word=s;
	}
	void changeword(){ 
		char c; String s="";
		for(int i=0;i<len;i++){ 
			c=word.charAt(i);
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
				s +=(char)(c-32);
			else
				s +=c;
		}
		System.out.println("\n Changed word= " + s); 
	}
	void show(){ 
		System.out.print("\n Original word= " + word);
		shiftcons();  changeword();
	}
	static void main(){ 
		ConsChange X=new ConsChange(); X.readword(); X.show();
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------