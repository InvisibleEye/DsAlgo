
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
	
	public static Node add (Node head, int i, int index) {
		int count = 0;
		Node curr = head;
		Node prev = null;
		Node newNode = new Node(i);
		
		if (head == null) {
			head = newNode;
		}
		else if (index == 0 && head != null) {
			newNode.next = head;
			head = newNode;
		}
		else if (index > size(head)+1) {
			System.out.println("Index out of bound!");
		}
		else if (index == size(head)+1)
		{
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
		else{
			while(count < index && curr != null) {
				prev = curr;
				curr = curr.next;
				count++;	
			}
			prev.next = newNode;
			newNode.next = curr;
		}
		return head;
	}

	public static Node remove (Node head, int index){
		Node curr = head;
		Node prev = null;
		int count = 0;

		if(index == 0)
		{
			curr = curr.next;
			head = curr;
		}
		else if (index > size(head)) {
			System.out.println("Index out of bound!");
		}
		else if (index == size(head))
		{
			while(curr.next != null) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = null;
		}
		else{
			while(count < index && curr != null) {
				prev = curr;
				curr = curr.next;
				count++;	
			}
			prev.next = curr.next;
		}
		return head;
	}
	
	public static void get(Node head) {
		Node curr = head;
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			System.out.print("The list is : ");
			while(curr != null)
			{
				System.out.print(curr.data + " -> ");
				curr = curr.next;
				
			}
			System.out.println("x");
		}
	}
	
	public static Node removeAll(Node head){
		return head = null;
	}
	public static void main(String[] args) {
		Node head = new Node(5);
		System.out.println("Is the list empty: " + isEmpty(head));
		System.out.println("Size of the list: " + size(head));
		System.out.println("Add at front: ");
		head = add(head, 3, 0);
		get(head);
		System.out.println("Size of the list: " + size(head));
		System.out.println("Add in middle: ");
		head = add(head, 2, 1);
		get(head);
		System.out.println("Add in middle: ");
		head = add(head, 42, 1);
		get(head);		
		System.out.println("Size of the list: " + size(head));
		System.out.println("Add at last: ");
		head = add(head, 10, 3);
		get(head);
		System.out.println("Remove at front: ");
		head = remove(head,  0);
		get(head);
		System.out.println("Remove at last: ");
		head = remove(head,  3);
		get(head);
		System.out.println("Remove at middle: ");
		head = remove(head,  1);
		get(head);
		head = removeAll(head);
		System.out.println("After removeing all");
		get(head);
	}

}
