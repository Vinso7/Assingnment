import java.util.Scanner;
public class Search_Element
{
    public static void main(String[] args) 
    {
        int n, x, flag = 0;
        int a[] = {73,54,76,35,93,47,89,34,54,43,59,23,64,55,33};
        System.out.println("Given Array ");
        for(int j=0;j<a.length;j++)
        	System.out.print(a[j]+" ");  
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the element you want to find:");
        x = s.nextInt();
        int k;
        for(k = 0; k <a.length; k++)
        {
            if(a[k] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+ k);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
