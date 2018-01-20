/* Filename	: DDA.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2012
 * Question : 3
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Write a program to declare a matrix A [][] of order (MXN) where 'M' is the number of rows 
 * 	and 'N' is the number of columns such that both M and N must be greater than 2 and less 
 * 	than 20. Allow the user to input integers into this matrix.
 *	Perform the following tasks on the matrix:
 *   	1. Display the input matrix
 *    	2. Find the maximum and minimum value in the matrix and display them along with their 
 *    	   position.
 *    	3. Sort the elements of the matrix in ascending order using any standard sorting technique
 *    	   and rearrange them in the matrix.
 *	Output the rearranged matrix.
 *-----------------------------------------------------------------------------------------------
 */ 
import java.util.*;
class DDA{
	public static void main (String args[])throws InputMismatchException{
		Scanner scan = new Scanner(System.in);
		int m,n,i,j,x,t,smallest,rowS,colS,largest,rowL,colL;
		System.out.println("Enter two positive integers m and n, where 2 < m,n < 20: ");
    	m = scan.nextInt();
    	n = scan.nextInt();
    	if(m > 2 && m < 20 && n > 2 && n < 20){
        	int a[][] = new int[m][n];
        	System.out.println("Enter " + (m*n) + " elements: ");
            for(i=0;i< m;i++){
                for(j=0;j< n;j++){
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("Original Matrix: ");
            for(i=0;i< m;i++){
                for(j=0;j< n;j++){
                	System.out.print(a[i][j]+ " "); 
                }
                System.out.println();
            }
            smallest = largest = a[0][0];
            rowS = colS = rowL = colL = 0;
            //1-D array to store the elements of the matrix
            int b[] = new int[m*n]; 
            x=0;
            for(i=0;i< m;i++){
                for(j=0;j< n;j++){
                   //Store elements into a 1-D array
                    b[x++] = a[i][j]; 
                    if(smallest > a[i][j]){
                        smallest = a[i][j];
                        rowS = i;
                        colS = j;
                    }
                    if(largest < a[i][j]){
                        largest = a[i][j];
                        rowL = i;
                        colL = j;
                    }
                }
            }
     		//Sort the elements in ascending order using bubble sort
            for(i=1;i< x;i++){
                for(j=0;j< x-i;j++){
                    if(b[j] > b[j+1]){
                        t = b[j];
                        b[j] = b[j+1];
                        b[j+1] = t;
                    }
                }
            }
            //Put the sorted elements back into the matrix
            x=0;
            for(i=0;i< m;i++){
                for(j=0;j< n;j++){
                    a[i][j] = b[x++];
                }
            }
        	System.out.println("\n Largest Number: "+largest);    
        	System.out.println("Row: "+rowL);               
        	System.out.println("Column: "+colL);    
        	System.out.println("Smallest Number: "+smallest);    
        	System.out.println("Row: "+rowS);    
        	System.out.println("Column: "+colS);    
        	System.out.println("Rearranged Matrix: ");
            for(i=0;i< m;i++){
                for(j=0;j< n;j++){
                	System.out.print(a[i][j]+ " "); 
                }
                System.out.println();
            }
    	}
    	else{
        	System.out.println("Invalid value!");
    	} 
	}
}
