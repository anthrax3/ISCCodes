/* Filename	: Combine.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2012
 * Question : 8
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	A class Combine contains an array of integers which combines two arrays into a  single array 
 *	including the duplicate elements, if any, and sorts the combined array. Some of the members 
 *	of the class are given below: 
 *		Class name							:	Combine  
 *		Data members/instance variables		: 
 *			com[] 							:	integer array 
 *			size 							:	size of the array 
 *		Member functions/methods			: 	
 *			Combine (int nn) 				:	parameterized constructor to assign size=nn 
 *			void inputarray() 				:	to accept the array elements 
 *			void sort() 					:	sorts the elements of combined array in ascending
 *												order using the selection sort technique 
 *			void mix(Combine A, Combine B) 	:	combines the parameterized object arrays and 
 *												stores the result in the current object array 
 *												along with duplicate elements, if any 
 *			void display() 					:	displays the array elements 
 *-----------------------------------------------------------------------------------------------
 */ 
import java.io.*;
class Combine{
	int com[], size;
 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Combine(int nn){
 		size=nn;
 		com=new int[size];
	}
	void inputarray()throws Exception{
 		int i;
 		for(i=0;i< size;i++){
  			System.out.print("\nEnter Value:");
  			com[i]=Integer.parseInt(br.readLine());
  		}
	}
	void sort(){
		int i,j,t;
		for(i=0;i< size-1;i++){
 			for(j=i+1;j< size;j++){
  				if(com[i] >com[j]){
   					t=com[i];
   					com[i]=com[j];
   					com[j]=t;
  				}
 			}
 		}
	}         
	void mix(Combine A, Combine B){
		int i,x=0;
		for(i=0;i< A.size;i++)
			com[x++]=A.com[i];
		for(i=0;i< B.size;i++)
			com[x++]=B.com[i];
	}
	void display(){
 		for(int i=0;i< size;i++)
 			System.out.print(" "+com[i]);
	}
	public static void main(String args[]) throws Exception{
  		Combine A,B,C;
  		int s;
  		A=new Combine(5);
  		B=new Combine(6);
  		C=new Combine(11);
  		System.out.print("\nValues for 1st array:");
  		A.inputarray();
  		System.out.print("\nValues for 2nd array:");
  		B.inputarray();
  		A.sort();
  		B.sort();
  		C.mix(A,B);
  		C.sort();
  		System.out.print("\nValues of 1st array:");
  		A.display();
  		System.out.print("Values of 2nd array:");
  		B.display();
  		System.out.print("Values of 3rd array:");
  		C.display();
 	}
}
