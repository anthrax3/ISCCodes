/* Filename	: Plane.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2015
 * Question : 12
 */
/*
 * ################################################################################################
 * ======================================[DESCRIPTION]=============================================
 * ################################################################################################
 * 	A line on a plane can be represented by coordinates of the two-endpointsp1 and p2 as p1(x1,y1) 
 *  and p2(x2, y2).
 *	A super class Plane is defined to represent a line and a sub class Circle to find the length of
 *	the radius and the area of circle by using the required data members of super class.
 *	Some of the members of both the classes are given below:
 *			Class name						:	Plane
 *			Data members/instance variables	:
 *					x1						: 	to store the x-coordinate of the first end point
 *					y1						: 	to store the y-coordinate of the first end point
 *			Member functions/methods		:
 *					Plane(intnx, intny)		:	parameterized constructor to assign the data
 *												members x1=nx and y1=ny
 *					void Show( )			: 	to display the coordinates
 *
 *			Class name						: 	Circle
 *			Data members/instance variables	:
 *					x2						:	to store the x-coordinate of the second end point
 *					y2						:	to store the y-coordinate of the second end point
 *					radius					:	double variable to store the radius of the circle
 *					area					:	double variable to store the area of the circle
 *			Member functions/methods		:
 *					Circle(...)				: 	parameterized constructor to assign values to data
 *												members of both the classes
 *					void findRadius()		: 	to calculate the length of radius
 *					void findArea()			: 	to find the area of circle
 *					void Show()				: 	to display both the coordinates along with the
 *												length of the radius and area of the of the circle
 *	Specify the class Plane giving details of the constructor and void Show( ). Using the
 *	concept of inheritance, specify the class Circle giving details of the constructor, void
 *	findRadius( ), void findArea( ) and void Show( ).
 *-------------------------------------------------------------------------------------------------
 */ 
public class Plane{
	double x1,y1;
	Plane(double nx, double ny){ 
		x1=nx;
		y1=ny;
	}
	void Show(){ 
		System.out.println("x- coordinate= "+ x1);
		System.out.println("y- coordinate= "+ y1);
	}
}
public class Circle extends Plane{
	double x2, y2, radius, area;
	Circle(double nx, double ny, double a, double b){ 
		super(nx,ny);
		x2=a;
		y2=b;
	}
	void findRadius(){ 
		radius= ( Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ) ) / 2;
	}
	void findArea(){ 
		area = 3.14 * radius * radius ;
	}
	void Show(){ 
		super.Show();
		System.out.println("Second x- coordinate= "+ x2);
		System.out.println("Second y- coordinate= "+ y2);
		System.out.println(" Length of radius = "+radius);
		System.out.println(" Area = " + area);
	}
}
