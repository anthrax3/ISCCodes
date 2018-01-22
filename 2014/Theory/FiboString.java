/*						-----------------------------------------
 * 						|	Filename	: FiboString.java		|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2014					|
 * 						|	Question 	: 10	   				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Design a class FiboString to generate fibonacci strings. Some of the members of the class
 *	are given below:
 *		Class name						: 	FiboString
 *		Data members/instance variables	:
 *			x 							: 	to store the first string
 *			y 							: 	to store the second string
 *			z 							: 	to store the concatenation of the
 *											previous two strings
 *			n 							: 	to store the number of terms
 *		Member functions/methods		:
 *			FiboString( ) 				: 	constructor to assign x=“a”, y=“b” and z=“ba”
 *			void accept( ) 				: 	to accept the number of terms ‘n’
 *			void generate( ) 			: 	to generate and print the fibonacci strings. The
 *											sum of (‘+’ ie concatenation) first two strings is
 *											the third string. Eg. “a” is first string, “b” is
 *											second string then the third will be “ba”, and
 *											fourth will be “bab” and so on.
 *	Specify the class FiboString, giving details of the constructor( ), void accept( ) and
 *	void generate( ). Define the main( ) function to create an object and call the functions
 *	accordingly to enable the task.
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.*;
class FiboString{ 
	String x,y,z;
	int n;
	FiboString(){
		x="a";
		y="b";
		z="ba";
	}
	void accept (){
		Scanner Sc = new Scanner (System.in);
		System.out.println ("Enter number of terms") ;
		n = Sc.nextInt( );
	}
	void generate(){ 
		System.out.print(x+","+y);
		for(int i=0;i<=n-2;i++){ 
			System.out.print(","+z);
			x=y;
			y=z;
			z=y+x;
		}
	}
	static void main(){ 
		FiboString obj=new FiboString( );
		obj.accept( );
		obj.generate();
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------