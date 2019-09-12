import java.util.*;
public class LexographicCompare {
 
	public static class Node
	{
		String data;
		Node next;
		public Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static int compare(Node list1,Node list2)
	{
		while(list1.next!=null&&list2.next!=null&&list1.data!=list2.data)
		{
			list1=list1.next;
			list2=list2.next;
		}
	    return list1.data.compareTo(list2.data);
	}
	public static void main(String args[])
	{
		Node list1;
		Node list2;
		Node tail;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes in list1");
		int n1=sc.nextInt();
		System.out.println("Enter the number of nodes in list2");
		int n2=sc.nextInt();
		System.out.println("Enter the nodes of list1");
		list1= new Node(sc.next());
		tail=list1;
		while(n1-- > 1)
		{
			tail.next=new Node(sc.next());
		}
		System.out.println("Enter the nodes of list2");
		list2= new Node(sc.next());
		tail=list2;
		while(n2-- > 1)
		{
			tail.next=new Node(sc.next());
		}
		System.out.println(compare(list1,list2));
		sc.close();
		
	}
}
