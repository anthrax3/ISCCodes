/*						-----------------------------------------
 * 						|	Filename	: Link.java				|
 * 						|	Coder		: Ayushanand Singh		|
 * 						|	Paper    	: Theory				|
 * 						|	Year		: 2012					|
 * 						|	Question 	: 11	   				|
 * 						-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Link is an entity which can hold a maximum of 100 integers. Link enables the user to add 
 * 	elements from the rear end and remove integers from the front end of the entity.
 *		Class Name						:	Link
 *		Data members/instance variables	:
 *			lnk[]						:	entity to hold the integer elements.
 *			max							:	stores the maximum capacity of the entity.
 *			begin						:	to point to the index of the front end.
 *			end							:	to point to the index of the rear end.
 *		Member functions				:
 *		Link(int mm)					:	constructor to initialize max=mm, begin=0, end=0.
 *		void addlink(int v)				:	to add an element from the rear index if possible 
 *											otherwise display the message “ OUT OF SIZE “.
 *		int dellink()					:	to remove and return an element from the front index, 
 *											if possible otherwise display the message 
 *											“ EMPTY… “ and return -99.
 *		void display()					:	displays the elements of the entity.
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Link{
	int lnk[], max, begin,end;
 	Link( int mm){            
		max=mm-1; lnk=new int[mm]; begin=0; end=0;
  	}
  	void addlink(int v){
  			if(end<=max)
				lnk[end++]=v;
			else
				System.out.println("OUT OF SIZE  ");
  	}
  	int dellink(){
  			if(begin==max){
 				System.out.println("EMPTY..");
				return -99;
			}
 			else
				return lnk[begin++];
  	}
  	void display(){
 		for(int i=begin;i<=end;i++)
			System.out.print(" "+lnk[i]);
	}
 	public static void main(String args[])throws Exception{
 		Link ob; int x; int ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 		System.out.print("\nSize of the link:"); x=Integer.parseInt(br.readLine());
		ob=new Link(x);
 		while(true){
 			System.out.print("\n1 for add, 2 for deletion and 3 for quit:");
			ch=Integer.parseInt(br.readLine());
			if(ch==1){
				System.out.print("\nValue:");
				x=Integer.parseInt(br.readLine()); ob.addlink(x);
				System.out.print("\nNow the list:"); ob.display();
			}
			else if(ch==2){
				x=ob.dellink(); System.out.print("\nDeleted element:"+x);
				System.out.print("\nNow the list:"); ob.display();
			}
			else if(ch==3)
				break;
		}
	}
}
// ------------------------------------{END OF THE CODE}-----------------------------------------