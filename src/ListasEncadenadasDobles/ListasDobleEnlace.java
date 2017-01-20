package ListasEncadenadasDobles;

import ListasEncadenadasDobles.NodoD;


public class ListasDobleEnlace {

	protected NodoD cabezaLista; 
	protected NodoD finalLista; 
	protected int tama�o; 	

	public void ListaDobleEnlace(){

		tama�o = 0; 
		cabezaLista = null; 
		finalLista = null;
		cabezaLista.setSiguiente(finalLista);
		finalLista.setAnterior(cabezaLista);

	}

	public int getTama�o(){
		return tama�o;
	}

	public boolean verificarVacia(){

		return getTama�o()==0;
	}

	public void agregarNodoInicio(NodoD nodoNuevo){ 

		NodoD nodoAux=cabezaLista; 

		nodoNuevo.setAnterior(nodoAux); 
		nodoNuevo.setSiguiente(cabezaLista);

		//cabezaLista.setSiguiente(nodoNuevo);

		cabezaLista=nodoNuevo;

		tama�o++; 

	}

	public void agregarNodoFinal(NodoD nodoNuevo){ 

		if (verificarVacia()==true) {

			cabezaLista = nodoNuevo;

		} else{

			NodoD nodoAux = cabezaLista;

			while(nodoAux.getSiguiente()!= null){
				nodoAux = nodoAux.getSiguiente();
			}

			nodoAux.setSiguiente(nodoNuevo);
			nodoNuevo.setAnterior(nodoAux);
		}

		tama�o++;

		/*NodoD nodoAux = finalLista;

		nodoNuevo.setSiguiente(nodoAux);
		nodoNuevo.setAnterior(finalLista); 

		//nodoAux.setSiguiente(nodoNuevo);

		finalLista=nodoNuevo;

		tama�o++;*/
	}

	public void agregarNuevoNodoAntes(NodoD nodoNuevo, String dato){ 

		NodoD nodoAux = null;
		NodoD nodoAuxAnt = null;

		nodoAux=buscarNodoContenido(dato);

		if(nodoAux != null){

			nodoAuxAnt = nodoAux.getAnterior();

			nodoNuevo.setAnterior(nodoAuxAnt);
			nodoNuevo.setSiguiente(nodoAux);

			nodoAuxAnt.setSiguiente(nodoNuevo);

			nodoAux.setAnterior(nodoNuevo);
		}

		tama�o++;
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

		tama�o++;
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

		tama�o++;
	}

	public void eliminarIncio(){

		NodoD nodoAux = cabezaLista;


		cabezaLista = cabezaLista.getSiguiente(); // nodo inicial apunta al siguiente 
		nodoAux.setSiguiente(null);

		tama�o--;

	}

	public void eliminarFinal(){

		NodoD nodoAux = cabezaLista;

		while(nodoAux.getSiguiente()!= null){
			nodoAux = nodoAux.getSiguiente();
		}

		nodoAux.getAnterior().setSiguiente(null);;
	}


	public NodoD buscarNodoContenido(String dato){

		NodoD nodoAux=cabezaLista; 
		NodoD nodoEncontrado=null;

		while(nodoAux!=null){  

			nodoAux=nodoAux.getSiguiente();

			if(nodoAux.getElemento().equals(dato)) 
				nodoEncontrado=nodoAux;
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

public void editarNodoContenido(String dato, String datoNuevo){

	NodoD nodoAux = null;

	nodoAux=buscarNodoContenido(dato);

	if(nodoAux!=null){

		nodoAux.setElemento(datoNuevo);

	}

}

public void editarNodoPosici�n(int posicion, String dato){

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

public void eliminarNodoPosici�n(int posicion){

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
		int i=tama�o;

		while(nodoAux!= null){

			lista += (i + ". [ "+ nodoAux.getElemento()+" ] <-> ");
			nodoAux=nodoAux.getAnterior();

			i--;
		}

	}
	return lista;

}

}
