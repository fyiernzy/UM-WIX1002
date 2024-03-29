package Lab8;

import java.util.Scanner;

public class L8Q4 {
	public static void main(String[] args) {
		new Fraction(200, 625).showSimplestFraction();
	}
}

class Fraction {
	int numerator;
	int denominator;
	
	Fraction() { }

	Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numerator (integer): "); this.numerator = sc.nextInt();
		System.out.print("Enter the denominator (integer): "); this.denominator = sc.nextInt();
		sc.close();
	}
	
	public void setNumerator(int n) {
		this.numerator = n;
	}
	
	public void setDenominator(int n) {
		this.denominator = n;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public int findGCD(int x, int y) {	
		return y == 0 ? x : findGCD(y, x % y);
	}
	
	public int getGCD() {
		return findGCD(this.numerator, this.denominator);
	}
	
	public String getSimplestFraction() {
		int gcd = getGCD();
		return (numerator / gcd) + "/" + (denominator / gcd);
	}
	
	public void showSimplestFraction() {
		System.out.println("Simplest Fraction: " + getSimplestFraction());
	}
}