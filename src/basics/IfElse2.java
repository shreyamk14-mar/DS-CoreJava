package basics;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//If Else
		
		//Even Odd number
		int a=3;
		// % is modulus
		//modulus means it consider remainder as a result
		
		// 1==0
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
