/* Filename	: Emirp.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2013
 * Question : 8
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	An emirp number is a number which is prime backwards and forwards. 
 *	Example: 13 and 31 are both prime numbers. Thus, 13 is an emirp number.
 *	Design a class Emirp to check if a given number is Emirp number or not. Some of the members
 *	of the class are given below:
 *		Class name 						: Emirp
 * 		Data members/instance variables	:
 * 			n 							: 	stores the number
 *			rev 						: 	stores the reverse of the number
 *			f 							: 	stores the divisor
 *		Member functions				:
 *			Emirp(int nn) 				: 	to assign n = nn, rev = 0 and f = 2
 *			int isprime(int x) 			: 	check if the number is prime using the recursive 
 *											technique and return 1 if prime otherwise return 0
 *			void isEmirp() 				: 	reverse the given number and check if both the 
 *											original number and the reverse number are prime,
 *											by invoking the function isprime(int) and display 
 *											the result with an appropriate message
 *	Specify the class Emirp giving details of the constructor(int), int isprime(int) and 
 *	void isEmirp(). Define the main() function to create an object and call the methods 
 *	to check for Emirp number.
 *-----------------------------------------------------------------------------------------------
 */ 
import java.util.Scanner;
public class Emirp{
	int n,rev,f;
	Emirp(int nn){ 
		n=nn;
		rev=0;
		f=2;
	}
	int isprime(int x){
		if(n==x)
			return 1;
		else if(n%x==0 ||n==1)
			return 0;
		else
			return isprime(x+1);
	}
	void isEmirp(){
		int x=n;
		while(x!=0){
			rev=(rev*10) + x%10;
			x=x/10;
		}
		int ans1=isprime(f);
		n=rev;
		f=2;
		int ans2=isprime(f);
		if(ans1==1 && ans2==1)
			System.out.println(n+ " is an Emirp number");
		else
			System.out.println(n+ " is not an Emirp number");
	}
	public static void main(){ 
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter a number " );
		int x=sc.nextInt();
		Emirp obj = new Emirp(x);
		obj.isEmirp();
	}
}
