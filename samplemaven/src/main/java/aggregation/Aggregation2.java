package aggregation;

public class Aggregation2 
{
	String city; String state;
	Aggregation1 var;
 public Aggregation2(String city, String state, Aggregation1 var)
 {
	 this.city=city;
	 this.state=state;
	 this.var=var;
 }
 public void display()
 {
	 System.out.println(var.name);
	 System.out.println(var.rn);
	 System.out.println(var.add);
	 System.out.println(city);
	 System.out.println(state);
 }
	public static void main(String[] args) 
	{

		Aggregation1 obj=new Aggregation1("Arathi", 20, "Hidden Creek");
		Aggregation2 obj1=new Aggregation2("Trivandrum", "Kerala",obj);
		obj1.display();
	}

}
