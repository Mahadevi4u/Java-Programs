import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String c="y";
		do {
			
		System.out.println("Enter 1. Addition 2. Subtraction 3. Multiplication 4.Division ");
		System.out.println("What you want to perform?");
		int ch=sc.nextInt();
		System.out.println("Enter the numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		switch(ch) {
		
		case 1:System.out.println("Addition of "+a+" and "+b+" is"+(a+b));
		break;
		case 2:System.out.println("subtraction of "+a+" and "+b+" is"+(a-b));
		break;
		case 3:System.out.println("Multiplication of "+a+" and "+b+" is"+(a*b));
		break;
		case 4:System.out.println("division of "+a+" and "+b+" is"+(a/b));
		break;
		default: System.out.println("Wrong entry");
		
		}
		System.out.println("Do you want to continue if yes type 'y' else 'n'");
		 c=sc.next();
		}while(c.equals("y"));
		
		

	}

}
