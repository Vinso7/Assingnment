import java.util.Scanner;
public class IncomeTax {

	public static void main(String[] args)
	{
		float inc,tax;
		System.out.print("How much is your Income Dear :");
		Scanner scanner = new Scanner(System.in);
		inc=scanner.nextFloat();
		scanner.close();
		if(inc>=0 && inc<=180000)
		{
			System.out.println("No need to pay Tax....ThankYou");
		}
		else if(inc>=180001 && inc<=300000)
		{
			tax= (10*inc)/100;
			System.out.println("You need to pay 10% Tax i:e "+tax+" ThankYou");
		}
		else if(inc>=300001 && inc<=500000)
		{
			tax= (20*inc)/100;
			System.out.println("You need to pay 20% Tax i:e "+tax+" ThankYou");
		}
		else if(inc>=500001 && inc<=1000000)
		{
			tax= (30*inc)/100;
			System.out.println("You need to pay 30% Tax i:e "+tax+" ThankYou");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
	 
}
