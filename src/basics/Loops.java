package basics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Loops are of 3 types:-
		//1.WHILE LOOP
		//2.DO WHILE LOOP
		//3.FOR LOOP
		
		System.out.println("---WHILE LOOP---");
		
		int a=1;
		
		//  11<=10
		while(a<=10)
		{
			System.out.println(a);//10
			a++; //10+1=11
		}
		
		System.out.println("--DO WHILE LOOP---");
		
		int b=1;
		
		do
		{
			System.out.println(b); //1
			b++;
		}
		while(b<=10); 
		
		System.out.println("--FOR LOOP--");
		//           3<=10
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("--REVERSE PRINT--");
		//         8>=1  //9-1=8
		for(int i=10; i>=1;i--)
		{
			System.out.println(i);//8
		}
	}


