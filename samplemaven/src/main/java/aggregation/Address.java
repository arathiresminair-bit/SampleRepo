package aggregation;

public class Address 
{
	String address; Student var;
public Address(String address, Student var)
{
	this.address=address;
	this.var=var;
	
}
public void display()
{
	System.out.println(var.name);
	System.out.println(var.rn);
	System.out.println(address);
}
	public static void main(String[] args) 
	{
	Student obj=new Student("Arathi",20);
	Address obj1=new Address("Hidden Creek", obj);
	obj1.display();

	}

}
