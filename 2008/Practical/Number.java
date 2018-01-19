/* Filename	: Numbers.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2008
 * Question : 1
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A smith number is a composite number, the sum of whose digits is the sum of the digits of
 * 	its prime factors obtained as a result of prime factorization (excluding 1).
 *	The first few such numbers are 4, 22, 27, 58, 85, 94, 121.....
 *-----------------------------------------------------------------------------------------------
 */
import java.util.*;
class Number{
	public static void main(String args[])throws InputMismatchException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int p,q,i,sod=0,sopf=0,t
		p=q=n;
		while(p>0){
			sod+=p%10;
			p/=10;
		}
		for(i=2;i<=q;i++){
			if(q%i==0){
				t=i;
				while(t>0){
					sopf+=t%10;
					t/=10;
				}
				q=q/i;
				i--;
			}
		}
		if(sod==sopf)
			System.out.println("Smith number");
		else
			System.out.println("Not Smith number");
	}
}
