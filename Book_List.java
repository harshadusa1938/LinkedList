package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Book_List
{
	int id;
	String book_name;
	String author;
	int quantity;
	
	public Book_List(int id,String book_name,String author,int quantity)
	{
		this.id=id;
		this.book_name=book_name;
		this.author=author;
		this.quantity=quantity;
	}

	
//}

//public class listExample
//{
	public static void main(String[] args)
	{
		List<Book_List> l1=new ArrayList<Book_List>();
		// Creating Book..
		
		Book_List b1=new Book_List(1, "Java", "BalaGulusami", 10);
		Book_List b2=new Book_List(2, "Asp.Net", "Mc Graw", 8);
		Book_List b3=new Book_List(3, "Html", "Try OwnSelf", 25);
		Book_List b4=new Book_List(4, "CSS", "BalaGulusami", 4);
	
		
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		// Traversing 
		
	//	for(Book_List b: List)
		{
		//	System.out.println(b.id+""+b.book_name+" "+b.author+""+b.quantity);
			
		}
			
	}

}