/* Filename	: WordPile.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2015
 * Question : 11
 */
/*
 * ################################################################################################
 * ======================================[DESCRIPTION]=============================================
 * ################################################################################################
 * 	WordPile is an entity which can hold maximum of 20 characters. The restriction is that a
 *	character can be added or removed from one end only.
 *	Some of the members of classes are given below:
 *		Class name						:  	WordPile
 *		Data members/instance variables	:
 *			ch[ ] 						: 	character array to hold the character elements
 *			capacity					:	integer variable to store the maximum capacity
 *			top							:	to point to the index of the topmost element
 *		Methods/Member functions		:
 *			WordPile(int cap)			: 	constructor to initialise the data member
 *											capacity = cap, top = -1 and create the WordPile
 *			void pushChar(char v) 		:	adds the character to the top of WordPile if
 *											possible, otherwise output a message “WordPile is full”
 *			char popChar() 				:	returns the deleted character from the top of the
 *											WordPile if possible, otherwise it returns ‘\\’
 *-------------------------------------------------------------------------------------------------
 */ 
public class WordPile{
	char ch[] = new char[20];
	int capacity,top;
	WordPile(int cap){ 
		capacity=cap;
		top=-1;
		ch=new char[capacity];
	}
	void pushChar(char v){ 
		if(top<capacity-1)
			ch[++top]=v;
		else
			System.out.println("WordPile is full");
	}
	char popChar(){
		if(top>=0)
			return ch[top--];
		else
			return '\\';
	}
}
