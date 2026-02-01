package interfaceexample;

public class Interface2 implements Interface1
{

	public void show()
	{
		System.out.println("Hello");
		
	}
	
	public static void main(String[] args) 
	{
		Interface2 obj= new Interface2();
		obj.display();
		obj.print();
		obj.show();
 //reference creation 
		Interface1 ref=new Interface2();
		ref.display();
		ref.print();
	}

	@Override
	public void display() 
	{
		System.out.println("Java");
		
	}

	@Override
	public void print() 
	{
		System.out.println("Good Morning");
		
	}

}
