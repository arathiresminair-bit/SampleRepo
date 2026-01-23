package inheritance;

public class Heirarchialchild1 extends Heirarchialparent
{
  public void print()
  {
	  System.out.print("Hello");
  }
	
	public static void main(String[] args) 
	{
		Heirarchialchild1 obj= new Heirarchialchild1();
		obj.display();
        obj.print();
		
	}

}
