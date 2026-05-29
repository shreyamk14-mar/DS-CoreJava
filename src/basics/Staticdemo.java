package basics;

import java.util.Scanner;

public class Staticdemo {
	
	//static should not be given as class name
	//static is non access modifier
	//static is not an object member
	//static is class member
	
	static Scanner sc=new Scanner(System.in);
	
	public static void Div()
	{
		int c=4,d=5;
		System.out.println("Div "+(c/d));
	}
	
	public static void PinLogin()
	{
		System.out.println("Enter your pinnumber");
		String p=sc.next();
		if(p.equals("12345"))
		{
			System.out.println("Pin is valid");
		}
		else
		{
			System.out.println("Pin is invalid");
			PinLogin();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Div();
		PinLogin();
	}

}
