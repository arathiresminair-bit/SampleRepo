package sample1;

public class thismethod 
{

	public void display(int a, int b)
	
	{
	
		int sum=a+b;
		System.out.println(sum);
		this.print();
	}
   
	
	public void print()
	{
	System.out.println("Print this method");
	}
	
	public static void main(String[] args) 
	
	{
   thismethod obj=new thismethod();
   obj.display(5,3);

	}

}
