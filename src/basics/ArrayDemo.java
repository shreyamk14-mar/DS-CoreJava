package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arrays is collection of multiple elements
		
		
		Scanner sc=new Scanner(System.in);
		
		//Enter 12 numbers
		System.out.println("Enter any lenght you want");
		int g=sc.nextInt();	//10	
		
		int c[]=new int[g];//10
		//                 enter any     10 numbers
		System.out.println("Enter any "+c.length+" number"); 
		
		//     1<10
		for(int i=0;i<c.length;i++)
		{//  c[1]=12
			c[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(c));
		
		
		
		
		
		int a[]= {4,5,6,7,8,10,23,25,27,59,33,78,11};
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Position "+i+" Value "+a[i]);
		}
		//Arrays is predefined class from java.util package
		//toString is predefined method of Arrays
		//it is used to print all the values together
		//it is also used to prevent garbage values
		//--OR--
		System.out.println(Arrays.toString(a));
		
		
		int b[]= {10,20,30,40};
		int n[]=Arrays.copyOf(b,4);
		
		System.out.println("Array data of b variable:- "+Arrays.toString(b));
		System.out.println("Array data of n variable:- "+Arrays.toString(n));
	
		//copy0f is predefined method of Arrays
		//it is used to copy the data of existing array to the newest array variable
		
		
	}

}
