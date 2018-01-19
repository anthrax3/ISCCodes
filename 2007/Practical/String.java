/* Filename	: Sentence.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2007
 * Question : 2
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *  The input in this problem will consist of a number of lines of English text consisting of 
 * 	the letters of the English alphabet, the punctuation marks (') apostrophe, (.) full stop, 
 *	(,) comma, (;) semicolon, (:) colon and white space characters (blank, newline). 
 *	Your task is to print the words of the text in reverse order without any punctuation marks 
 *	other than blanks.
 *
 *	For example consider the following input text:
 *		This is a sample piece of text to illustrate this problem.
 *		If you are smart you will solve this right.
 *
 *	The corresponding output would read as:
 *		right this solve will you smart are you If 
 *		problem this illustrate to text of piece sample a is This
 *	
 *	That is, the lines are printed in reverse order.
 *	Note: Individual words are not reversed.
 *-----------------------------------------------------------------------------------------------
 */
import java.io.*;
import java.util.*;
class Sentence{
 	String str;
 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	StringTokenizer stk;
 	String arr[]=new String[60];
 	int index=0;
 	String s1;
 	public void take() throws IOException{
   		System.out.println("Enter the sentence:");
  		str=br.readLine();
  		str=str.substring(0,str.length()-1);
   		stk=new  StringTokenizer(str);
    	while(stk.hasMoreTokens()){
   			s1=stk.nextToken();
   			if((s1.charAt(s1.length()-1) >=65 && s1.charAt(s1.length()-1)<=90)||(s1.charAt(s1.length()-1) >=97 && s1.charAt(s1.length()-1)<=122))
     			arr[index++]=s1;
    		else
     			arr[index++]=s1.substring(0,s1.length()-1);
    	}
    	str=" ";
    	for(int i=index-1;i >=0;i--){
     		str=str+ arr[i]+" ";
    	}
    	str=str.trim();
    	str=str+".";
  	}
  	public void display(){
  		System.out.println("Output="+str);
 	}
 	public static void main(String args[]) throws IOException{
  		ReverseSentence ss=new ReverseSentence();
  		ss.take();
  		ss.display();
 	}
}
