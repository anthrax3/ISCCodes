/* Filename	: Account.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2016
 * Question : 10
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *  A super class Bank has been defined to store the details of a customer. Define a sub-class
 *	Account that enables transactions for the customer with the bank. The details of both the
 *	classes are given below:
 *		Class name 							: 	Bank
 *		Data members/instance variables		:
 *				name						:	stores the name of the customer
 *				accno						:	stores the account number
 *            	p							:	store the principal amount in decimals
 *		Methods/Member functions			:
 *				Bank(...)					: 	parameterized constructor to assign values to 
 * 												the instant variables
 *				void display( )				: 	displays the details of customers
 * 
 *		Class name 							: 	Account
 *		Data members/instance variables		:
 *				amt							:	stores the transaction amount in decimals
 *		Methods/Member functions			:
 *				Account(...) 				: 	parameterized constructor to assign values to the
 *												instant variables of both the classes
 *				void deposit( )				:	accepts the amount & updates the principal
 * 												as p=p+amt
 * 			 	void withdraw( ) 			:	accepts the amount and updates the principal
 * 			 									as p=p-amt If the withdrawal amount is more
 * 			 									than the principal amount, then display the
 * 			 									message “INSUFFICIENT BALANCE”. If the principal
 *												amount after withdrawal is less than 500, then a
 *												penalty is imposed by using the formula
 *												p=p-(500-p)/10
 *				void display( ) 			: 	displays the details of the customer   
 *-----------------------------------------------------------------------------------------------
 */
import java.util.Scanner;
public class Account extends Bank{ 
	static Scanner sc=new Scanner(System.in);
	double amt;
	Account(String n, String a, double pp){ 
		super(n,a,pp);
		amt=0.0;
	}
	void deposit( ){ 
		System.out.print("\n Enter amount");
		amt=sc.nextDouble();
		p=p+amt;
	}
	void withdraw(){ 
		System.out.print("\n Enter amount");
		amt=sc.nextDouble();
		if(amt>p)
			System.out.println("INSUFFICIENT BALANCE");
		else{ 
			p=p-amt;
			if(p<500)
				p=p-(500-p)/10;
			}
		}
	void display(){ 
		super.display();
	}
}
