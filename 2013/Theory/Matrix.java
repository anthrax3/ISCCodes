/*						-----------------------------------------
 * 						|	Filename	: Matrix.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2013					|
 * 						|	Question 	: 10    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	A class Matrix contains a two dimensional integer array of order [m x n]. The maximum value 
 *	possible for both ‘m’ and ‘n’ is 25. Design a class Matrix to find the difference of the 
 *	matrices. The details of the members of the class are given below:
 *		Class name 						: 	Matrix
 *		Data members/instance variables	:
 *			arr[ ][ ] 					: 	stores the matrix element
 *			m 							: 	integer to store the number of rows
 *			n 							: 	integer to store the number of columns
 *		Member functions				:
 *			Matrix(int mm, int nn) 		: 	to initialize the size of the matrix m=mm and n=nn
 *			void fillarray() 			: 	to enter the elements of the matrix
 *			Matrix SubMat(Matrix A) 	: 	subtract the current object from the matrix of 
 *											parameterized object and return the resulting object
 *			void display() 				: 	display the matrix elements
 *	Specify the class Matrix giving details of the constructor(int,int), void fillarray(), 
 *	Matrix SubMat(Matrix A) and void display(). Define the main() function to create objects 
 *	and call the function accordingly to enable the task.
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.Scanner;
public class Matrix{ 
	static Scanner sc=new Scanner(System.in);
	int arr[][]=new int[25][25];
	int m,n;
	Matrix(int mm,int nn){ 
		m=mm; n=nn;
	}
	void fillarray(){ 
		System.out.print("\n Enter elements of array ");
		for(int i=0;i<m;i++){ 
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		}
	}
	Matrix SubMat(Matrix A){
		Matrix B=new Matrix(m,n);
		for(int i=0;i<m;i++){ 
			for(int j=0;j<n;j++)
				B.arr[i][j]= arr[i][j] - A.arr[i][j];
		}
		return B;
	}
	void display(){ 
		for(int i=0;i<m;i++){ 
			System.out.println();
			for(int j=0;j<n;j++)
				System.out.print(arr[i][j] + " \t ");
		} 		
	}
	public static void main(){ 
		System.out.print("\n Size of array " );
		int x=sc.nextInt();
		int y=sc.nextInt();
		Matrix A=new Matrix(x,y);
		Matrix B=new Matrix(x,y);
		Matrix C=new Matrix(x,y);
		A.fillarray();
		B.fillarray();
		C=A.SubMat(B);
		C.display();
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------