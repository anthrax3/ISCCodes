/*						-----------------------------------------
 * 						|	Filename	: Stack.java			|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2011					|
 * 						|	Question 	: 12	   				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Stack is a kind of data structure which can store elements with the restriction that an 
 *	element can be added or removed from the top only. The details of class Stack are below:
 *		Class name						:	Stack
 *		Data Members/instance variables	:
 *			st[]						:	the array to hold names.
 *			size						:	the maximum capacity of the string array 
 *			top							:	the index of the topmost element of the stack
 *			ctr							:	to count the number of elements of the stack
 *		Member functions				:
 *			Stack()						:	default constructor
 *			Stack(int cap)				:	constructor to initialize size=cap and top=-1
 *			void pushname(String n)		:	to push a name into the stack. If the stack is full, 
 *											display the message “overflow”
 *			String popname()			:	removes a name from the top of the stack and returns 
 *											it. If the stack is empty, display the 
 *											message “underflow”
 *			void display()				:	Display the elements of the stack
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
class Stack{
 	int size,top,ctr;
	String st[];
	Stack(){
 		size=0;
 		top=-1;
 	}
 	Stack(int cap){
  		size=cap;
		top=-1;
  	}
	void pushname(String n ){
 		if(top==size)
 			System.out.println("Stack Overflow...");
 		else
 			st[++top]=n;
 	}
	void popname(){
 		if(top==-1)
 			System.out.println("Stack Underflow...");
 		else
 			System.out.println("Deleted Name:"+st[top--]);
 	}
 	void display(){
 		System.out.println("Names in the stack:");
  		for(int i=top;i>=0;i--)
   			System.out.println(st[i]);
  	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------