/*						-----------------------------------------
 * 						|	Filename	: Amount.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2010					|
 * 						|	Question 	: 1   	 				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A bank intends to design a program to display the denomination of an input amount, 
 * 	upto 5 digits. The available denomination with the bank are of rupees 
 * 	1000,500,100,50,20,10,5,2 and 1.
 *	Design a program to accept the amount from the user and display the break-up in 
 *	descending order of denominations. 
 *	(i,e preference should be given to the highest denomination available) 
 *	along with the total number of notes. [Note: only the denomination used should be displayed]. 
 *	Also print the amount in words according to the digits.
 *		For Example
 *				INPUT: 14836
 *				OUTPUT: ONE FOUR EIGHT THREE SIX
 *				DENOMINATION:
 *				1000 X 14 =14000
 *				500  X 1  =500
 *				100  X 3  =300
 *				50   X 1  =50
 *				5    X 1  =5
 *				1    X 1  =1
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.*;
class Numbers{
	public static void main(String args[])throws InputMismatchException{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a five-digit amount : ");
		int amt=scan.nextInt();
		if(amt>99999)
			System.out.println("INVALID AMOUNT.");
		else{
			int a[]={1000,500,100,50,20,10,5,2,1};int i,p,r,b,t;
    		p=amt;
 			for(i=0;i< a.length;i++){
   				t=amt/a[i];
				if(t!=0){
					System.out.println(a[i]+"X"+t+"="+(t*a[i]));
					amt=amt%a[i];
				}
			}
   			String ones[]={"one","two","three","four","five", "six","seven","eight","nine"};
    		r=0;
 			while(p>0){
 				r=r*10+p%10;
  				p/=10;
  			}
			while(r>0){
 				b=r%10;
				System.out.print(ones[b-1].toUpperCase()+" ");
				r/=10;
			}
 		}
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------