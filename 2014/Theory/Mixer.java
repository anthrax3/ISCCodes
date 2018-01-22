/*						-----------------------------------------
 * 						|	Filename	: Mixer.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2014					|
 * 						|	Question 	: 8	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A class Mixer has been defined to merge two sorted integer arrays in ascending order.
 *	Some of the members of the class are given below:
 *		Class name						: 	Mixer
 *		Data members/instance variables	:
 *			int arr[ ] 					: 	to store the elements of an array
 *			int n 						: 	to store the size of the array
 *		Member functions				:		
 *			Mixer(int nn) 				: 	constructor to assign n=nn
 *			void accept() 				: 	to accept the elements of the array in ascending
 *											order without any duplicates
 *			Mixer mix(Mixer A) 			: 	to merge the current object array elements with
 *											the parameterized array elements and return the
 *											resultant object
 *			void display( ) 			: 	to display the elements of the array
 *	Specify the class Mixer, giving details of the constructor(int), void accept( ),
 *	Mixer mix(Mixer) and void display( ) . Define the main( ) function to create an object
 *	and call the function accordingly to enable the task.
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.*;
class Mixer{ 
	int arr[ ]; int n;
	static Scanner sc=new Scanner(System.in);
	Mixer(int nn){
		n=nn; arr=new int[n];
	}
	void accept( ){ 
		System.out.println("Enter "+ n+ " elements in ascending order");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
	}
	Mixer mix( Mixer A){ 
		Mixer B=new Mixer(n+A.n);
		int x=0,y=0,z=0;
		while(x<n && y<A.n){ 
			if (arr[x] > A.arr[y]){ 
				B.arr[z]=A.arr[y];
				y++;
			}
			else{ 
				B.arr[y]=arr[x];
				x++;
			}
			z++;
		}
		while(x<n)
			B.arr[z++]=arr[x++];
		while(y<A.n)
			B.arr[z++]=A.arr[y++];
		return B;
	}
	void display(){ 
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	static void main(){ 
		Mixer P=new Mixer(4);
		Mixer Q=new Mixer(3);
		Mixer R=new Mixer(7);
		P.accept(); Q.accept(); R=P.mix(Q); R.display();
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------