/*						-----------------------------------------
 * 						|	Filename	: Repeat.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2010					|
 * 						|	Question 	: 12    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Define a class Repeat which allows the user to add elements from one end (rear) and remove 
 *	elements from one end (rear) and remove elements from the other end (front) only.
 *	The following details of the class Repeat are given below:
 *		Class name						:	Repeat
 *		Data members/instance variables	:
 *			st[]						:	an array to hold a maximum of 100 integerelements
 *			cap							:	stores the capacity of the array
 *			f							:	to point to the index of the front
 *			r							:	to point to the index of the rear
 *		Member functions				:
 *			Repeat(int m)				:	constructor to initialize the data members
 *											cap=m, f=0, r=0 and to create the integer array
 *			void pushvalue(int v)		:	to add integers from the rear index if possible
 *											else display the message “overflow”
 *			int popvalue()				:	to remove and return element from the front, if	
 *											array is empty then return -9999
 *			void disp()					:	displays the elements present in the list
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Repeat{
 	int st[],f,r,cap;
 	Repeat(int m){
 		cap=m; st=new int[cap]; r=0;f=0;
 	}  
 	public void pushvalue(int v){
     	if(r==cap)
     		System.out.println("Overflow.");
     	else
     		st[r++]=v;
 	}
 	public int popvalue(){
 		if (f!=0 && f==r)
 			return -9999;
 		else
 			return st[f++];
 	}
 	void display(){
  		System.out.print("\nThe list is=");
  		for(int i=f;i<=r-1;i++)
  			System.out.print(" "+st[i]);
 	}
	public static void main(String args[]) throws Exception{
 		Repeat one=new Repeat(100); int v=0; int i=1;
 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 		while(i!=0){
  			System.out.print("\nPress '1' for push, '2' for pop and '0' for quit:");
			i=Integer.parseInt(br.readLine());
 			if (i==1){
   				System.out.print("\nValue: ");
   				v=Integer.parseInt(br.readLine());
   				one.pushvalue(v);
   				one.display();
   			}
   			else if(i==2){
   				i=one.popvalue();
    			System.out.print("\nPoped element: "+v);
    			one.display();
    		}
    	}
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------