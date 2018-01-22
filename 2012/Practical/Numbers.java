/*						-----------------------------------------
 * 						|	Filename	: Numbers.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2012					|
 * 						|	Question 	: 1	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A prime palindrome integer is a positive integer (without leading zeros) which is prime as 
 * 	well as a palindrome. Given two positive integers m and n, where m < n, write a program to 
 * 	determine how many prime-palindrome integers are there in the range between m and n 
 * 	(both inclusive) and output them.
 *
 *	The input contains two positive integers m and n where m < 3000 and n < 3000. 
 * 	Display the number of prime palindrome integers in the specified range along with values.
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.*;
class Numbers{
	public static void main (String args[])throws InputMismatchException{
		Scanner scan = new Scanner(System.in);
		int m,n,i,j,t,c,r,a,freq;
		System.out.println("Enter two positive integers m and n, where m < 3000 and n < 3000: ");
    	m = scan.nextInt();
    	n = scan.nextInt();
    	if(m < 3000 && n < 3000){
    		freq = 0; 
   			System.out.println("The prime palindrome integers are:");
    		for(i=m;i<=n;i++){
        		t = i;
        		c = 0;
        		for(j =1; j<=t; j++){
            		if(t%j == 0)
                	c++;
        		}
        		if(c == 2){
            		r = 0;
            		while(t>0){
                		a = t%10;
                		r = r*10 + a;
                		t = t/10;
            		}
            		if(r == i){
                		System.out.print(i+" ");
                		freq++;
            		}
        		}
    		}
   			System.out.println("\nFrequency of prime palindrome integers:"+freq); 
		}
		else{
   			System.out.println("OUT OF RANGE"); 
		}
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------