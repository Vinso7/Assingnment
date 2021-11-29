import java.util.ArrayList;
import java.util.Comparator;

// Fruit Class......
class fruit {
	String name;
	int cal;
	int price;
	String color;
	public fruit(String name, int cal, int price, String color) {
		this.name = name;
		this.cal = cal;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public int getCal() {
		return cal;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
}
// News Class......
class news {
	
	int newsid;
	String postedbyuser;
	String commentbyuser;
	String comment;
	public news(int newsid, String postedbyuser, String commentbyuser, String comment) {
		this.newsid = newsid;
		this.postedbyuser = postedbyuser;
		this.commentbyuser = commentbyuser;
		this.comment = comment;
	}
	public int getNewsid() {
		return newsid;
	}
	public String getPostedbyuser() {
		return postedbyuser;
	}
	public String getCommentbyuser() {
		return commentbyuser;
	}
	public String getComment() {
		return comment;
	}	
}
//Trader Class......
class Trader {
	String name;
	String city;
	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
}
//Transaction Class......
class transaction {
	Trader trader;
	int year;
	int value;
	public transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public int getYear() {
		return year;
	}
	public int getValue() {
		return value;
	}
}
// Main Class.......
public class MainClass {
	public static void main(String[] args) {
		ArrayList<fruit> fr = new ArrayList<fruit>();
		fr.add(new fruit("apple",77,250,"Red"));
		fr.add(new fruit("mango",120,50,"yellow"));
		fr.add(new fruit("pear",85,200,"Red"));
		fr.add(new fruit("grapes",144,100,"green"));
		
		fr.stream()
/*		.filter(f -> f.getCal()<100)			// filtering calories
		.sorted(Comparator.comparingInt(fruit::getCal).reversed())   //sorting in Reverse calories
        .collect(Collectors.toList())*/
		.filter(f-> f.getColor().contentEquals("Red"))		//Filtering Red Color
		.sorted(Comparator.comparingInt(fruit::getPrice))	//Sorting price Ascending
		.forEach(f -> System.out.println(f.getName()));
		
		
		ArrayList<news> nw = new ArrayList<news>();
		nw.add(new news(101,"abc","sultan","out of budget"));
		nw.add(new news(102,"def","sultan","i dont agree"));
		nw.add(new news(103,"xyz","adi","budget is less"));
		nw.add(new news(102,"def","salman","great content"));
		System.out.println("<-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=->");
		
		//ArrayList<Trader> td = new ArrayList<Trader>();
		Trader td1 =new Trader("abc","pune");
		Trader td2 =new Trader("ghi","indore");
		Trader td3 =new Trader("jkl","pune");
		Trader td4 =new Trader("def","delhi");
		ArrayList<Trader> td = new ArrayList<Trader>();
		td.add(td1);
		td.add(td2);
		td.add(td3);
		td.add(td4);
		System.out.println("<-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=->");
		
		ArrayList<transaction> tr = new ArrayList<transaction>();
		tr.add(new transaction(td1, 2008,5100));
		tr.add(new transaction(td2,2011,48000));
		tr.add(new transaction(td3,2011,33000));
		tr.add(new transaction(td4,2014,65800));
		System.out.println("<-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=->");
		
		tr.stream()
		.filter(o-> o.getYear()==2011)
		.sorted(Comparator.comparing(transaction::getValue))
		.forEach(o-> System.out.println(o.getYear()+" "+o.getValue()));
		}	
}