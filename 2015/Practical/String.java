/* Filename	: Sentence.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2015
 * Question : 3
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	Write a program to accept a sentence which may be terminated by either ‘.’ Or ‘?’ only.
 *	The words are to be separated by a single blank space. Print an error message if the 
 *	input does not terminate with ‘.’ Or ‘?’. You can assume that no word in the sentence
 *	exceeds 15 characters, so that you get a proper formatted output.
 *	Perform the following tasks:
 *		1. Convert the first letter of each word to uppercase.
 *      2. Find the number of vowels and consonants in each word and diplay them 
 *         with proper headings along with the words.
 *-----------------------------------------------------------------------------------------------
 */ 
import java.io.*;
class Sentence{
	public static void main(String arg[])throws IOException{
    	int i, j, vowels, cons, p, l;
    	String str,word, tmp;
    	char ch, ch1;
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter a paragraph : ");
    	str=br.readLine();
    	l = str.length();
    	ch = str.charAt(l-1);
    	System.out.println("\nOUTPUT:");
     	if(ch != '.' && ch != '?')
        	System.out.println("INVALID INPUT");
    	else{
        	p = vowels = cons = 0;
	        tmp = str+" ";
    	    str = "";
	        for(i=0;i < tmp.length();i++){
    	        ch  = tmp.charAt(i);
    	        if(ch == ' '){
    	            word = tmp.substring(p,i);
    	            ch1 = word.charAt(0);
    	            word = Character.toUpperCase(ch1)+word.substring(1);
    	            str+= word+" ";
    	            p = i + 1;
            	}
        	}
        	System.out.println("\n"+str);
	        System.out.print("\nWord");
    	    for(j= 15 - 4; j>=1;j--)
    	        System.out.print(" ");
            System.out.println("\tVowels\tConsonants");
	        p=0;
    	    for(i=0;i < l;i++){
    	        ch  = str.charAt(i);
            	if( ch != ' ' && ch != '.' && ch != '?'){
                	if((ch>=65 && ch <= 90) || (ch>=97 && ch<=122)){
                    //count vowels
                    	if("aeiouAEIOU".indexOf(ch) != -1)
                        	vowels++;
                    	else
                        	cons++;
                	}
            	}
            	else{
                	word = str.substring(p,i);
                	System.out.print(word);
                	for(j= 15 - word.length(); j>=1;j--)
                	    System.out.print(" ");
                	System.out.println("\t   "+vowels+"\t   "+cons);
                	p = i + 1;
                	vowels = cons = 0;
            	}//else
        	}//loop i
    	}//else
	}//end of main
}//end of class
