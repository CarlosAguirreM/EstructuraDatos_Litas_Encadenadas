package PilasColas;

class Node { 
	
	private Object elem; 
	private Node next; 
	public Node(Object e, Node n) { 
		elem=e;
		next=n;
	}
	
	public Node() { 
		elem=0;
		next=null;
	}

	public void setElem(Object e) {
		elem=e;
	} 

	void setNext(Node n)   {
		next=n;
	} 
	
	Object getElem() {
		return elem;
	} 
	Node getNext() {
		return this.next;
	}
}
