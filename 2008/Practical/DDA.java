/*						-----------------------------------------
 * 						|	Filename	: DDA.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2008					|
 * 						|	Question 	: 3   	 				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	Given a square matrix list [ ] [ ] of order ‘ n ’. The maximum value possible for ‘ n ’ 
 * 	is 20. Input the value for ‘ n ’ and the positive integers in the matrix and perform
 * 	the following task:
 *   	1. Display the original matrix
 *   	2. Print the row and column position of the largest element of the matrix.
 *    	3. Print the row and column position of the second largest element of the matrix.
 *   	4. Sort the elements of the rows in the ascending order and display the new matrix.
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.*;
class DDA{
	public static void main(String args[])throws InputMismatchException{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows(<=20) for the square matrix : ");
		int n=scan.nextInt();
		if(n>20)
    		System.out.println("Number must not exceed 20.");
		else{
			int a[][]=new int[n][n];
			int i,j,rg,cg,rs,cs,s,g,k,t;
			for(i=0;i< n;i++){
				for(j=0;j< n;j++)
					a[i][j] = scan.nextInt();
			}
			System.out.println("ORIGINAL MATRIX: ");
			for(i=0;i< n;i++){
				for(j=0;j< n;j++)
					System.out.print(a[i][j] + " ");
				System.out.println();
			}
			s = g = a[0][0];
			rg=cg=rs=cs=0;
			for(i=0;i< n;i++){
				for(j=0;j< n;j++){
					if(s > a[i][j]){
    					s = a[i][j]; rs = i; cs = j;
					}
					if(g < a[i][j]){
	    				g = a[i][j]; rg = i; cg = j;
					}
				}
			}
			for(i=0;i< n;i++){
				for(j=0;j< n;j++){
					for(k=j+1;k< n;k++){
	    				if(a[i][j] > a[i][k]){
        					t = a[i][j]; a[i][j] = a[i][k]; a[i][k] = t;
    					}
					}
				}
			}
			System.out.println("The largest element "+g+" is in row "+(rg+1)+" and column "+(cg+1));
			System.out.println("The smallest element "+s+" is in row "+(rs+1)+" and column "+(cs+1));
			System.out.println("SORTED MATRIX: ");
			for(i=0;i< n;i++){
				for(j=0;j< n;j++)
					System.out.print(a[i][j] + " ");
				System.out.println();
			}
		}
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------