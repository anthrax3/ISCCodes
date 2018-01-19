/* Filename	: Sentence.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2009
 * Question : 3
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Read a single sentence which terminates with a full stop(.). The words are to be separated
 *	with a single blank space and are in lower case. Arrange the words contained in the 
 *	sentence according to the length of the words in ascending order. If two words are of 
 *	the same length then the word occurring first in the input sentence should come first. 
 *	For both, input and output the sentence must begin in upper case.
 *
 *	For Example -
 *
 *	   	INPUT     	: The lines are printed in reverse order.
 * 	   	OUTPUT     	: In the are lines order printed reverse.
 *
 * 		INPUT    	: Print the sentence in ascending order.
 * 		OUTPUT    	: In the print order sentence ascending.
 *-----------------------------------------------------------------------------------------------
 */
import java.io.*;
public class Sentence{
    public static void main()throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the string : ");
    	String str=br.readLine();
    	int l=str.length();
    	String a[]=new String[l];
     	int p=0,x=0,i,j;
     	String t;
     	for(i=0;i< l;i++){
     		char ch=str.charAt(i);
     		if(ch==' '||ch=='.'){
		    	a[x]=str.substring(p,i);
     			System.out.print(a[x]+" ");
     			x++;
     			p=i+1;
     		}
     	}
		System.out.println();
      	for(i=0;i< x;i++){
     		for(j=0;j< x-i-1;j++){
 				if(a[j].length() > a[j+1].length()){
     				t=a[j];
     				a[j]=a[j+1];
     				a[j+1]=t;
    			}
     		}
     	}
     	String s=a[0];
     	char ch=s.charAt(0);
     	System.out.print(Character.toUpperCase(ch));
     	System.out.print(s.substring(1));
     	for(i=1;i< x;i++){
     		System.out.print(" "+a[i]);
     	}
     	System.out.print(".");
	}
}   
