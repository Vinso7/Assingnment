import java.util.ArrayList;
import java.util.List;

enum OStatus{
	Accepted,Completed,intrans;
}
class order {
	int oid;
	int Oprice;
	OStatus status;
	public order(int oid, int oprice, OStatus status) {
		this.oid = oid;
		this.Oprice = oprice;
		this.status = status;
	}
	public int getOid() {
		return oid;
	}
	public int getOprice() {
		return Oprice;
	}
	public OStatus getOStatus() {
		return status;
	}	
}

public class question2 {

	public static void main(String[] args) {

		List<order> ord = new ArrayList<order>();
		ord.add(new order(101,4500,OStatus.Accepted));
		ord.add(new order(102,22000,OStatus.Accepted));
		ord.add(new order(103,8000,OStatus.Completed));
		ord.add(new order(104,18000,OStatus.Completed));
		ord.add(new order(105,11000,OStatus.intrans));
		
		
		
		
		ord.stream()
		.forEach(o -> {
			if(o.getOprice()>10000  && (o.getOStatus().equals(OStatus.Accepted)
					|| o.getOStatus().equals(OStatus.Completed))) {
				System.out.println("order ID: "+o.getOid()); }
		});
	}
}
