package basics;

public class MethodsDemojava {
	
	//Method should be created outside the main method but inside the class
	//There are 4 types of methods
	//1.Basic Methods
	//2.Method with parameters
	//3.Method without VOID
	//4.Static methods
	
	
	
	//BASIC METHOD
	public void add()//declare method
	{
		//body of method
		int a=4,b=5;
		System.out.println("Addition "+(a+b));
	}
	
	//METHOD WITH PARAMETERS
	public void sub(int a,int b,int c,int d)
	{
		System.out.println("Sub:- "+(a-b-c-d));
	}
	
	//METHOD WITHOUT VOID
	public int mul(int c,int d)
	{
		return c*d;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemojava m=new MethodsDemojava();
		//call             execute
		m.add();
		m.sub(45,5,3,2);
		System.out.println("Mul:- "+m.mul(12,5));
	}

}
