/*						-----------------------------------------
 * 						|	Filename	: Change.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2010					|
 * 						|	Question 	: 10    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Design a class Change to perform string related operations. 
 * 	The details of the class are given below:
 *		Class name						:	Change
 *		Data members/instance variables	:
 *			str							:	stores the word
 *			newstr						:	stores the changed word
 *			len							:	stores the length of the word
 *		Member functions				:
 *			Change()					:	default constructor
 *			void inputword()			:	to accept a word
 *			char caseconvert(char ch)	:	converts the case of the character and returns it
 *			void recchange(int)			:	extracts characters using recursive technique and 
 *											changes its case using caseconvert() and 
 *											forms a new word
 *			void display()				:	displays both the words
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Change{
	String str, newstr; int len;
 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Change(){
 		str="";
 		newstr="";
 		len=0;
 	}  
 	public void inputword()throws IOException{
     	System.out.println("Enter the word:");
     	str=br.readLine();
     	len=str.length();
 	}
 	public char caseconvert(char ch){
 		if (Character.isUpperCase(ch))
 			ch=Character.toLowerCase(ch);
 		else
 			ch=Character.toUpperCase(ch);
 		return ch;
 	}
 	void recchange(int x){
   		if(x==len)
   			return;
   		newstr=newstr+caseconvert(str.charAt(x));
   		recchange(++x);
 	}
 	void display(){
  		System.out.println("Original word="+str + "\nRearranged word="+newstr);
 	}
	public static void main(String args[]) throws Exception{
 		Change one=new Change();
 		one.inputword();
 		one.recchange(0);
 		one.display();
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------