/*						-----------------------------------------
 * 						|	Filename	: Admission.java		|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2015					|
 * 						|	Question 	: 8 					|
 * 						-----------------------------------------
 * ################################################################################################
 * ======================================[DESCRIPTION]=============================================
 * ################################################################################################
 *	A class Admission contains the admission numbers of 100 students. Some of the data
 *	members / member functions are given below:
 *		Class name								: 	Admission
 *		Data member/instance variable			:
 *			Adno[ ]								: 	integer array to store admission numbers
 *		Member functions/methods				:	
 *			Admission( ) 						: 	constructor to initialize the array elements
 * 			void fillArray( ) 					: 	to accept the elements of the array in ascending
 *													order
 *			int binSearch(int l, int u, int v) 	: 	to search for a particular admission number (v)
 *													using binary search and recursive technique
 *													and returns 1 if found otherwise returns -1
 *	Specify the class Admission giving details of the constructor, void fillArray( ) and
 *	int binSearch(int, int, int) . Define the main( ) function to create an object and call the
 *	functions accordingly to enable the task.
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------

import java.util.*;
public class Admission{ 
	static Scanner x=new Scanner(System.in);
	int Adno[]=new int[100];
	Admission(){ }
	void fillArray(){
		System.out.println("Enter 100 elements in ascending order ");
		for(int i=0;i<100;i++)
			Adno[i]=x.nextInt();
	}
	int binSearch(int l,int u,int v){ 
		int m=(l+u)/2;
		if(Adno[m]==v)
			return 1;
		else if(l>u)
			return -1;
		else if(Adno[m]>v)
			return binSearch(l,m-1,v);
		else
			return binSearch(m+1,u,v);
	}
	static void main(){ 
		Admission obj=new Admission();
		obj.fillArray();
		System.out.println("Enter value to be searched");
		int v=x.nextInt();
		int p=obj.binSearch(0,obj.Adno.length-1,v);
		if(p==-1)
			System.out.println("No. not found");
		else
			System.out.println("No. is present " );
	}
}

// ------------------------------------{END OF THE CODE}-----------------------------------------