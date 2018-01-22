/*						-----------------------------------------
 * 						|	Filename	: DDA.java				|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Practical				|
 * 						|	Year		: 2014					|
 * 						|	Question 	: 2	    				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Write a program to declare a square matrix A[][] of order MXM where M is an positive 
 * 	integer and represents row and column. M should be greater than 2 and less 	than 10.
 * 	Accept the value of M from user. Display an appropriate message for invalid input.
 *	Perform the following task:
 *		1. Display the original matrix
 *      2. Check if the given matrix is symmetric or not. If the element of the ith 
 *         row and jth column is same as element of the jth row and ith column.
 *    	3. Find the sum of the left and right diagonal of the matrix and display them
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class DDA{
	int left=0,right=0,m,i,j, arr[][];
 	boolean bool=false;
  	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  	public void takeValues() throws Exception{
   		System.out.println("Enter the value of 'm';");
   		m=Integer.parseInt(br.readLine());
   		if(m > =10){
		   System.out.println("Matrix size is out of range");
   		   return;
   		}
   		arr=new int[m][m];
   		for(i=0;i < m; i++){
		    for(j=0;j < n;j++){
    			System.out.println("value:");
   				arr[i][j]=Integer.parseInt(br.readLine());
   			}
   		}
   		System.out.println("Original Matrix\n");
   		for(i=0;i < m : i++){
    		for(j=0;j < n : j++)
    			System.out.print(" "+arr[i][j]);
    		System.out.println();
    	}
   		for(i=0;i < m ; i++){
    		for(j=0;j < n; j++){
    			if(arr[i][j]!=arr[j][i]){
    				bool=true;
    				break;
    			}
    		}
    		if(bool==true) break;
    	}
    	if(bool)
    		System.out.println("The given matrix is not symmetric");
    	else
    		System.out.println("The given matrix is symmetric");
		for(i=0;i < m ; i++){
    		for(j=0;j < n; j++){
			    if(i==j)
    				left=left+arr[i][j];
    			if(i+j==m-1)
    				right=right+arr[i][j];
    		}
    	}
    	System.out.println("Sum of the left diagonal="+left);
    	System.out.println("Sum of the right diagonal="+right);
	}
  	public static void main(String args[])throws Exception{
    	DDA ob=new DDA(); ob.takeValues();
    }
}
// ------------------------------------{END OF THE CODE}-----------------------------------------