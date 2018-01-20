/* Filename	: Detail.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2012
 * Question : 12
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A super class Detail has been defined to store the details of a customer. Define a sub class
 	Bill to compute the monthly telephone charge of the customer as per the chart given below:
	 	---------------------------------------------------------------------
		|	 NUMBER OF CALLS 		|				  RATE					|
		|		1-  100				|			Only rental charge			|
		|		101-200				|	60 paisa per call + rental charge	|
		|		201-300				|	80 paisa per call + rental charge	|
		|		Above 300			|	1 rupee per call + rental charge	|
		---------------------------------------------------------------------
	The details of both the classes are given below:
		Class Name						:	Detail
		Data members/instance variables	:
			name						:	to store the name of the customer.
			address						:	to store the address of the customer.
			telno						:	to store the phone number of the customer.
			rent						:	to store the monthly rental charge
		Member functions				:
			Detail(..)					:	parameterized constructor to assign values 
											to data members.
			void show()					:	to display the detail of the customer.
		Class Name						:	Bill
		Data members/instance variables	:
			n							:	to store the number of calls.
			amt							:	to store the amount to be paid by the customer.
		Member functions				:
			Bill(..)					:	parameterized constructor to assign values to 
											data Members of both classes and to initialize 
											amt = 0.0.
			void cal()					:	calculates the monthly telephone charge as per 
											the charge given above.
			void show()					:	to display the detail of the customer and amount 
											to be paid
 *-----------------------------------------------------------------------------------------------
 */ 
import java.io.*;
class Detail{
 	String name;
 	String address;
 	String telno;
 	double rent;
 	Detail(String n, String a, String t, double d){
 		name=n;
 		address=a;
 		telno=t;
 		rent=d;
 	}
 	void show(){
  		System.out.println("\nName="+name);
		System.out.println("\nAddress="+address);
		System.out.println("\nTelephone Number="+telno);
		System.out.println("\nRent="+rent);
  	}
}
class Bill extends Detail{
	int n;
   	double amt;
 	Bill(String n1, String a, String t, double d, int c){
   		super(n1,a,t,d);
   		n=c; amt=0;
   	}
  	void call(){
  		int n1;
		amt=rent;
		n1=n;
		n1=n1-100;
		if(n1>0 && n1<=100){
 			amt=amt+n1*.6;
 			n1=0;
 		}
 		else{
 			amt=amt+100*.6;
 			n1=n1-100;
 		}
		if(n1>0 && n1<=100){
 			amt=amt+n1*.8;
 			n1=0;
 		}
	 	else{
 			amt=amt+100*.8;
 			n1=n1-100;
 		}
		if(n1>0){
 			amt=amt+n1*.1;
 		}
	}
 	void show(){
   		super.show();
  		System.out.println("\nTotal Calls="+n);
  		System.out.println("\nTotal amount to pay="+amt);
  	}
 	public static void main(String args[]) throws Exception{
 		Bill ob;
 		String n,a,t;
 		double rent;
 		int call;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 	System.out.print("\nEnter Customer Name:");
	 	n=br.readLine();
	 	System.out.print("\nEnter Address:");
	 	a=br.readLine();
	 	System.out.print("\nEnter Telephone Number:");
	 	t=br.readLine();
	 	System.out.print("\nEnter Rent:");
	 	rent=Double.parseDouble(br.readLine());
	 	System.out.print("\nEnter Total Calls:");
	 	call=Integer.parseInt(br.readLine());
	 	ob=new Bill(n,a,t,rent,call);
	 	ob.call();
	 	ob.show();
 	}
}
