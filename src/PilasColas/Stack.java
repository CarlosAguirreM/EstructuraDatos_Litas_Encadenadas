package PilasColas;

public interface Stack { 
	
	public int size(); 
	public boolean isEmpty(); 
	public void push(Object o); 
	public Object pop() throws StackEmptyException; 
	public Object top() throws StackEmptyException; } 