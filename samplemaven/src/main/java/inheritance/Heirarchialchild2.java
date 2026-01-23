package inheritance;

public class Heirarchialchild2 extends Heirarchialparent
{
	  public void print()
	  {
		  System.out.print("Hello");
	  }
	  
	public static void main(String[] args)
	{
		Heirarchialchild2 obj1= new Heirarchialchild2();
		obj1.display();
		obj1.print();

	}

}
