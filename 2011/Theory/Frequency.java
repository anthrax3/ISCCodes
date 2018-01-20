/* Filename	: Frequency.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2011
 * Question : 8
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *  Input a sentence from the user and count the number of times, the words “an” and “and” are 
 * 	present in the sentence. Design a class Frequency using the description given below:
 *		Class name						:	Frequency
 *		Data Members/instance variables	:
 *			text						: 	stores the sentence 
 *			countand					: 	to store the frequency of the word and.
 *			countan						: 	to store the frequency of the word an.
 *			len							: 	stores the length of the string.
 *		Member functions				:
 *			Frequency()					: 	constructor to initialize the data variables.
 *			void accept(String n)		: 	to assign n to text where the value of the 
 *											parameter should be in lowercase.
 *			void checkandfreq()			: 	to count the frequency of and.
 *			void checkanfreq()			: 	to count the frequency of an.
 *			void display()				: 	to display the frequency of “an” and “and” with 
 *											suitable messages.
 *-----------------------------------------------------------------------------------------------
 */
class Frequency{
	String text;
 	int countand, countan, len;
  	Frequency(){
 		text="";
 		countand=0;
 		countan=0;
 	}
 	void accept(String n){
  		text=n;
  		len=text.length()-1;
 	}
 	public void checkandfreq(){
  		int i;
  		String s1="";
  		s1=text;
		for(i=0;i<=len;i++){
   			if(text.charAt(i)!=' ')
   				s1=s1+text.charAt(i);
   			else{
    			if(s1.equals("and"))
    				countand++;
    			s1="";
   			}
   		}
    	if(s1.equals("and"))
    		countand++;
 	}
 	public void checkanfreq(){
  		int i;
  		String s1="";
  		s1=text;
		for(i=0;i<=len;i++){
   			if(text.charAt(i)!=' ')
   				s1=s1+text.charAt(i);
   			else{
    			if(s1.equals("an"))
    				countan++;
    			s1="";
   			}
   		}
    	if(s1.equals("an"))
    		countan++;
 	}
 	public void display(){
 		System.out.println("Sentence = "+text);
 		System.out.println("Word 'and' in the sentence:"+countand);
 		System.out.println("Word 'an' in the sentence:"+countan);
 	}
	public static void main(String args[]){
 		Frequency one=new Frequency();
 		one.accept("this is an example of an and and");
 		one.checkandfreq();
  		one.checkanfreq();
	  	one.display();
	}
}
