package ListasEncadenadasDobles;

public class NodoD {
	
	private String elemento;
	private NodoD siguiente;
	private NodoD anterior;
	
	public NodoD(String element, NodoD nodoS, NodoD nodoA){
		
		this.elemento=element;
		this.siguiente=nodoS;
		this.anterior=nodoA;
			}
	
	public NodoD(String elemento){
		
		this.elemento=elemento;
		this.siguiente=null;
		this.anterior=null;
		
	}
	
	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public NodoD getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoD siguiente) {
		this.siguiente = siguiente;
	}

	public NodoD getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoD anterior) {
		this.anterior = anterior;
	}
	
	
	

}
