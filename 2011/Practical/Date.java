/* Filename	: Date.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2011
 * Question : 3
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Design a program which accepts your date of birth in dd mm yyyy format. 
 * 	Check whether the date entered is valid or not.
 *	If it is valid, display "VALID DATE", also compute and display the day number of the year 
 *	for the date of birth. If it is invalid, display "INVALID DATE" and then 
 *	terminate the program.
 *-----------------------------------------------------------------------------------------------
 */
import java.util.*;
class Date{
	public static void main(String args[])throws InputMismatchException{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your date od birth in dd mm yyyy format : ");
		int d=scan.nextInt();
		int m=scan.nextInt();
		int y=scan.nextInt();
		int dom[]={31,28,31,30,31,30,31,31,30,31,30,31};
		if(y%400==0 || (y%100!=0 && y%4==0))
			dom[1]=29;
		if(d<=dom[m-1]){
			System.out.print("VALID DATE ");
			int i,s=0;
			for(i=0;i< m-1;i++)
				s=s+dom[i];
			s+=d;
			System.out.print(s);
		}
		else{
			System.out.print("INVALID DATE");
		}
	}
} 
