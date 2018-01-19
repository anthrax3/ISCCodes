/* Filename	: Date.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2009
 * Question : 1
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * 	Design a program to accept a day number (between 1 and 366), year (in 4 digits) from the
 * 	user to generate and display the corresponding date. Also accept 'N' (1<=N<=100) from the 
 * 	user to compute and display the future date corresponding to 'N' days after the generated
 * 	date. Display error message if the value of the day number, year and N are not within the
 * 	limit or not according to the condition specified.
 *		Examples --
 *		
 *			INPUT :   DAY NUMBER : 233    YEAR : 2008     DATE AFTER(N) : 17
 *			OUTPUT: 20TH AUGUST 2008    DATE AFTER 17 DAYS : 6TH SEPTEMBER 2008
 *
 *			INPUT :    DAY NUMBER : 360    YEAR : 2008        DATE AFTER(N) : 45
 *			OUTPUT:    25TH DECEMBER 2008  DATE AFTER 45 DAYS : 8TH FEBRUARY 2009
 *-----------------------------------------------------------------------------------------------
 */
import java.util.*;
class Date{
	public static void main(String args[])throws InputMismatchException{
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER DAY NUMER(>=1 AND <=366) : ");
		int day_number=scan.nextInt();
		System.out.println("ENTER YEAR(4 DIGIT) : ");
		int year=scan.nextInt();
		System.out.println("ENTER DATE AFTER(N)(>=1 AND <=100) : ");
		int n=scan.nextInt();
		if(day_number<1 || day_number>366)
			System.out.println("INVALID DAY NUMBER.");
		else if(year<1000 || year >9999)
			System.out.println("INVALID YEAR");
		else if(n<1 || n>100)
			System.out.println("INVALID DATE AFTER VALUE.");
		else{
			//INITIALIZE MONTH NAMES AND NUMBER OF DAYS IN EACH MONTH
	    	String month_names[]={"JANUARY", "FEBRUARY","MARCH",
        						  "APRIL","MAY","JUNE","JULY",
        						  "AUGUST","SEPTEMBER","OCTOBER",
        						  "NOVERMBER","DECEMBER"};
    		int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    		int i, day, month,day_after;
	    	String suffix;
		    //IF IT IS A LEAP YEAR FEBRURAY SHOULD HAVE 29 DAYS
    		if(year%400==0 || (year%100!=0 && year%4==0))
        		month_days[1]=29;
        	i=0;
   			//FIND THE DATE CORRESPONDING TO THE DAY NUMBER
        	day=day_number;
        	while(day>month_days[i]){
            	day-=month_days[i];
            	i++;
        	}
        	month=i;
        	//ADD SUFFIX AS PER THE DAY
        	if(day%10==1 && day/10!=1)
            	suffix="ST";
        	else if(day%10==2 && day/10!=1)
            	suffix="ND";
        	else if(day%10==3 && day/10!=1)
            	suffix="RD";
        	else
            	suffix="TH";
        	System.out.println("OUTPUT:");
        	//FIRST PART OF THE OUTPUT
        	System.out.println(day+suffix+" "+
        	month_names[month]+" "+year);
        	//TO CALCULATE DATE AFTER N DAYS
        	day_after=day_number+n;
        	i=0;
        	while(day_after>month_days[i]){
            	day_after-=month_days[i];
            	i++;
            	if(i==12){
            		i=0;
            		year++;
            		if(year%400==0 || (year%100!=0 && year%4==0))
                		month_days[1]=29;
            	}
        	}
        	day=day_after;
        	month=i;
        	//ADD SUFFIX AS PER THE DAY
        	if(day%10==1 && day/10!=1)
            	suffix="ST";
        	else if(day%10==2 && day/10!=1)
            	suffix="ND";
        	else if(day%10==3 && day/10!=1)
            	suffix="RD";
        	else
            	suffix="TH";
       		//SECOND PART OF THE OUTPUT
        	System.out.println(day+suffix+" "+
        	month_names[month]+" "+year);
		}
	}
}  
