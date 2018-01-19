/* Filename	: Book.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2016
 * Question : 11
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A bookshelf is designed to store the books in a stack with LIFO(Last In First Out)
 *	operation. Define a class Book with the following specifications:
 *		Class name							: Book
 *		Data members/instance variables		:
 *				name[ ]						: stores the names of the books
 *				point						: stores the index of the topmost book
 *				max							: stores the maximum capacity of the bookshelf
 *		Methods/Member functions			:
 *				Book(int cap)				: constructor to initialise the data members
 *				void tell()					: displays the name of the book which was last
 *											  entered in the shelf. If there is no book left in
 *											  the shelf, displays the message “SHELF EMPTY”
 *				void add(String v)			: adds the name of the book to the shelf if possible,
 *				  							  otherwise displays the message “SHELF FULL”
 *				void display( )				: displays all the names of the books available in
 *											  the shelf
 *	Specify the class Book giving the details of ONLY the functions void tell( ) and 
 *	void add(String). Assume that the other functions have been defined.
 *  The main function need not be written.
 *-----------------------------------------------------------------------------------------------
 */
public class Book{ 
	String name[ ];
	int point,max;
	Book(int cap){ 
		max=cap;
		point = -1;
		name=new String[max];
	}
	void tell(){ 
		if(point<0)
			System.out.print("\n SHELF EMPTY");
		else
			System.out.print("\n " + name[point]);
	}
	void add(String v){ 
		if(point<max-1)
			name[++point]=v;
		else
			System.out.print("\n SHELF FULL");
	}
	void display(){ 
		for(int i=point;i>=0;i--)
			System.out.print("\n " + name[i]);
	}
}
