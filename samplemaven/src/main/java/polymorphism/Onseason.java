package polymorphism;

public class Onseason extends Offseason
{
	public void discount(double discount)
	{
		super.discount(100.0);
		discount= ((double) discount*0.60);
		System.out.println(discount);
	}
	public static void main(String[] args) 
	{
		Onseason obj=new Onseason();
		obj.discount(100.0);

	}

}
