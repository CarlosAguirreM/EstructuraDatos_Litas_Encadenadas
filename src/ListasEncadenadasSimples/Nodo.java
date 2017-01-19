package ListasEncadenadasSimples;
	
	
	public class Nodo {
		
		private String elemento; // Asumimos que todos los elementos son String
		private Nodo siguiente; 
		
		public Nodo(String s, Nodo n) { //Constructor del nodo
			elemento = s; 
			siguiente = n; } 
		
		public String getElemento() { 
			return elemento; 
		} 
		
		public Nodo getSiguiente() {
			return siguiente; 
		} 
		
		public void setElement(String nuevoElemento){ 
			elemento = nuevoElemento; 
		} 
		
		public void setSiguiente( Nodo nuevoSig) {
			siguiente = nuevoSig;
				} 
		 
		
	} 
	 
	


