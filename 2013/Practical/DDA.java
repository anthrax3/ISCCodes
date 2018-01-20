/* Filename	: DDA.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2013
 * Question : 2
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Write a program to declare a square matrix A[][] of order (M X M) where 'M' is the number of 
 * 	rows and the number of columns such that M must be greater than 2 and less than 20. Allow 
 * 	the user to input integers into this matrix. Display appropriate error message for an 
 * 	invalid input. Perform the following tasks:
 *    	1. Display the input matrix.
 *   	2. Create a mirror image of the inputted matrix.
 *     	3. Display the mirror image matrix.
 *-----------------------------------------------------------------------------------------------
 */ 
import java.util.*;
class DDA{
	public static void main(String[]args)throws InputMismatchException{
		int M, i, j, k, t;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows for a square matrix: ");
    	M = scan.nextInt();
		if(M<=2 || M>=20)
			System.out.println("\nSIZE OUT OF RANGE");
		else{
		    int A[][] = new int [M][M];
		    System.out.println("Enter "+(M*M) + " elements: ");
   			for(i=0;i < M;i++){
    			for(j=0;j < M;j++){
        			A[i][j] = scan.nextInt();
     			}
   			}
   			System.out.println("ORIGINAL MATRIX");
   			for(i=0;i < M;i++){
    			for(j=0;j < M;j++){
           			System.out.print(A[i][j]+" ");
     			}
        	System.out.println();
   			}
   			for(j=0, k = M-1; j < M/2; j++, k--){
		   		for(i=0;i < M; i++){
				   t = A[i][j];
				   A[i][j] = A[i][k];
				   A[i][k] = t;
		    	}
			}
	   		System.out.println("MIRROR MATRIX");
	   		for(i=0;i < M;i++){
				for(j=0;j < M;j++){
		       		System.out.print(A[i][j]+" ");
		 		}
		    	System.out.println();
	   		}
		}
	}
}
