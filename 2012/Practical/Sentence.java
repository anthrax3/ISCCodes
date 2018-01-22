/*						-----------------------------------------
 * 						|	Filename	: Sentence.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2012					|
 * 						|	Question 	: 2	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Write a program to accept a sentence as input. The words in the string are to be separated 
 * 	by a blank. Each word must be in upper case. The sentence is terminated by either '.','!' 
 * 	or '?'. Perform the following tasks:
 *		1. Obtain the length of the sentence (measured in words)
 *    	2. Arrange the sentence in alphabetical order of the words
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class String{
	public static void main (String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j,l,p,x,now;
		String str,word,temp;
		char ch;
		System.out.println("Enter a sentence ");
    	str = br.readLine();
    	l = str.length();
    	now = 0; 
    	for(i=0;i< l;i++){
        	ch = str.charAt(i);
        	if(ch == ' ' || ch == '?' || ch == '.'|| ch == '!')
            	now++;
    	}
    	String words[] = new String[now];
    	x=0; 
    	p=0; 
    	for(i=0;i< l;i++){
        	ch = str.charAt(i);
        	if(ch == ' ' || ch == '?' || ch == '.' || ch == '!'){
            	word = str.substring(p,i);
            	words[x++] = word;
            	p = i+1;
        	}
    	}
    	for(i=1; i< x; i++){
        	for(j=0; j< x-i; j++){
            	if(words[j].compareTo(words[j+1]) > 0){
                	temp = words[j];
                	words[j] = words[j+1];
                	words[j+1] = temp;
            	}
        	}
    	}
    	System.out.println("Length: "+now);
    	System.out.println("Rearranged sentence: ");
    	for(i=0; i< x; i++){
        	System.out.print(words[i]+" ");
    	}
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------