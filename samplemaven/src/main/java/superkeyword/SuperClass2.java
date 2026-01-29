package superkeyword;

public class SuperClass2 extends SuperClass1
{
public void Cal(int a, int b)
{
	int s= super.add(a,b);
	if(s%10==0)
	{
		System.out.println("Sum is divisble by 10");
	}
	else
	{
		System.out.println("Sum is not divisble by 10");
	}
}

	public static void main(String[] args) 
	{
		SuperClass2 obj=new SuperClass2();
		obj.Cal(10, 20);
	}

}
