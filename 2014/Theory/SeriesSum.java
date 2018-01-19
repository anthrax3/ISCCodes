/* Filename	: SeriesSum.java
 * Coder	: Ayushanand Singh
 * Paper    : Theory
 * Year		: 2014
 * Question : 9
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	A class SeriesSum is designed to calculate the sum of the following series:
 * 		((x^2)/1!)+((x^4)/3!)+((x^6)/5!)+.....+((x^n)/(n-1)!)
 *	Some of the members of the class are given below:
 *		Class name							: 	SeriesSum
 * 		Data members/instance variables		:
 *			x 								: 	to store an integer number
 *			n 								: 	to store number of terms
 *			sum 							: 	double variable to store the sum of the series
 *		Member functions					:
 *			SeriesSum(int xx, int nn)		: 	constructor to assign x=xx and n=nn		
 *			double findfact(int m)			: 	to return the factorial of m using recursion
 *			double findpower(int x, int y) 	: 	to return x raised to the power of y using
 *												recursive technique.
 *			void calculate( ) 				: 	to calculate the sum of the series by invoking
 *												the recursive functions respectively
 *			void display( ) 				: 	to display the sum of the series
 *-----------------------------------------------------------------------------------------------
 */ 
class SeriesSum{
	int x,n;
	double sum;
	SeriesSum(int xx,int nn){ 
		x=xx;
		n=nn;
		sum=0.0;
	}
	double findfact(int a){ 
		return (a<2)? 1:a*findfact(a-1);
	}
	double findpower(int a, int b){ 
		return (b==0)? 1:a*findpower(a,b-1);
	}
	void calculate(){ 
		for(int i=2;i<=n;i+=2)
			sum += findpower(x,i)/findfact(i-1);
	}
	void display(){ 
		System.out.println("sum="+ sum);
	}
	static void main(){ 
		SeriesSum obj = new SeriesSum(3,8);
		obj.calculate();
		obj.display();
	}
}
