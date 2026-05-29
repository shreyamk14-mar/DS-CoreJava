package basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//call          execute
		//Scanner is predefined class from java.util package
		
		System.out.println("Enter any two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//nextInt()is predefined function of Scanner class
		//it will allow only integer value to store inside the variable
		
		System.out.println(" Addition "+(a+b));
		
		//double is datatype use for storing decimal number
		//12.3333334
		System.out.println("Enter any two decimal numbers");
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		System.out.println(" Sub "+(c-d));
		
		//float is datatype use for storing decimal number
		//12.344
		System.out.println("Enter any two float numbers:-");
		float g=sc.nextFloat();
		float h=sc.nextFloat();
		
		System.out.println(" Multiply "+(g*h));
		
	}

}
