public class bankaccount {
	public void withdraw(int withdrawAmount)  throws IllegalAccessException{
		double balance = 18000;
		try {
			balance-=withdrawAmount;
			if(balance<0) {
				throw new IllegalAccessException();
			}
		}catch(IllegalAccessException e) {
			throw new IllegalAccessException();
		}
	}
}
	 