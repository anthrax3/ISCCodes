/*						-----------------------------------------
 * 						|	Filename	: DDA.java				|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2016					|
 * 						|	Question 	: 2	    				|
 * 						-----------------------------------------
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * Write a program to declare a square matrix A[][] of order (M x M) where ‘M’ must be greater 
 * than 3 and less than 10. Allow the user to input positive integers into this matrix. 
 * Perform the following tasks on the matrix:
 *  1. Sort the non-boundary elements in ascending order and rearrange them in the matrix.
 *  2. Calculate the sum of both the diagonals.
 *  3. Display the original matrix, rearranged matrix and only the diagonal elements of the 
 *     rearranged matrix with their sum.
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.*;
class DDA{
    public static void main(String arg[])throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for a square matrix (between 3 and 10): ");
        int M = sc.nextInt();
        if(M <=3 || M >=10)
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");
       	else{
            int a[][] = new int[M][M];  int b[] = new int[M*M];  int i, j, c, t;
            System.out.println("Enter " + (M*M) + " elements");
            for(i = 0; i < M; i++)
                for(j = 0; j < M; j++)
                    a[i][j] = sc.nextInt();
            System.out.println("\nORIGINAL MATRIX: "); c = 0;
            for(i = 0; i < M; i++){
                for(j = 0; j < M; j++){
                     System.out.print(a[i][j]+ "   ");
                     if(i != 0 && j != 0 && i != M-1 && j != M - 1)
                     	b[c++] = a[i][j];
                } System.out.println();
            }
            for(i = 0; i < c; i++){
                for(j = i+1; j < c; j++){
                    if(b[i] > b[j]){
                        t = b[i];  b[i] = b[j]; b[j] = t;
                    }
                }
            } c = 0;
            for(i = 0; i < M; i++){
                for(j = 0; j < M; j++){
                     if(i != 0 && j != 0 && i != M-1 && j != M - 1)
                        a[i][j] = b[c++];
                }
            }
            System.out.println("\nREARRANGED MATRIX: ");
            for(i = 0; i < M; i++){
                for(j = 0; j < M; j++)
                     System.out.print(a[i][j]+ "   ");
                 System.out.println();
            }
            System.out.println("\nDIAGONAL ELEMENTS: ");
            for(i = 0; i < M; i++){
                for(j = 0; j < M; j++){
                    if( i == j || i+j == M-1)
                        System.out.print(a[i][j]+ "   ");
                    else
                     	System.out.print("   ");
                }System.out.println();
            }
        }
    }
}
// ------------------------------------{END OF THE CODE}-----------------------------------------