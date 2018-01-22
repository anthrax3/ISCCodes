/*						-----------------------------------------
 * 						|	Filename	: Sentence.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2008					|
 * 						|	Question 	: 2   	 				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	A sentence is terminated by either ".", "!" or "?" followed by a space. Input a piece of text
 * 	consisting of sentences. Assume that there will be a maximum of 10 sentences in a block.
 *	Write a program to:
 *   	1. Obtain the length of the sentence (measured in words) and the frequency of vowels 
 *   	   in each sentence.
 *   	2. Generate the output as shown below using the given data.
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
import java.util.*;
class Sentence{
 	String str1,str2,str3[];
 	int number,i;
 	StringTokenizer stk;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	public void takeSentence()throws Exception{
  		System.out.println("Enter the sentence:");
  		str1=br.readLine();
  		stk=new StringTokenizer(str1,"?.,");
  		number=stk.countTokens();
 		str3=new String[number];
 		i=0;
 		while(stk.hasMoreTokens()){
 			str3[i++]=stk.nextToken();
 		}
 		System.out.println("\nSentence No   No. of vowels   No. of words\n");
 		for(i=0;i< number;i++){
  			str1=str3[i];
  			System.out.print((i+1)+"      ");
  			System.out.print(vowel(str1)+ "      ");
  			System.out.println(word(str1)+ "      ");
  		}
  	}
	private int vowel(String s){
 		int i,v=0,len;
 		len=s.length();
 		s=s.toUpperCase();
 		for(i=0;i< len;i++){
  			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
  				v++;
  		}
  		return v;
  	}
	private int word(String s){
 		int i,v=1,len;
 		len=s.length();
 		s=s.toUpperCase();
 		for(i=0;i< len;i++){
  			if(s.charAt(i)==' ')
  				v++;
  		}
  		return v;
  	}
  	public static void main(String args[])throws Exception{
   		Sentence object=new Sentence();
   		object.takeSentence();
    }
}
// ------------------------------------{END OF THE CODE}-----------------------------------------