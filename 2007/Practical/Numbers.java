/*						                       -----------------------------------------
 * 						                      |	Filename	         : Numbers.java		 	  |
 * 						                      |	Coder		           : Ayushanand Singh		| 
 * 						                      |	Paper    	        : Practical				     |
 * 						                      |	Year		            : 2007					         |
 * 						                      |	Question 	        : 3   	 				        |
 * 					                      	-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A unique-digit integer is a positive integer (without leading zeros) with no duplicate
 *	digits. For example 7, 135, 214 are all unique-digit integers whereas 33, 3121, 300 are not.
 *
 *	Given two positive integers m and n, where m.
 *
 *	The input contains two positive integers m and n. Assume m<30000 and n<30000. You are to 
 *	output the number of unique-digit integers in the specified range along with their values.
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Numbers{
 	int k,x,i,j,m,n,c,arr[],index;
 	BufferedReader br;
  	public static void main(String args[])throws IOException{
  		Digit ob=new Digit();
  		ob.take();
  		ob.show();
  	}
  	Digit(){
   		br=new BufferedReader(new InputStreamReader(System.in));
   		arr=new int[1000];
   		c=0;
   		index=0;
   	}
	public void take()throws IOException{
 		while(true){
 			System.out.println("Enter the Lower range:");
			m=Integer.parseInt(br.readLine().trim());
			System.out.println("Enter the Upper range:");
			n=Integer.parseInt(br.readLine().trim());
			if(m< n)
				break;
		}
	}
	void show(){
		System.out.println("The unique digit integers are:");
		for(i=m;i< =n;i++){
 			index=0;
 			for(j=i;j> 0;j=j/10){
  				x=j%10;
  				for(k=0;k< index;k++){
   					if (arr[k]==x)
   						break;
   				}
   				if(k< index)
   					break;
   				else
   					arr[index++]=x;
   			}
   			if (j==0){
    			c++;
    			System.out.print(" "+i);
    		}
    	}
   		System.out.println("\nFequency of unique digit integers is :"+ c);
 	}
 }
// ------------------------------------{END OF THE CODE}-----------------------------------------