import java.util.Scanner;

public class marksofstd
{
    public static void main(String args[])
    {
    	
        int marks[] = new int[3];
        int i;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<3; i++)
        { 
           System.out.print("Enter Marks of Subject "+(i+1)+":");
           marks[i] = scanner.nextInt();
        }
        scanner.close();
        if(marks[0]>100 || marks[1]>100 || marks[2]>100)
        {
            System.out.println("Invalid Marks");
        }
        else if(marks[0]>=60 && marks[1]>=60 && marks[2]>=60)
        {
            System.out.println("Pass");
        }
        else if(marks[1]>=60 && marks[2]>=60)
        {
           System.out.print("Promoted");
        } 
        else
        {
            System.out.print("Failed");
        }
    }
}