package ListasTaller;

public class SLinkedList {
	protected static Nodo head; 	//Nodo cabecera
	protected long size;	//Numero de nodos en la lista
	public SLinkedList(){
		head = null;
		size =0;
	}
	
	public long getSize() {
		return size;
	}


	public void setSize(long size) {
		this.size = size;
	}


	public void addFirst(Nodo v){
		v.setNext(head);	// {make v point to the old head node} 
		head = v; 			//{make variable head point to new node} 
		size = size + 1; 	//{increment the node count}
	}

	public boolean ListaVacia(){

		return head==null;
	}

	public String imprimirLista(){
		
		String R="\n------------Lista de Productos------------ \n\n#Uni | Estado        | Nombre";
		String espacios="                                              ";

		if(!ListaVacia()){

			Nodo nodoaux= head;
			
			while(nodoaux!= null){
				
				if(nodoaux.getEstado()=="no listo")
				R+=  "\n  "+nodoaux.getCantidad()+"  | ["+ nodoaux.getEstado()+"]"+espacios.substring(0, 12-nodoaux.getEstado().length())+"| ["+ nodoaux.getElemento()+"]";
				nodoaux=nodoaux.getnext();
				
			}

		}
		return R;

	}
	
	public Nodo buscarNodoContenido(String dato){

		Nodo nodoAux=head; 
		Nodo nodoEncontrado=null;

		do{  
			//System.out.println(nodoAux);
			if(nodoAux.getElemento().equals(dato)) 
				nodoEncontrado=nodoAux;
			
			nodoAux=nodoAux.getnext();
		}while(nodoAux!=null );

		return nodoEncontrado;
	}
	
	public void editarNodoContenido(String dato, int cNueva ,String datoNuevo){
	
		Nodo nodoAux = null;

		nodoAux=buscarNodoContenido(dato);
		
		if(nodoAux!=null){
			nodoAux.setEstado(datoNuevo);
			
			nodoAux.setCantidad((nodoAux.getCantidad()-cNueva));

		}

	}

}
