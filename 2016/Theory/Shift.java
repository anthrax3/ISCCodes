/* Filename	: Shift.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2016
 * Question : 8
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * A class Shift contains a two dimensional integer array of order (m×n) where the maximum
 * values of both m and n is 5. Design the class Shift to shuffle the matrix (i.e. the first row
 * becomes the last, the second row becomes the first and so on). The details of the members
 * of the class are given below:
 *		Class name 							: 	Shift
 *		Data members/instance variables		:
 * 			mat[ ][ ] 						: 	stores the array element
 *			m 								: 	integer to store the number of rows
 *			n 								: 	integer to store the number of columns
 *		Methods/Member functions			:
 *			Shift(int mm, int nn ) 			: 	parameterized constructor to initialize the data
 *												members m = mm and n = nn
 *			void input( ) 					:   takes inputs
 *			void cyclic(Shift P) 			: 	enables the matrix of the object(P) to shift each
 *												row upwards in a cyclic manner and store the
 *												resultant matrix in the current object
 *			void display( ) 				: 	displays the matrix elements
 *  Specify the class Shift giving details of the constructor( ), void input( ), void cyclic(Shift)
 *  and void display( ). Define the main( ) function to create an object and call the methods
 *  accordingly to enable the task of shifting the array elements.
 *-----------------------------------------------------------------------------------------------
 */
import java.util.Scanner;
public class Shift{ 
	static Scanner sc=new Scanner(System.in);
	int mat[][];
	int m,n;
	Shift(int mm,int nn){ 
		m=mm;
		n=nn;
		mat=new int[m][n];
  	}
	void input(){ 
		System.out.println("Enter elements");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				mat[i][j]=sc.nextInt();
	}
	void display(){
		for(int i=0;i<m;i++){ 
			System.out.println();
			for(int j=0;j<n;j++)
				System.out.print(mat[i][j] +"\t");
			}
		}
	void cyclic(Shift P){ 
		for(int i=0;i<m;i++)
			for(int j =0;j<n;j++){ 
				if(i!=0)
					mat[i-1][j]=P.mat[i][j];
				else
					mat[m-1][j]=P.mat[0][j];
			}
	}
	static void main(){ 
		Shift x=new Shift(3,4);
		Shift y=new Shift(3,4);
		x.input();
		y.cyclic(x);
		x.display();
		y.display();
	}
}
