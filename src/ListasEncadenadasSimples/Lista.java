package ListasEncadenadasSimples;

public class Lista {
	
	protected Nodo nodoInicial; //nodo inicial de la lista (cabeza)
	protected long tamaño; 	// número de nodos en la lista 
	
	public void Lista(){ //Constructor por defecto, crea lista vacía 
		nodoInicial = null; 
		tamaño = 0; 
	}
	
	public long getTamaño(){
				return tamaño;
	}
	
	public boolean verificarVacia(){
		
		return nodoInicial==null;
	}
	
	public void agregarNodoInicio(Nodo nodoNuevo){ 
		
		if(verificarVacia()==true){
			
			nodoInicial=nodoNuevo;
			
		}else{
			
			nodoNuevo.setSiguiente(nodoInicial);
			nodoInicial=nodoNuevo;
			
		}
				
		tamaño++; // El tamaño de la lista aumenta en 1 

	}
	
	public void agregarFinal(Nodo nodoNuevo){ 
		  
        if (verificarVacia()==true) {
            
            nodoInicial = nodoNuevo;
        
        } else{
            
            Nodo nodoAux = nodoInicial;
           
            while(nodoAux.getSiguiente()!= null){
            	nodoAux = nodoAux.getSiguiente();
            }
           
            nodoAux.setSiguiente(nodoNuevo);
        }
       
        tamaño++;
	}
	
	public String eliminarInicio(Nodo t){
		
		String aviso="";
		
		if (nodoInicial == null){
			aviso= "La lista está vacía";
			
			return aviso;
			
		}
		
		t = nodoInicial; 
		nodoInicial = nodoInicial.getSiguiente(); // nodo inicial apunta al siguiente 
		t.setSiguiente(null); // el siguiente nodo a t se vuelve null 
		tamaño = tamaño-1; //el numero de nodos disminuye en 1
		
		return aviso;
	
	}
			
	public boolean buscarNodo(String dato){
		
		Nodo nodoAux=nodoInicial; //crea copia de la lista existente
		boolean encontrado=false;
		
		while(nodoAux!=null && encontrado !=true ){  // mientras no se haya encontrado y no se haya acabado la lista
			
			if(dato.equals(nodoAux.getElemento())){ // si el dato existe, devolver verdadero
				
				encontrado=true;
				
			}else{
				
				nodoAux=nodoAux.getSiguiente();
			}
		}
		
		return encontrado;
	}

	public int getPosicion(String dato) throws Exception{
		
		if(buscarNodo(dato)){
			
			Nodo nodoAux= nodoInicial;
			int contador=0;
			
			while(dato!=nodoAux.getElemento()){
				
				contador ++;
			nodoAux=nodoAux.getSiguiente();
				
			}	
			
			return contador;
			
		}else{
			
			throw new Exception("El dato no existe en la lista");
			
		}
	}
	
	public String imprimirLista(){
		
		String lista = "";
		
		if(verificarVacia()==false){
			
			Nodo nodoAux= nodoInicial;
			int i=0;
			
			while(nodoAux!= null){
				
				lista += (i + ". [ "+ nodoAux.getElemento()+" ] -> ");
				nodoAux=nodoAux.getSiguiente();
				
				i++;
			}
			
		}
		return lista;
	}

	public void eliminarLista(){
		
		nodoInicial=null;
		tamaño=0;
		
	}

}
	

