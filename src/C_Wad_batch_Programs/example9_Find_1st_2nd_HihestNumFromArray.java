package C_Wad_batch_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class example9_Find_1st_2nd_HihestNumFromArray
{
	public static void main(String[] args)
	{
		
		int [] ar= {10,40,30,20,60,60,50};
		
		Arrays.sort(ar);           //10,20,30,40,50,60,60
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();     //10,20,30,40,50,60
		//TreeSet<Integer> lhs=new TreeSet<Integer>();
		for(int num:ar)
		{
			lhs.add(num);
		}
		
		System.out.println(lhs);
		System.out.println(lhs);
		ArrayList<Integer> al=new ArrayList<>(lhs);     //10,20,30,40,50,60
		
		System.out.println(al.get(al.size()-2));
		System.out.println(al.get(al.size()-1));
		
		
		
		
	}

}
