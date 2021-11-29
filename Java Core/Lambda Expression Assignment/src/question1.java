interface operations{
	int op(int x, int y);
}
public class question1 {

	public static void main(String[] args) {

		operations ad = (a,b)->(a+b);
		operations sb = (a,b) ->(a-b);
		operations ml = (a,b) ->(a*b);
		//operations dv = (a,b) ->(a/b);
		
		System.out.println("[100 and 50]\nAddition:"+ad.op(100,50)+"\nSubtraction:"+sb.op(100, 50)
		+"\nMultiplication:"+ml.op(100, 50));
	

	}

}
