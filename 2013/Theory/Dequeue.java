/* Filename	: Dequeue.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2013
 * Question : 12
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A doubly queue is a linear data structure which enables the user to add and remove integers
 *	from either ends, i.e. from front or rear. Define a class Dequeue with the following details:
 *		Class Name						: 	Dequeue
 *		Data Members/Instance Variables	:
 *			arr[ ]						:	array to hold up to 100 integer elements
 *			lim							:	stores the limit of the dequeue
 *			front						:	to point to the index of front end
 *			rear						:	to point to the index of the rear end
 *		Member Function					:
 *			Dequeue(int l)				:	constructor to initialize the data members 
 *											lim=1; front=rear=0
 *			void addfront(int val)		:	to add integer from the front if possible else
 *											display the message (“Overflow from front”)
 *			void addrear(int val)		:	to add integer from the rear if possible else
 *											display the message (“Overflow from rear”)
 *			int popfront( )				:	returns element from front, if possible
 *											otherwise returns - 9999
 *			int poprear( )				:	returns element from rear, if possible otherwise
 *											returns - 9999
 *-----------------------------------------------------------------------------------------------
 */ 
public class Dequeue{
	int arr[] = new int[100];
	int lim,front,rear;
	Dequeue(int l){
		lim=l;
		front=0;
		rear=0;
		arr=new int[lim];
	}
	void addfront(int val){
		if(front>0)
			arr[front--]=val;
		else
			System.out.print("\n Overflow from front ");
	}
	void addrear(int val){
		if(rear<lim-1)
			arr[++rear]=val;
		else
			System.out.print("\n Overflow from rear ");
	}
	int popfront(){
		if(front!=rear)
			return arr[++front];
		else
			return -9999;
	}
	int poprear(){
		if(front!=rear)
			return arr[rear--];
		else
			return -9999;
	}
}
