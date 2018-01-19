/* Filename	: Sentence.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2016
 * Question : 3
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * Write a program to accept a sentence which may be terminated by either '.', '?' or '!' only.
 * The words may be separated by more than one blank space and are in UPPER CASE.
 * Perform the following tasks:
 *  1. Find the number of words beginning and ending with a vowel.
 *  2. Place the words which begin and end with a vowel at the beginning, 
 *     followed by the remaining words as they occur in the sentence.
 * For Example -
 *  	INPUT	: ANAMIKA AND SUSAN ARE NEVER GOING TO QUARREL ANYMORE.
 *		OUTPUT	: NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = 3
 *			 	  ANAMIKA ARE ANYMORE AND SUSAN NEVER GOING TO QUARREL
 *-----------------------------------------------------------------------------------------------
 */
import java.io.*;
class Sentence
{
    public static void main(String arg[])throws IOException
    {
        int l,i,n, p, nowwv;
        boolean flag = true;
        char ch, fc, lc, lastChar;
        String str, prefix = "", suffix = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence : ");
        str = br.readLine();
        l = str.length();
        lastChar = str.charAt(l-1);
        if(lastChar != '.' && lastChar != '?' && lastChar != '!')
            System.out.println("INVALID INPUT");
        else{
            p = 0;
            nowwv = 0;
            for(i = 0; i < l; i++){
                ch = str.charAt(i);
                if(ch == ' ' || ch == '?' || ch == '!' || ch == '.'){
                    if(isVowel(str.charAt(p)) && isVowel(str.charAt(i-1))){
                        prefix += str.substring(p,i) + " ";
                        nowwv++;
                    }
                    else{
                        suffix += str.substring(p,i) + " ";
                    }
                    p = i + 1;
                }
            }
            System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + nowwv);
            System.out.println(prefix + suffix);
        }
    }
    private static boolean isVowel(char ch){
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        else
            return false;
    }
}
