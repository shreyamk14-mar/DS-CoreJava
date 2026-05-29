package basics;

import java.util.Scanner;

public class Scannersc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Number is even or odd");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a%2==0)
		{ 
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		int c=80,d=45;
		
		if(c<d)
		{
			System.out.println(d+" is greater than "+c);
		}
		else if(c>d)
		{
			System.out.println(c+" is greater than "+d);
		}
		else if(c==d)
		{
			System.out.println(" Both are equals ");
		}
	}



		
		
		
		
		
		
		
	}

}
