/* Filename	: Merger.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2015
 * Question : 9
 */
/*
 * ################################################################################################
 * ======================================[DESCRIPTION]=============================================
 * ################################################################################################
 *	A class Merger concatenates two positive integers that are greater than 0 and produces a
 *	new merged integer.
 *	Example: If the first number is 23 and the second is 764, then the concatenated number
 *			 will be 23764.
 *	Some of the members of the class are given below:
 *		Class name						:	Merger
 *		Data members/instance variables	:
 *			n1							: 	long integer to store first number
 *			n2							: 	long integer to store second number
 *			mergNum						: 	long integer to store the merged number
 *		Member functions				:
 *			Merger()					:	constructor to initialize the data members
 *			void readNum( )				:	to accept the values of the data members n1 and n2
 *			voidJoinNum( )				: 	to merge the numbers n1 and n2 and store it in mergNum
 *			void show( )				: 	to display the original numbers and the merged
 *											number with appropriate messages	
 *	Specify the class Merger, giving the details of the constructor, void readNum( ),void
 *	JoinNum( )and void show( ). Define the main( ) function to create an object and call the
 *	functions accordingly to enable the task.
 *-------------------------------------------------------------------------------------------------
 */ 
import java.util.*;
public class Merger{
	long n1,n2,mergNum;
	Merger( ) { }
	void readNum(){ 
		Scanner x=new Scanner(System.in);
		System.out.println("Enter two numbers");
		n1=x.nextLong();
		n2=x.nextLong();
	}
	void JoinNum(){ 
		String s=Long.toString(n1);
		String s1=Long.toString(n2);
		String s2=s+s1;
		mergNum=Long.valueOf(s2);
	}
	void show(){ 
		System.out.println("First Number= " + n1);
		System.out.println("Second Number= " + n2);
		System.out.println("Merged Number= " + mergNum);
	}
	static void main(){ 
		Merger obj=new Merger();
		obj.readNum();
		obj.JoinNum();
		obj.show();
	}
}
