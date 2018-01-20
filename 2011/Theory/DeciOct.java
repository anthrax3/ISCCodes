/* Filename	: DeciOct.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2011
 * Question : 9
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *  A class DeciOct has been defined to convert decimal number into its equivalent octal number. 
 *	Some of the members of the class are given below:
 *	Class name							: 	DeciOct
 *	Data Members/instance variables		:
 *		n								: 	stores the decimal number
 *		oct								: 	stores the equivalent octal number
 *	Member functions					:
 *		DeciOct()						: 	constructor to initialize the data members to 0
 *		void getnum(int nn)				: 	assigns nn to n
 *		void deci_oct()					:  	calculates the octal equivalent of n and stores 
 *											it in oct using the recursive technique
 *		void show						: 	displays the decimal number n	calls the function 
 *											deci_oct() and displays its octal equivalent
 *-----------------------------------------------------------------------------------------------
 */
import java.io.*;
class DeciOct{
	int n,oct;
  	DeciOct(){
 		n=0;
 		oct=0;
 	}
 	void getnum(int nn){
  		n=nn;
 	}
 	public void deci_oct(){
  		if(n==0)
  			return;
  		oct=oct*10+n%8;
  		n=n/8;
  		deci_oct();
  	}
 	public void show(){
  		System.out.println("Decimal value="+n);
 		deci_oct();
 		n=oct;
 		oct=0;
 		while(n>0){
  			oct=oct*10+n%10;
  			n=n/10;
  		}// reversing the number
 		System.out.println("Octal equivalent = "+oct);
 	}
	public static void main(String args[]) throws Exception{
		int a;
 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DeciOct one=new DeciOct();
	 	System.out.println("Enter the number:");
 		a=Integer.parseInt(br.readLine());
 		one.getnum(a);
 		one.show();
	}
}
