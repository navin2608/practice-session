
public class LinkedList {
	Node head;
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if (head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}n.next=node;
		}
	}
	public void insertStart(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;

	}
	public void deleteAt(int index)
	{	Node n=head;
		Node n1=null;
		for (int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		n1=n.next;
		n.next=n1.next;
		n1=null; 
				
	}
	public void insertAt(int index,int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		Node n=head;
		if(index==0)
			insertStart(data);
		else
		{
		for (int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
	}
	public void show()
	{
		  Node node=head;
		  while(node.next!=null)
		  {
			  System.out.println(node.data);
			  node=node.next;
		  }System.out.println(node.data);
	}
}
