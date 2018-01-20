 
/* Filename	: Rearrange.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2010
 * Question : 9
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Input a word in uppercase and check for the position of the first occurring vowel 
 *	and perform the following operation.
 *		1. Words that begin with a vowel are concatenated with “Y” . 
 * 			For example, EUROPE becomes EUROPEY.
 *		2. Words that contain a vowel in between should have the first part from the position of 
 *		   the vowel till end, followed by the part of the string from beginning till position of 
 *		   the vowel and is concatenated by “C”. 
 *		   	For example PROJECT becomes OJECTPRC.
 *		3. Words which do not contain a vowel are concatenated with “N”. 
 *			For example, SKY becomes SKYN.
 *	Design a class Rearrange using the description given below:
 *		Class name						:	Rearrange
 *		Data members/instance variables	:
 *			Txt							:	to store a word
 *			Cxt							:	to store the rearranged word
 *			len							:	to store the length of the word
 *		Member functions				:
 *			Rearrange()					:	constructor to initialize the instance variables
 *			void readword()				:	to accept the word input in UPPERCASE
 *			void convert()				:	converts the word into its changed form and stores 
 *			it in string Txt
 *			void display()				:	displays the original and the changed word
 *-----------------------------------------------------------------------------------------------
 */
 import java.io.*;
class Rearrange{
	String Txt, Cxt;
 	int len;
 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Rearrange(){
 		Txt="";
 		Cxt="";
 		len=0;
 	}  
 	public void readWord()throws IOException{
     	System.out.println("Enter the word:");
     	Txt=br.readLine().toUpperCase();
 	}
 	public void convert(){
 		int i,x=0;
 		len=Txt.length()-1;
 		for(i=0;i<=len;i++){
  			switch(Txt.charAt(i)){
  				case 'A':
  				case 'E':
  				case 'I':
  				case 'O':
  				case 'U':
  				x++;
  				break;
  			}
   			if (x>0)
   				break;
   		}
 		if (x==0)// no vowel in the word
  			Cxt=Txt+"N";
 		else if(i==0)// vowel at the start
    		Cxt=Txt+"Y";
  		else{
  			Cxt=Txt.substring(i);
  			Cxt=Cxt+Txt.substring(0,i)+"C";
  		}
 	}
	void display(){
  		System.out.println("Original word="+Txt + "\nRearranged word="+Cxt);
 	}
	public static void main(String args[]) throws Exception{
 		Rearrange one=new Rearrange();
 		one.readWord();
 		one.convert();
 		one.display();
	}
}
