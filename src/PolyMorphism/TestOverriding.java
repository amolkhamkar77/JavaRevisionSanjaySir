package PolyMorphism;

public class TestOverriding 
{
	public static void main(String[] args) 
	{
// for accesing father class properties create obj of father class		
		Father f=new Father();
		f.car();
		f.money();
		f.home();
		
// for accesing son class properties create obj of son class		
		Son s=new Son();
		s.car();
		s.money();
		s.home();
		s.bike();
			
	}

}
