/* Filename	: TheString.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2015
 * Question : 10
 */
/*
 * ################################################################################################
 * ======================================[DESCRIPTION]=============================================
 * ################################################################################################
 *	A class TheString accepts a string of a maximum of 100 characters with only one blank
 *  space between the words.
 *	Some of the members of the class are as follows:	
 *		Class name						: 	TheString
 *		Data member/instance variable	:
 *				str						: 	to store a string
 *				len						:	integer to store the length of the string
 *				wordcount				:	integer to store the number of words
 *				cons					:	integer to store the number of consonants
 *		Member functions/methods:
 *				TheString( )			:	default constructor to initialize the data members
 *				TheString( String ds)	: 	parameterized constructor to assign str=ds
 *				void countFreq()		: 	to count the number of words and the number of
 *											consonants and store them in wordcount and 
 *											cons respectively
 *				void Display( )			: 	to display the original string, along with the
 *											number of words and the number of consonants
 *	Specify the class TheString giving the details of the constructors, void countFreq() and
 *	void Display( ). Define the main( ) function to create an object and call the functions
 *	accordingly to enable the task.
 *-------------------------------------------------------------------------------------------------
 */ 
public class TheString{
	String str;
	int len,wordcount,cons;
	TheString(){}
	TheString(String ds){ 
		str=ds; 
		len=str.length();
	}
	void countFreq(){ 
		char c;
		str=str.toLowerCase ();
		for(int i=0;i<len;i++){ 
			c=str.charAt(i);
			if(c==32)
				wordcount++;
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
				cons++;
		}
		cons = cons – wordcount;
		++wordcount;
	}
	void Display(){ 
		System.out.println(" Number of words=" + wordcount );
		System.out.println(" Number of consonants=" + cons);
	}
	static void main(){ 
		TheString x=new TheString("India is my country");
		x.countFreq();
		x.Display();
	}
}
