/*						-----------------------------------------
 * 						|	Filename	: Point.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2010					|
 * 						|	Question 	: 8    					|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	The co-ordinates of a point P on a two-dimensional plane can be represented by P(x,y) with 
 * 	x as the x co-ordinate and y as the y co-ordinate. The co-ordinates of midpoint of two 
 * 	points P1(x1,y1) and P2(x2,y2) can be calculated as P(x,y) where: x=x1+x2/2, y=y1+y2/2
 *	Design a class Point with the following details:
 *		Class name							:	Point
 *		Data members/instance variables		:
 *			x								:	stores the x co-ordinate
 *			y								:	stores the y co-ordinate
 *		Member functions					:
 *			Point()							:	constructor to initialize x=0 and y=0
 *			void readPoint()				:	accepts the co-ordinates x and y of a point
 *			Point midpoint(Point A, Point B):	calculates and returns the midpoint of the two 
 *												points A and B.
 *			void displaypoint()				:	displays the co-ordinates of a point
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Point{
 	int x,y;
 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	Point(){
  		x=0;
  		y=0;
 	}  
 	public void readPoint()throws IOException{
     	System.out.println("Enter 'x' coordinate:");
     	x=Integer.parseInt(br.readLine());
     	System.out.println("Enter 'y' coordinate:");
     	y=Integer.parseInt(br.readLine());
 	}
	Point midpoint(Point A, Point B){
  		Point obj=new Point();
  		obj.x= (A.x+B.x)/2;
  		obj.y= (A.y+B.y)/2;
  		return obj;
 	}
 	void displaypoint(){
  		System.out.println("'X' and 'Y' cordinates ="+ x+ ","+y);
  	}
	public static void main(String args[]) throws Exception{
 		Point one=new Point();
 		Point two=new Point();
 		Point three=new Point();
 		System.out.println("For first Object\n");
		one.readPoint();
 		System.out.println("For second Object\n");
 		two.readPoint();
 		three=three.midpoint(one,two);
 		System.out.println("For first Object\n");
 		one.displaypoint();
 		System.out.println("For second Object\n");
 		two.displaypoint();
 		System.out.println("For third Object\n");
 		three.displaypoint();
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------