package ListasEncadenadasDobles;

import ListasEncadenadasDobles.NodoD;


public class ListasDobleEnlace {

	protected NodoD cabezaLista; //nodo inicial de la lista (cabeza)
	protected NodoD finalLista; //nodo inicial de la lista (cabeza)
	protected int tama�o; 	// n�mero de nodos en la lista 

	public void ListaDobleEnlace(){ //Constructor por defecto, crea lista vac�a 
		cabezaLista = new NodoD("head", null, finalLista); 
		tama�o = 0; 
	}

	public int getTama�o(){
		return tama�o;
	}

	public boolean verificarVacia(){

		return getTama�o()==0;
	}

	public void agregarNodoInicio(NodoD nodoNuevo){ 

		
		NodoD nodoAux=cabezaLista.getSiguiente(); //copia de la lista
		
		nodoNuevo.setSiguiente(nodoAux); // nodo ingresado se conecta con el 
		nodoNuevo.setAnterior(cabezaLista);
		
		nodoAux.setAnterior(nodoNuevo);
		
		cabezaLista.setSiguiente(nodoNuevo);

		tama�o++; // El tama�o de la lista aumenta en 1 

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

		tama�o++;
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

		tama�o++;
	}
	
	public void eliminarIncio(){
		
		NodoD nodoAux = cabezaLista.getSiguiente();//copia de la lista

		cabezaLista.setSiguiente(nodoAux.getSiguiente());
		nodoAux.getSiguiente().setAnterior(cabezaLista);

		tama�o--;
		
	}
	
	public void eliminarFinal(){
		
		NodoD nodoAux = finalLista.getAnterior();//copia de la lista

		finalLista.setAnterior(nodoAux.getAnterior());
		nodoAux.getAnterior().setSiguiente(finalLista);

		tama�o--;
		
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
	
	public NodoD buscarNodoPosicion(int posicion){
		
		NodoD nodoAux=cabezaLista.getSiguiente(); 
		NodoD nodoEncontrado=null;
		int i=0;
		
		if( posicion>tama�o || posicion <tama�o){
			
			nodoEncontrado=null;
			
		}else{
			
			do{
				
				nodoAux=nodoAux.getSiguiente();
				i++;
				
				if(i==posicion)
					nodoEncontrado=nodoAux;
			
			}while(posicion<tama�o);
		}
		
		return nodoEncontrado;
	}
	
	public void eliminarLista(){
		
		cabezaLista.setSiguiente(finalLista);
		finalLista.setAnterior(cabezaLista);
		tama�o=0;
		
	}
	
	public void editarNodoContenido(String dato){
		
		NodoD nodoAux = null;
		
		nodoAux=buscarNodoContenido(dato);
		
		if(nodoAux!=null){
			
			nodoAux.setElemento(dato);
			
		}
		
	}
	
	public void editarNodoPosici�n(int posicion, String dato){
		
		NodoD nodoAux = null;
		
		nodoAux=buscarNodoPosicion(posicion);
		
		if(nodoAux!=null){
			
			nodoAux.setElemento(dato);
			
		}
		
	}
	
}
