
class employee
{
	int basesal=15000;
	public void salary()
	{
		
		System.out.println("baseSal: "+basesal);
	}
}
class manager extends employee
{
		public void salary()
		{
			int ins=4500;
			int sal= ins+basesal;
			System.out.println("Manager sal: "+sal);
		}
}
class labour extends employee
	{
		public void salary()
		{
			int ins=1500;
			int sal= ins+basesal;
			System.out.println("Labour Sal: "+sal);
		}
}
	
public class question2
{		
	public static void main(String[] args)
	{
		employee ob =new employee();
		employee ob1 = new manager();
		employee ob2 = new labour();
		ob.salary();
		ob1.salary();
		ob2.salary();	
		
	}

}
