package Tandemloop;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	Calculator calculator= new Calculator();
	System.out.println("Enter the first no a =" );
	double a=scanner.nextDouble();
	
	System.out.println("Enter the second no b =" );
	double b=scanner.nextDouble();
	
	System.out.println("Enter the operation = ");
	String operation= scanner.next();
	
	try {
		double result = calculator.calculate(a, b, operation);
		
		System.out.println("the result is : "+ result);
	} catch (Exception e) {
		System.out.println("Error : "+ e.getMessage());
	}
	
	finally {
		scanner.close();
	}
}

public double addition(double a,double b) {
	return a+b;
	
}

public double subraction(double a,double b) {
	return a-b;
	
}

public double multiply(double a,double b) {
	return a*b;
	
}
public double divide(double a,double b) {
	if (b==0) {
		System.out.println("Division by Zero is not Allowed");
	}
	return a/b;
	
}
public double calculate(double a, double b,String operation) {
	
	switch (operation.toLowerCase()) {
	case "addition":
		return addition(a,b);
	case "subraction":
		return subraction(a,b);
		
	case "multiplication":
		return multiply(a,b);
		
	case "division":
		return divide(a,b);
	default:
		System.out.println("invalid operation");
	}
	return b;
	
}
}
