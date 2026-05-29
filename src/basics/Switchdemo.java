package basics;

public class Switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a=3;
          int b=4;
          int c=1;
		
		switch(c)
		{
		case 1:
			System.out.println("Addition"+(a+b));
		case 2:
			System.out.println("Subtraction"+(a-b));
		case 3:
			System.out.println("Division"+(a/b));
		case 4:
			System.out.println("Multiply"+(a*b));
			 
			default:
				System.out.println("Invalid choice");
				break;
		}
	}



	}


