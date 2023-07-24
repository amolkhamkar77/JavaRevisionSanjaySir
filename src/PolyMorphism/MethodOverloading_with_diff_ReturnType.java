package PolyMorphism;

public class MethodOverloading_with_diff_ReturnType 
{
	//method overloading
	
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public String add(String name)
	{		
		return name.toLowerCase();
	}
	
	
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}
