package basics;

public class Assign02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Capgemini";
		String b="Capgemini";
		
		if(a==b)
		{
			System.out.println("Print both are equals");
		}
		else if(a.equals(b))
		{
			 System.out.println("Print both are equal");  
		}
		else if(a.equalsIgnoreCase(b))
		{
			System.out.println("Print both are equals ignoring case");
		}
		
	}

} 
