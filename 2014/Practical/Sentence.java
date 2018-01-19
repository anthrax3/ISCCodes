/* Filename	: Sentence.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2014
 * Question : 3
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	Write a program to accept a sentence which may be terminated by either '.', '?', or '!' only.
 *	Any other character may be ignored. The words may be separated by more than one blank space 
 *	and are in UPPER CASE. Perform the following tasks.
 *		1. Accept the sentence and reduce all the extra blank space between two words 
 *		   to a single blank space.
 *    	2. Accept a word from the user which is part of the sentence along with its 
 *    	   position number and delete the word and display the sentence.
 *-----------------------------------------------------------------------------------------------
 */
import java.util.*;
class Sentence{           
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        s = s.toUpperCase();
        int l = s.length();
        char last = s.charAt(l-1); // Extracting the last character
        /* Checking whether the sentence ends with '.' or '?' or not */
        if(last != '.' && last != '?' && last != '!')
            System.out.println("Invalid Input. End a sentence with either '.', '?' or '!' only");
        else{
            StringTokenizer str = new StringTokenizer(s," .?!");
            int c = str.countTokens();
            String w="",ans = "";
            System.out.print("Enter the word to delete : ");
            String del = sc.next();
            System.out.print("Enter the word position is the sentence : ");
            int x = sc.nextInt();
            if(x<1 || x>c) // Checking whether integer inputted is acceptable or not
                System.out.println("Sorry! The word position entered is out of range");
            else{      
                for(int i=1; i<=c; i++){
                    w = str.nextToken();
                    /* Skipping if the word to delete and the position matches */
                    if(w.equals(del)==true && i == x)
                        continue;
                    ans = ans + w + " ";
                }
                System.out.print("Output : "+ans.trim()+last);
            }
        }
    }
}
