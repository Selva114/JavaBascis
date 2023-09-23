package PckB;

import java.util.Scanner;

public class CharacterOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Starts the process of scanning console/terminal
		System.out.println("Enter value of a : ");
		double a = sc.nextDouble();
		System.out.println("Enter value of b : ");
		double b = sc.nextDouble();
		System.out.println("Enter any arithmatic operator : ");
		char x=sc.next().charAt(0);
		double c=0;
		switch(x)
		{
		case '+':
		c=a+b;
		System.out.println(c);
		break;
		case '-':
		c=a-b;
		System.out.println(c);
		break;
		case '*':
		c=a*b;
		System.out.println(c);
		break;
		case '/':
		c=a/b;
		System.out.println(c);
		break;
		
		case '%':
		c=a%b;
		System.out.println(c);
		break;
		


		}		
		
	}

}
