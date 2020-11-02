
class ReverseDI{
	
	public class Node{
		int data;
		Node next;
	}
	Node head;
	Node tail;
	int size;
	
	public void addToFirst(int val) {
		Node newnode = new Node();
		newnode.data = val;
		if(size==0) {
			this.head = newnode;
			this.tail = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
		size++;
	}
	
	public void addToLast(int val) {
		Node newnode = new Node();
		newnode.data = val;
		if(size==0) {
			this.head = newnode;
			this.tail = newnode;
		}
		else {
			this.tail.next=newnode;
			this.tail = newnode;
		}
		size++;
	}
	
	public void addToAnyPos(int val, int pos) {
		if(pos<0 || pos>size) {
			System.out.println("Out of bound");
		}
		else if(pos==0) {
			addToFirst(val);
		}
		else if(pos==size) {
			addToLast(val);
		}
		else {			
			Node temp = head;
			int count=0;
			while(count<pos-1) {
				temp = temp.next;
				count++;
			}
			Node newnode = new Node();
			newnode.data = val;
			newnode.next = temp.next;
			temp.next = newnode;
		}
		size++;
	}
	
	public Node getNodeAt(int idx) {
		if(idx<0 || idx>=size) {
			return null;
		}
		Node temp = head;
		int count=0;
		while(count<idx) {
			temp = temp.next;
			count++;
		}
		return temp;		
	}
	
	
	public void reverseDI() {
		int l = 0;
		int r = this.size-1;
		while(l<r) {
			Node lNode = getNodeAt(l);
			Node rNode = getNodeAt(r);
			
			int temp = lNode.data;
			lNode.data = rNode.data;
			rNode.data = temp;
			
			l++;
			r--;
		}
	}
	
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"--> ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}

public class ReverseDataItr {
	
	public static void main(String[] args) {
		
		ReverseDI rev = new ReverseDI();
		
		rev.addToLast(8);
		rev.addToLast(10);
		rev.addToFirst(4);
		rev.addToFirst(2);
		rev.addToAnyPos(5, 2);
		
		rev.display();
		
		rev.reverseDI();
		rev.display();
	}

}
