/*						                       -----------------------------------------
 * 						                      |	Filename	         : Date.java			  				|
 * 						                      |	Coder		           : Ayushanand Singh		| 
 * 						                      |	Paper    	        : Practical				     |
 * 						                      |	Year		            : 2007					         |
 * 						                      |	Question 	        : 1   	 				        |
 * 					                      	-----------------------------------------
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 *	Write a program to accept a date in the string format dd/mm/yyyy and accept the name of 
 *	the day on 1st of January of the corresponding year. Find the day for the given date. 
 *  For Example:
 *		INPUT   :  Date: 5/7/2001  Day on 1st January : MONDAY
 *		OUTPUT  :  Day on 5/7/2001 : THURSDAY
 */
// ------------------------------------{SHOW ME THE CODE}----------------------------------------
import java.io.*;
class Date{
			int arr[]={31,28,31,30,31,30,31,31,30,31,30,31}; BufferedReader br; String str1,day,day1;
			int x,i,dayno,mon,yr,leap1;
			public static void main(String args[])throws IOException{
					Date ob=new Date(); ob.take(); ob.show();
			}
			Date(){
					br=new BufferedReader(new InputStreamReader(System.in));
			}
			public void take()throws IOException{
					System.out.println("Enter the date ( in dd/mm/yyyy) format:");
					day=br.readLine().trim();
					day1=day; i=day.indexOf("/");
					dayno=Integer.parseInt(day.substring(0,i)); day=day.substring(i+1);
					i=day.indexOf("/"); mon=Integer.parseInt(day.substring(0,i));
					day=day.substring(i+1); yr=Integer.parseInt(day);
					leap1=0;
					if(mon>2)
						leap1=leap(yr);
					System.out.println("Enter the Day on 1st January in this year:");
					str1=br.readLine().trim();
			}	
			int leap(int p){
					if(p%100==0 && p%400==0) return 1;
					else if(p%100!=0 && p%4==0) return 1;
					else return 0;
			}	
			void show(){
					if (str1.equalsIgnoreCase("Sunday")) x=1;
						else if (str1.equalsIgnoreCase("Monday")) x=2;
					else if (str1.equalsIgnoreCase("Tuesday")) x=3;
					else if (str1.equalsIgnoreCase("Wednesday")) x=4;
					else if (str1.equalsIgnoreCase("Thursday")) x=5;
					else if (str1.equalsIgnoreCase("Friday")) x=6;
					else if (str1.equalsIgnoreCase("Saturday")) x=7;
					for(i=0;i< mon-1;i++)
						dayno=dayno+arr[i];
					dayno=dayno+leap1;
					for(i=0;i< dayno-1;i++){
							x++; if(x==8) x=1;
					}
					System.out.println(day1+ ":");
					switch(x){
							case 1: System.out.println("Sunday"); break;
							case 2: System.out.println("Monday"); break;
							case 3: System.out.println("Tuesday"); break;
			    case 4: System.out.println("Wednesday"); break;
							case 5: System.out.println("Thursday"); break;
							case 6: System.out.println("Friday"); break;
							case 7: System.out.println("Saturday"); break;
					}
			}
 }
// ------------------------------------{END OF THE CODE}-----------------------------------------