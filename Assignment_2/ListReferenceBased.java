
public class ListReferenceBased {
	
	public static boolean isEmpty(Node head) {
		if(head == null)
			return true;
		return false;
	}
	
	public static int size(Node head){
		int count = 0;
		Node curr = head;
		
		if (head == null)
			return count;
		while(curr != null) {
			curr = curr.next;
			count++;
		}
		return count;
	}
	
	public static void add (int i, int index) {
		int count = 0;
		Node head = null;
		Node curr = head;
		Node prev = null;
		Node newNode = new Node(i);
		
		if (head == null) {
			head = newNode;
		}
		
		if(index == 0) {
			newNode.next = head;
			head = newNode;
		}
		
		if(index > size(head)+1) {
			System.out.println("Index out of bound!");
		}
		
		if (index == size(head)+1)
		{
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
		while(count < index) {
			prev = curr;
			curr = curr.next;	
		}
		prev.next = newNode;
		newNode.next = curr;
		
	}
	
	public static void print(Node head) {
		Node curr = head;
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			System.out.print("The list is : ");
			while(curr.next != null)
			{
				System.out.print(curr.data + "->");
				curr = curr.next;
				
			}
			System.out.println("x");
		}
	}
	
	public static void main(String[] args) {
		Node head = new Node(5);
		System.out.println("Is the list empty: " + isEmpty(head));
		System.out.println("Size of the list: " + size(head));
		System.out.println("Add at front: ");
		add(3, 0);
		print(head);
		System.out.println("Size of the list: " + size(head));
		System.out.println("Add in middle: ");
		add(2, 1);
		print(head);
		System.out.println("Size of the list: " + size(head));
		System.out.println("Add at last: ");
		add(10, 3);
		print(head);
	}

}
