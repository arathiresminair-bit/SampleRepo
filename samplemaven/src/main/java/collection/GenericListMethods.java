package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods 
{

	public static void main(String[] args) 
	{
		List <String> L= new ArrayList<String>();
		L.add("Red");
		L.add("Green");
		L.add("White");
		L.add("Green");
		System.out.println(L);
		
		System.out.println(L.get(0));
		L.set(0, "Blue");
		System.out.println(L);
		System.out.println(L.indexOf("Green"));
		System.out.println(L.lastIndexOf("Green"));
		L.remove("Green");
		System.out.println(L);
		System.out.println(L.contains("Blue"));
		System.out.println(L.isEmpty());
		System.out.println(L.size());
	}

}
