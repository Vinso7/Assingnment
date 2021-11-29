import java.util.Scanner;
public class User_Authentication 
{
    public static void main(String args[])
    {
    	int cnt=0;
        String username, password;
        Scanner s = new Scanner(System.in);
        while(cnt<3)
        {
        	System.out.print("Enter username:");//username:user
        	username = s.nextLine();
        	System.out.print("Enter password:");//password:user
        	password = s.nextLine();
           	if(username.equals("sultan") && password.equals("pass"))
        	{
        		System.out.println("WELCOME");
        		break;
        	}
        	else
        	{
        		++cnt;
        		System.out.println("Invalid Username or Password");
        	}
        }
        if(cnt>=3)
        {
        	System.out.println("Contact Admin");
        }
        
    }
}