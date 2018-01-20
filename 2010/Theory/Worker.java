/* Filename	: Wages.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2010
 * Question : 11
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A super class Worker has been defined to store the details of a worker. 
 * 	Define a sub class Wages to compute the monthly wages for the worker. 
 *	The details of both the classes are given below:
 *		Class name						:	Worker
 *		Data members/instance variables	:
 *			Name						:	to store the name of the worker
 *			Basic						:	to store the basic pay in decimal
 *		Member functions				:
 *			Worker(….)					:	parameterized constructor to assign values to the 
 *											instance variables
 *			void display()				:	display worker details
 *		
 *		Class name						:	Wages
 *		Data members/instance variables	:
 *			hrs							:	stores the hours worked
 *			rate						:	stores rate per hour
 *			wage						:	stores the overall wage of the worker
 *		Member functions				:
 *			Wages(….)					:	parameterized constructor to assign values to the 
 *											instance variables of both classes
 *			double overtime( )			:	calculates and returns the overtime amount as
 *											(hours * rate )
 *			void display()				:	calculates the wage using the formula 
 *											wage=overtime amount +basic pay and 
 *											displays it along with other details
 *-----------------------------------------------------------------------------------------------
 */
class Worker{
 	String name;
 	double basic;
 	Worker(String n, double d){
 		name=n;
 		basic=d;
 	}  
  	public void display(){
     System.out.println("Name="+name + "\nBasic pay="+basic);
 	}
}

class Wages extends Worker{
	int hrs;
   	double rate, wage;
  	Wages (String n,double d,int h,double r){
   		super(n,d);
   		hrs=h;
   		rate=r;
   	}
   	private double overtime(){
    	return hrs*rate;
    }
  	public void display(){
 		wage=basic+overtime();
 		super.display();
 		System.out.println("Wage="+wage);
 	}
	public static void main(String args[]) throws Exception{
 		Wages one=new Wages("Sraban",1200.50,2,100);
 		one.display();
	}
}


