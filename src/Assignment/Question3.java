package Assignment;

import java.util.*;

class Node<T> 
{
	T data;
	Node<T> next;
	
	Node(T data)
	{
		this.data = data;
		this.next = null;
	}
}
class list<T> {
	Node<T> head;
	private int length = 0;
	list() { this.head = null; }
	void add(T data)
	{
		Node<T> temp = new Node<>(data);
		
		if (this.head == null) 
		{
			head = temp;
		}
		else {
			Node<T> X = head;
			while (X.next != null) 
			{
				X = X.next;
			}
			X.next = temp;
		}
		length++;
	}
	void remove(T key)
	{
		Node<T> prev = new Node<>(null);
		prev.next = head;
		Node<T> next = head.next;
		Node<T> temp = head;
		boolean exists = false;
		if (head.data == key) 
		{
			head = head.next;
			exists = true;
		}
		while (temp.next != null) 
		{
			if (String.valueOf(temp.data).equals(String.valueOf(key))) 
			{
				prev.next = next;
				exists = true;
				break;
			}
			prev = temp;
			temp = temp.next;
			next = temp.next;
		}
		if (exists == false && String.valueOf(temp.data).equals(String.valueOf(key))) 
		{
			prev.next = null;
			exists = true;
		}
		if (exists) 
		{
			length--;
		}
		else 
		{
			System.out.println("value not found");
		}
	}
	public String toString()
    {
        String S = "";
        Node<T> X = head;
        if (X == null)
            return "list is empty";
        while (X != null) 
        {
            S += String.valueOf(X.data) + " -> ";
            X = X.next;
        }
        return S;
    }
}

public class Question3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		list<Integer> list = new list<>();
		System.out.println("Integer LinkedList :");
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("List1 : ");
		System.out.println(list);
		list.remove(2);
		System.out.println("List1 after removing 2 elements : ");
		System.out.println(list);
		list<String> list1 = new list<>();
		System.out.println("\nString LinkedList : ");
		list1.add("hello");
		list1.add("world");
		System.out.println("list2 after adding hello and world : ");
		System.out.println(list1);

	}

}
