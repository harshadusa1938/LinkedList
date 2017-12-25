package MyLinkedList;

public class Node<T> 
{
	T data;
	Node<T> next;

	public Node(T data, Node<T> next)
	{
		this.data = data;
		this.next = next;
	}

	public T getData()
	{
		return data;
	}

	public void setData(T data)
	{
		this.data = data;
	}

	public Node<T> getNext() 
	{
		return next;
	}

	public void setNext(Node<T> next) 
	{
		this.next = next;
	}

	@Override
	public String toString()
	{
		return "Node [data=" + data + ", next=" + next + "]";
	}

}