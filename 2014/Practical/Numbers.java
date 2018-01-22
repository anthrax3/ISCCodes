/*						-----------------------------------------
 * 						|	Filename	: Numbers.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2014					|
 * 						|	Question 	: 1	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	A composite Magic number is a positive integer which is composite as well as a magic number.
 *	A composite number is a number which has more than two factors. 
 *		For example: 10 Factors are: 1,2,5,10
 *	A Magic number is a number in which the eventual sum of the digit d is equal to 1. 
 *		For example: 28 = 2+8=10= 1+0=1
 *	Accept two positive integers m and n, where m is less than n as user input. 
 *	Display the number of composite magic integers that are in the range between m and n 
 *	(both inclusive) and output them along with frequency.
 *	
 *	For Example -
 *		Input	: 	m=10 n=100
 *		Output	: 	The composite magic numbers are 10,28,46,55,64,82,91,100
 *					Frequency of composite magic numbers: 8
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Numbers{
	int m,n,c=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  	public void takeNumbers() throws Exception{
   		System.out.println("Enter the value of 'm';");
   		m=Integer.parseInt(br.readLine());
	    System.out.println("Enter the value of 'n';");
   		n=Integer.parseInt(br.readLine());
   		if(m > n){
   			System.out.println("Invalid Input."); return;
   		}
   		System.out.println("The composite magic numbers are ");
   		for(;m < =n;m++){
   			if(nonPrime(m) && magic(m)){
   				System.out.print(m+ " "); c++;
   			}
   		}
  		System.out.println("\nFrequency of composite magic numbers:"+c);
  	}
  	private boolean nonPrime (int x){
   		int i;
   		for(i=2;i < x; i++)
    		if(x%i==0) break;
    	if(i==x) return false;
    	else return true;
    }
    private boolean magic( int x){
    	int s=0;
     	while(true){
      		while(x > 0){
       			s=s+x%10; x=x/10;
       		}
       		if(s < 10 ) break;
       		x=s; s=0;
       }
       if(s==1)
       		return true;
       else
       		return false;
    }
  	public static void main(String args[])throws Exception{
       Numbers ob=new Numbers();
       ob.takeNumbers();
    }
}
// ------------------------------------{END OF THE CODE}-----------------------------------------