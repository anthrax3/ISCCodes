/* Filename	: Perimeter.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2013
 * Question : 11
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	A super class Perimeter has been defined to calculate the perimeter of a parallelogram. 
 *	Define a subclass Area to compute the area of the parallelogram by using the required data 
 *	members of the super class. The details are given below:
 *		Class name 						: 	Perimeter
 *		Data members/instance variables	:
 *			a 							: 	to store the length in decimal
 *			b 							: 	to store the breadth in decimal
 *		Member functions				:
 *			Perimeter(..) 				: 	parameterized constructor to assign values
 *			double Calculate( ) 		: 	calculate and return the perimeter of a 
 *											parallelogram as 2 * (length + breadth)
 *			void show() 				: 	to display the data members along with 
 *											the perimeter of the parallelogram
 *											
 *		Class name 						: 	Area
 *		Data members/instance variables	:
 *			h 							: 	to store the height in decimal
 *			area 						: 	to store the area of the parallelogram
 *		Member functions				:
 *			Area(..) 					: 	parameterized constructor to assign values 
 *											to data members of both the classes
 *			void doarea() 				: 	compute the area as (breadth * height)
 *			void show() 				: 	display the data members of both classes 
 *											along with the area and perimeter of 
 *											the parallelogram
 *	Specify the class Perimeter giving details of the constructor( … ), void Calculate( ) 
 *	and void show( ). Using the concept of inheritance, specify the class Area giving 
 *	details of the constructor( … ), void doarea( ) and void show( ).
 *	The main function and algorithm need not be written.
 *-----------------------------------------------------------------------------------------------
 */ 
import java.util.*;
class Perimeter{
	protected double a,b;
	Perimeter(double aa,double bb){
		a=aa;
		b=bb;
	}
	double Calculate(){
		return (2*(a+b));
	}
	void show(){
		System.out.print("\n Length = " + a);
		System.out.print("\n Breadth = " + b);
		System.out.print("\n Perimeter =" + Calculate());
	}
}

import java.util.*;
class Area extends Perimeter{
	double h;
	double area;
	Area(double aa, double bb, double cc){
		super(aa,bb);
		h=cc;
	}
	void doarea(){
		area=super.b*h;
	}
	void show(){
		super.show();
		System.out.print("\n Height = " + h);
		System.out.print("\n Area = " + area);
	}
}
