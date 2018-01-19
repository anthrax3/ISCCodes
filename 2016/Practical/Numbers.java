/* Filename	: Numbers.java
 * Coder	: Ayushanand Singh
 * Paper    : Practical
 * Year		: 2016
 * Question : 1
 */
/*
 * ##############################################################################################
 * ======================================[DESCRIPTION]===========================================
 * ##############################################################################################
 * A Circular Prime is a prime number that remains prime under cyclic shifts of its digits. 
 * When the leftmost digit is removed and replaced at the end of the remaining string of digits, 
 * the generated number is still prime. The process is repeated until the original number is 
 * reached again.
 * A number is said to be prime if it has only two factors 1 and itself.
 * For Example -
 * 			131 is prime.
 *		    311 is prime.
 *			113 is prime.
 *			Hence, 131 is a circular prime.
 *-----------------------------------------------------------------------------------------------
 */ 
import java.util.*;
class Numbers{
    boolean isPrime(int n){
        int c = 0;
        for(int i = 1; i<=n; i++){
            if(n%i == 0)
                c++;
        }
        if(c == 2)
            return true;
        else
            return false;
    }     
    int circulate(int n){
        String s = Integer.toString(n);
        String p = s.substring(1)+s.charAt(0);
        int a = Integer.parseInt(p);
        return a;
    }
    void isCircularPrime(int n){
        int f = 0,a = n;
        do{
            System.out.println(a);
            if(isPrime(a)==false){
                f = 1;
                break;
            }
            a = circulate(a);
        }while(a!=n);    
        if(f==1)
            System.out.println(n+" IS NOT A CIRCULAR PRIME");
        else
            System.out.println(n+" IS A CIRCULAR PRIME");
    }
    public static void main(String args[]){
        CircularPrimes ob = new CircularPrimes();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        ob.isCircularPrime(n);
    }
}
