package ListasEncadenadasDobles;

import ListasEncadenadasDobles.NodoD;


public class ListasDobleEnlace {

	protected NodoD cabezaLista; //nodo inicial de la lista (cabeza)
	protected NodoD finalLista; //nodo inicial de la lista (cabeza)
	protected int tamaño; 	// número de nodos en la lista 

	public void ListaDobleEnlace(){ //Constructor por defecto, crea lista vacía 
		cabezaLista = new NodoD("head", null, finalLista); 
		tamaño = 0; 
	}

	public int getTamaño(){
		return tamaño;
	}

	public boolean verificarVacia(){

		return getTamaño()==0;
	}

	public void agregarNodoInicio(NodoD nodoNuevo){ 

		/*if(verificarVacia()==true){

			cabezaLista.setSiguiente(nodoNuevo);
			finalLista.setAnterior(nodoNuevo);

		}else{*/

		NodoD nodoAux=cabezaLista.getSiguiente(); //copia de la lista
		
		nodoNuevo.setSiguiente(nodoAux); // nodo ingresado se conecta con el 
		nodoNuevo.setAnterior(cabezaLista);
		
		nodoAux.setAnterior(nodoNuevo);
		
		cabezaLista.setSiguiente(nodoNuevo);

		//}

		tamaño++; // El tamaño de la lista aumenta en 1 

	}

	public void agregarNodoFinal(NodoD nodoNuevo){ 

		/*  if (verificarVacia()==true) {

            finalLista.setAnterior(nodoNuevo);

        } else{*/

		NodoD nodoAux = finalLista.getAnterior();//copia de la lista

		nodoNuevo.setAnterior(nodoAux);
		nodoNuevo.setSiguiente(finalLista); 

		nodoAux.setSiguiente(nodoNuevo);

		finalLista.setAnterior(nodoNuevo);

		//}

		tamaño++;
	}

	public void agregarNuevoNodo(NodoD nodoNuevo){ 

		if (verificarVacia()==true) {

			cabezaLista = nodoNuevo;

		} else{

			NodoD nodoAux = cabezaLista;

			while(nodoAux.getSiguiente()!= null){
				nodoAux = nodoAux.getSiguiente();
			}

			nodoAux.setSiguiente(nodoNuevo);
		}

		tamaño++;
	}
	
	public void eliminarIncio(){
		
		NodoD nodoAux = cabezaLista.getSiguiente();//copia de la lista

		cabezaLista.setSiguiente(nodoAux.getSiguiente());
		nodoAux.getSiguiente().setAnterior(cabezaLista);

		tamaño--;
		
	}
	
	public void eliminarFinal(){
		
		NodoD nodoAux = finalLista.getAnterior();//copia de la lista

		finalLista.setAnterior(nodoAux.getAnterior());
		nodoAux.getAnterior().setSiguiente(finalLista);

		tamaño--;
		
	}
	
	public NodoD buscarNodoContenido(String dato){
		
		NodoD nodoAux=cabezaLista.getSiguiente(); 
		NodoD nodoEncontrado=null;
				
		while(nodoAux!=null){  
			
			if(dato.equals(nodoAux.getElemento())){ 
				
				nodoEncontrado=nodoAux;
				
			}else{
				
				nodoAux=nodoAux.getSiguiente();
			}
		}
		
		return nodoEncontrado;
	}
	
	public int obtenerPosicion(String dato){
		
		NodoD nodoAux=cabezaLista.getSiguiente(); 
		int indice=0;
				
		while(nodoAux!=null){  
			
			if(dato.equals(nodoAux.getElemento())){ 
				
				return indice;
				
			}else{
				
				indice++;
			}
		}
		
		return indice;
	}
	
	public boolean buscarNodoPosicion(int posicion){
		
		boolean encontrado=false;
		
		if( posicion>tamaño || posicion <tamaño){
			
			encontrado=false;
			
		}else{
			
			encontrado=true;
		}
		
		return encontrado;
	}
	
	public void eliminarLista(){
		
		cabezaLista.setSiguiente(finalLista);
		finalLista.setAnterior(cabezaLista);
		tamaño=0;
		
	}
	
}
