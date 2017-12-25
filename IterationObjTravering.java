package LinkedList;

import java.util.*;

public class IterationObjTravering
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Harsh");
		al.add("Asha");
		al.add("Rahul");
		
		System.out.println("Numbers Of Elements:-"+al);
		for(String obj: al)
		{
			System.out.println(obj);
		}
	}
}