/*						-----------------------------------------
 * 						|	Filename	: Array_to_Stack.java	|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2014					|
 * 						|	Question 	: 12	   				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	A stack is a linear data structure which enables the user to add and remove integers from
 *	one end only, using the concept of LIFO(Last In First Out). An array containing the marks
 *	of 50 students in ascending order is to be pushed into the stack.
 *	Define a class Array_to_Stack with the following details:
 *		Class name						: Array_to_Stack
 *		Data members/instance variables	:
 *			m[ ] 						: 	to store the marks
 *			st[ ] 						: 	to store the stack elements
 *			cap 						: 	maximum capacity of the array and stack
 *			top 						: 	to point the index of the topmost element of stack
 *		Methods/Member functions		:
 *			Array_to_Stack (int n)		: 	parameterized constructor to initialize cap = n
 *										  	and top = -1
 *			void input_marks() 			: 	to input the marks from user and store it in the
 *											array m[ ] in ascending order and simultaneously
 *											push the marks into the stack st[ ] by invoking 
 *											the function pushmarks()
 *			void pushmarks(int v) 		:	to push the marks into the stack at top location
 *											if possible, otherwise, display “not possible”
 *			int popmarks( ) 			:	to return marks from the stack if possible,
 *											otherwise, return -999
 *			void display( ) 			:	To display the stack elements
 */

// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.util.*;
class Array_to_Stack{ 
	int m[], st[];
	int cap, top;
	static Scanner sc=new Scanner(System.in);
	Array_to_Stack(int n){ 
		cap = n;
		top = -1;
		m=new int[cap];
		st=new int[cap];
	}
	void input_marks(){ 
		System.out.println("Enter "+cap+" elements in ascending order");
		for(int i=0;i<cap;i++){ 
			m[i]=sc.nextInt();
			pushmarks(m[i]);
		}
	}
	void pushmarks(int v){ 
		if (top<cap-1)
			st[++top]=v;
		else
			System.out.println("stack is full");
	}
	int popmarks(){ 
		if(top>=0)
			returns[top--];
		else
			return -999;
	}
	void display(){ 
		for(int i=top;i>=0;i--)
			System.out.println(st[i]);
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------