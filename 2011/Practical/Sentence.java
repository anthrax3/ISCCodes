/*						-----------------------------------------
 * 						|	Filename	: Sentence.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2011					|
 * 						|	Question 	: 2	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Encryption is a technique of coding messages to maintain their secrecy. A String array of 
 *	size 'n' where 'n' is greater than 1 and less than 10, stores single sentences 
 *	(each sentence ends with a full stop) in each row of the array.
 *	Write a program to accept the size of the array.
 *	Display an appropriate message if the size is not satisfying the given condition.
 *	Define a string array of the inputted size and fill it with sentences row-wise. 
 *	Change the sentence of the odd rows with an encryption of two characters ahead of the 
 *	original character.(Caesar Cipher)
 *	Also change the sentence of the even rows by storing the sentence in reverse order. 
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Sentence{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of sentences : ");
		int nos=Integer.parseInt(br.readLine());
		if(nos<1 || nos>=10)
			System.out.println("\nInvalid Entry");
		else{
     		int i,j,p,l;
    		String s[]=new String[nos];
		    System.out.print("\nEnter "+nos+" sentences : ");
		    for(i=0;i< nos;i++)
    			s[i]=(br.readLine()).toUpperCase();
    		for(i=0;i< nos;i++){
        		String t;
        		s[i]=" "+s[i];
       			l=s[i].length();
        		if(i%2==0){
        			t="";
        			for(j=0;j< l;j++){
            			int ch=s[i].charAt(j);
            			if(ch!=32 && ch!='.'){
                			ch=ch+2;
                			if(ch>90)
                				ch=ch-26;
              			}
              			t=t+(char)ch;
        			}
        			s[i]=t.trim();
    			}
    			else{
        			t="";
        			p=l-1;
        			for(j=l-1;j>=0;j--){ 
        				char ch=s[i].charAt(j);
        				if(ch==' '){
        					t=t+s[i].substring(j+1,p)+" "; 
        					p=j;
        				}
    				}
    				t=t+"."; 
    				s[i]=t;
    			}
    		}
    		System.out.println("\nOUTPUT:");
    		for(i=0;i< nos;i++)
    			System.out.print(s[i]);
  		}
	}
} 
// ------------------------------------{END OF THE CODE}-----------------------------------------