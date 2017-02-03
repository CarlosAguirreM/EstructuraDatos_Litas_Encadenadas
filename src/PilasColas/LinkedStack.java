package PilasColas;

import PilasColas.Node;

public class LinkedStack implements Stack {
	private Node top; 
	private int size;

	public LinkedStack() {
		top=null;
		size=0;
	}

	public int size() {
		return size;
	} 
	public boolean isEmpty() { 
		return(top==null);
	}

	public void push(Object e) {
		Node n= new Node();
		n.setElem(e);
		n.setNext(top);
		top=n;
		size++;
		}
	
	public Object top(){
			
			return top.getElem();
			}

	public Object pop() throws StackEmptyException { 
		Object temp=0; 
		if (isEmpty())
			//throw new StackEmptyException("vacia");
		temp=top.getElem();
		top=top.getNext();	
		size--; 
		return temp; 
		}

}