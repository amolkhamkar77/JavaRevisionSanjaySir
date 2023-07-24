package PolyMorphism;

//child/sub class

public class Son extends Father
{
	//method overriding
	
	public void bike() 
	{
		System.out.println("bike: FZ V3");
	}
	
	
	public void car()   //override (overriding symbol is green trangle)
	{
		System.out.println("Car: Kia"); // we change the defination part only and keep the same method name
	} //ex father have BMW car but we change it to Kia car...ie we override it
	
	public void money()    //override
	{
		System.out.println("money: 2L");
	}
//we dont overide all the properties.. it is as per our requirment
//	public void home() 
//	{
//		System.out.println("home: 2BHK");
//	}
	
}
