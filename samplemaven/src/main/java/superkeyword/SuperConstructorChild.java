package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent
{
public SuperConstructorChild()
{
	super(3,5);
	System.out.println("default constructor");
}
	public static void main(String[] args) 
	{
		SuperConstructorChild obj=new SuperConstructorChild();
		
	}

}
