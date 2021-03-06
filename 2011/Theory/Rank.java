/*						-----------------------------------------
 * 						|	Filename	: Rank.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2011					|
 * 						|	Question 	: 11	   				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *  A super class Record has been defined to store the names and ranks of 50 students. 
 *	Define a sub class Rank to find the highest rank along with the name. 
 *	The details of both classes are given below:
 *		
 *		Class name						:	Record
 *		Data Members/instance variables	:
 *			name[]						:	to store the names of students
 *			rnk[]						:	to store the ranks of students
 *		Member functions				:
 *			Record()					:	constructor to initialize data members
 *			void readvalues()			:	to store names and ranks
 *			void display()				:	displays the names and the corresponding ranks
 *		
 *		Class name						:	Rank
 *		Data Members/instance variables	:
 *			index						:	integer to store the index of the topmost rank
 *		Member functions				:
 *			Rank()						:	constructor to invoke the base class constructor and 
 *											to initialize index to 0.
 *			void highest()				:	finds the index location of the topmost rank and 
 *											stores it in index without sorting the array
 *			void display()				:   displays the name and ranks along with the name
 *											having the topmost rank.
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Rank extends Record{
	int index;
	Rank(){
 		super();
		index=0;
	}
	void highest(){
 		for(int i=1;i<=49;i++){
 			if(rnk[i]>rnk[index])
				index=i;
		}
	}
	void display(){
 		System.out.println("Name of highest rank student:" + name[index] + " Rank="+rnk[index]);
 		super.display();
	}
	public static void main(String args[]) throws Exception{
  		Rank one=new Rank();
		one.readvalues();
		one.highest();
		one.display();
 	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------