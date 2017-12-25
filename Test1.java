package LinkedList;

import java.util.ArrayList;

public class Test1
{
//Create a main method
	public static void main(String[] args)
	{
		//create a array
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=2;
		System.out.println("Array Elements:-"+arr[0]);
		
		// Create a ArrayList
		ArrayList<Integer> arrli=new ArrayList<Integer>(3);
		arrli.add(1);
		arrli.add(2);
		System.out.println("ArrayList Elements:-"+ arrli.get(0));	
	}
}
