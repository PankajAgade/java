/*Write a program to find Compound Interest.
Here P is principal amount. R is the annual interest rate. t is the time.
n is the number of times that interest is compounded per unit t, for example if interest is
compounded monthly and t is in years then the value of n would be 12. If interest is compounded
quarterly and t is in years then the value of n would be 4.
e.g P = 2000.
R = 8/100 = 0.08 (decimal).
n = 12.
t = 5.
formula  CI= P[1+R/n] [12*t] - P
Compound Interest = 2000 (1 + 0.08 / 12) (12 * 5) – 2000 = $979.69
double amount = p * Math.pow(1 + (r / n), n * t) ;
*/
public class Compound_Interest {
	public static void main(String[] args) {
		float p=2000;
	double r=0.08;
	double n=12;
	double t=5;
	double ci=(p*(Math.pow(1+(r/n),n*t)))-p;
	//double a = p*(1+(r/n))*(n*t);
	//double ci = a-p;
	System.out.println("Compound Interest is $"+String.format("%.2f",ci));
	
	}

}
