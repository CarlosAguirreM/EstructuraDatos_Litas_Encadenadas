package ListasEncadenadasDobles;

import ListasEncadenadasDobles.NodoD;

public class ListasDobleEnlace {

	protected NodoD cabezaLista; 
	protected NodoD finalLista; 
	protected int tamaño; 	

	public void ListaDobleEnlace(){
		
		tamaño = 0; 
		cabezaLista = null; 
		finalLista = null;
		cabezaLista.setSiguiente(finalLista);
		finalLista.setAnterior(cabezaLista);
		
	}

	public int getTamaño(){
		return tamaño;
	}

	public boolean verificarVacia(){

		return getTamaño()==0;
	}

	public void agregarNodoInicio(NodoD nodoNuevo){ 

		NodoD nodoAux=cabezaLista; 
		
		nodoNuevo.setAnterior(nodoAux); 
		nodoNuevo.setSiguiente(cabezaLista);

		//cabezaLista.setSiguiente(nodoNuevo);

		cabezaLista=nodoNuevo;

		tamaño++; 

	}

	public void agregarNodoFinal(NodoD nodoNuevo){ 

		NodoD nodoAux = finalLista;

		nodoNuevo.setSiguiente(nodoAux);
		nodoNuevo.setAnterior(finalLista); 

		//nodoAux.setSiguiente(nodoNuevo);

		finalLista=nodoNuevo;

		tamaño++;
	}

	public void agregarNuevoNodoAntes(NodoD nodoNuevo, String dato){ 

		NodoD nodoAux = null;
		NodoD nodoAuxAnt = null;
			
	/*	if (verificarVacia()==true) {

			cabezaLista.setSiguiente(nodoNuevo);
			finalLista.setAnterior(nodoNuevo);

		} 
*/
		nodoAux=buscarNodoContenido(dato);

		if(nodoAux != null){
			
			nodoAuxAnt = nodoAux.getAnterior();
			
			nodoNuevo.setAnterior(nodoAuxAnt);
			nodoNuevo.setSiguiente(nodoAux);
			
			nodoAuxAnt.setSiguiente(nodoNuevo);
			
			nodoAux.setAnterior(nodoNuevo);
		}

		tamaño++;
	}
	
	public void agregarNuevoNodoDespues(NodoD nodoNuevo, String dato){ 

		NodoD nodoAux = null;
		NodoD nodoAuxSig = null;
			
	  nodoAux=buscarNodoContenido(dato);

		if(nodoAux != null){
			
			nodoAuxSig = nodoAux.getSiguiente();
			
			nodoNuevo.setSiguiente(nodoAuxSig);
			nodoNuevo.setAnterior(nodoAux);
			
			nodoAuxSig.setAnterior(nodoNuevo);
			
			nodoAux.setSiguiente(nodoNuevo);
		}

		tamaño++;
	}

	public void agregarNuevoNodoPosicion(NodoD nodoNuevo, int posicion){ 

		NodoD nodoAuxAnt = null;
		NodoD nodoAuxSig = null;
			
		nodoAuxAnt=buscarNodoPosicion(posicion);

		if(nodoAuxAnt != null){
			
			nodoAuxSig = nodoAuxAnt.getSiguiente();
			
			nodoNuevo.setSiguiente(nodoAuxSig);
			nodoNuevo.setAnterior(nodoAuxAnt);
			
			nodoAuxSig.setAnterior(nodoNuevo);
			
			nodoAuxAnt.setSiguiente(nodoNuevo);
		}

		tamaño++;
	}
	
	public void eliminarIncio(){

		NodoD nodoAux = cabezaLista.getSiguiente();

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

	public NodoD buscarNodoPosicion(int posicion){

		NodoD nodoAux=cabezaLista.getSiguiente(); 
		NodoD nodoEncontrado=null;
		int i=0;

		if( posicion>tamaño || posicion <tamaño){

			nodoEncontrado=null;

		}else{

			do{

				nodoAux=nodoAux.getSiguiente();
				i++;

				if(i==posicion)
					nodoEncontrado=nodoAux;

			}while(posicion<tamaño);
		}

		return nodoEncontrado;
	}

	public void eliminarLista(){

		cabezaLista.setSiguiente(finalLista);
		finalLista.setAnterior(cabezaLista);
		tamaño=0;

	}

	public void editarNodoContenido(String dato, String datoNuevo){

		NodoD nodoAux = null;

		nodoAux=buscarNodoContenido(dato);

		if(nodoAux!=null){

			nodoAux.setElemento(datoNuevo);

		}

	}

	public void editarNodoPosición(int posicion, String dato){

		NodoD nodoAux = null;

		nodoAux=buscarNodoPosicion(posicion);

		if(nodoAux!=null){

			nodoAux.setElemento(dato);

		}

	}

	public void eliminarNodoContenido(String dato){

		NodoD nodoAux = null;
		NodoD nodoAux2=null;
		NodoD nodoAux3=null;

		nodoAux=buscarNodoContenido(dato);

		if(nodoAux!=null){

			nodoAux2=nodoAux.getAnterior();
			nodoAux3=nodoAux.getSiguiente();

			nodoAux2.setSiguiente(nodoAux3);

			nodoAux3.setAnterior(nodoAux2);

		}

	}

	public void eliminarNodoPosición(int posicion){

		NodoD nodoAux = null;
		NodoD nodoAux2=null;
		NodoD nodoAux3=null;

		nodoAux=buscarNodoPosicion(posicion);

		if(nodoAux!=null){

			nodoAux2=nodoAux.getAnterior();
			nodoAux3=nodoAux.getSiguiente();

			nodoAux2.setSiguiente(nodoAux3);

			nodoAux3.setAnterior(nodoAux2);

		}

	}

	public String recorrerListaAscendente(){

		String lista = "";

		if(verificarVacia()==false){

			NodoD nodoAux= cabezaLista;
			int i=0;

			while(nodoAux!= null){

				lista += (i + ". [ "+ nodoAux.getElemento()+" ] <-> ");
				nodoAux=nodoAux.getSiguiente();

				i++;
			}

		}
		return lista;

	}

	public String recorrerListaDescendente(){

		String lista = "";

		if(verificarVacia()==false){

			NodoD nodoAux= finalLista;
			int i=tamaño;

			while(nodoAux!= null){

				lista += (i + ". [ "+ nodoAux.getElemento()+" ] <-> ");
				nodoAux=nodoAux.getAnterior();

				i--;
			}

		}
		return lista;

	}

}
