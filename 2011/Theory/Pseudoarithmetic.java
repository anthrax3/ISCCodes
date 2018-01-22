/*						-----------------------------------------
 * 						|	Filename	: Pseudoarithmetic.java |
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2011					|
 * 						|	Question 	: 10	    			|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *  You are given a sequence of n integers, which are called pseudo arithmetic sequences
 *	(sequences that are in arithmetic progression).
 *		Sequence of n integers : 2, 5, 6, 8, 9, 12 
 *		We observe that 2 + 12 = 5 + 9 = 6 +8 = 14
 *		The sum of the above sequence can be calculated as 14 x 3 = 42
 *		or sequence containing an odd number of elements the rule is to double the middle element, 
 *		For example 2, 5, 7, 9, 12 =2 +12 = 5 +9 = 7 +7 = 14
 *			14 x 3 = 42 [ middle element = 7]
 *		Class name						:	Pseudoarithmetic
 *		Data Members/instance variables	:
 *			n							:	to store the size of the sequence
 *			a[ ]						:	integer array to store the sequence of numbers
 *			ans, flag					:	to store the status
 *			sum							:	to store the sum of sequence of numbers
 *			r							:	to store the sum of 2 numbers
 *		Member functions				:	
 *			Pseudoarithmetic( )			:	default constructor
 *			void accept(int nn)			:	to assign nn to n and to create an integer array. 
 *											Fill in the elements of the array.
 *			boolean check( )			:	return true if the sequence is a pseudo-arithmetic 
 *											sequence otherwise return false.
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Pseudoarithmetic{
 	int n, a[ ], sum, r; boolean ans, flag;
 	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	Pseudoarithmetic(){
 		ans=true; flag=true; n=0; sum=0; r=0;
 	}  
	void accept(int nn ) throws Exception{
 		n=nn; a=new int[n];
 		for(int i=0;i<a.length;i++){
  			System.out.print("\nNumber:");
  			a[i]=Integer.parseInt(br1.readLine());
  		}
 	}
 	boolean check(){
 		int i,j; i=0; j=n-1; r=a[i++]+a[j--]; sum+=r;
  		while(flag){
   			if(i>j){
   				flag=false; break;
   			}
   			else if(i==j){
   				flag=false; sum+=a[i]+a[j]; break;
  			}
   			else if (r!=a[i]+a[j])
   				break;
   			sum+=a[i]+a[j]; System.out.println(sum); i++; j--;
  		}
  		if(flag)
  			ans=false;
  		return ans;
  	}

	public static void main(String args[]) throws Exception{
  		int x;
  		Pseudoarithmetic one=new Pseudoarithmetic();
  		System.out.println("How many elements to store:");
  		x=Integer.parseInt(one.br1.readLine()); one.accept(x);
  		System.out.println("The series is Pseudo Arithmetic:"+ one.check());
  		System.out.println("Sum of the elements="+one.sum);
 	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------