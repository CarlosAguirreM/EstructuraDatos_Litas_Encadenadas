package ListasCircularesEncadenadasDobles;


public class NodoDC {
	
	private String elemento;
	private NodoDC siguiente;
	private NodoDC anterior;
	
	public NodoDC(String element, NodoDC nodoS, NodoDC nodoA){
		
		this.elemento=element;
		this.siguiente=nodoS;
		this.anterior=nodoA;
			}
	
	public NodoDC(String elemento){
		
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

	public NodoDC getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDC siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDC getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDC anterior) {
		this.anterior = anterior;
	}
	
	

}
