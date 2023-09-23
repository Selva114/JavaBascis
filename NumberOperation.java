package PckB;

import java.util.Scanner;

public class NumberOperation {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); //Starts the process of scanning console/terminal
		System.out.println("Enter value of a : ");
		double a = sc.nextDouble();
		
		
		System.out.println("Enter value of b : ");
		double b = sc.nextDouble();
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for Subtraction : ");
		System.out.println("Enter 3 for Multiplication: ");
		System.out.println("Enter 4 for Modulo: ");
		System.out.println("Enter your choice : ");
		int x = sc.nextInt();
		
	
		double c=0;
		switch(x)
		{
		case 1:
			c=a+b;
			System.out.println(c);
			break;
		case 2:
			c=a-b;
			System.out.println(c);
			break;
		case 3:
			c=a*b;
			System.out.println(c);
			break;
		case 4:
			c=a%b;
			System.out.println(c);
			break;
		}
	}

}
