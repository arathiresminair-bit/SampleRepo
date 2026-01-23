package superkeyword;

public class SuperMethodChild extends SuperMethodParent
{
	public void print()
	{
		System.out.println("Evening");
		super.print();
	}
	public static void main(String[] args) 
	{
		SuperMethodChild obj=new SuperMethodChild();
		obj.print();
	}

}
