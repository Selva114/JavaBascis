package PckB;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Starts the process of scanning console/terminal
		System.out.println("Enter value of a : ");
		double a = sc.nextDouble();
		System.out.println("Enter value of b : ");
		double b = sc.nextDouble();
		double c = a + b;
		System.out.println("Addition of a& b is: " + c);
		sc.close();//Stops the process of scanning console/terminal
	}

}
