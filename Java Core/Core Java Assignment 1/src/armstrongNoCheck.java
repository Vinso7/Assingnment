import java.lang.Math;  
public class armstrongNoCheck 
{
	static boolean isArmstrong(int n)   
	{   
		int temp, digits=0, last=0, sum=0;   
		temp=n;     
		while(temp>0)    
		{   
			temp = temp/10;   
			digits++;   
		}   
		temp = n;   
		while(temp>0)   
		{       
			last = temp % 10;   
			sum +=  (Math.pow(last, digits));      
			temp = temp/10;   
		}    
		if(n==sum)     
			return true;       
		else return false;   
	}   
	public static void main(String args[])     
	{     
		System.out.println("Armstrong Numbers Between 100 to 999 are: ");  
		for(int i=100; i<=999; i++)   
			if(isArmstrong(i))   
				System.out.print(i+ " ");  
	}   
}  