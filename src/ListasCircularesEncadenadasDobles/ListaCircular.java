package ListasCircularesEncadenadasDobles;

public class ListaCircular {

	protected NodoDC cabeza;
	protected int tama�o;

	public ListaCircular(){

		tama�o=0;
		cabeza=null;

	}

	public int getTama�o(){
		return tama�o;
	}

	public boolean verificarVacia(){

		return getTama�o()==0;
	}

	public void insertarInicio(NodoDC nuevoNodo){

		if(verificarVacia()==true){

			cabeza=nuevoNodo;
			cabeza.setSiguiente(cabeza);
			cabeza.setAnterior(cabeza);

		}else{

			NodoDC auxNodo = cabeza;

			while(auxNodo.getSiguiente()!=cabeza){

				auxNodo=auxNodo.getSiguiente();
			}

			auxNodo.setSiguiente(nuevoNodo);
			nuevoNodo.setAnterior(auxNodo);
			nuevoNodo.setSiguiente(cabeza);
			cabeza.setAnterior(nuevoNodo);
			cabeza=nuevoNodo;

		}

		tama�o++;
	}

	public void insertarFinal(NodoDC nuevoNodo){

		if(verificarVacia()==true){

			cabeza=nuevoNodo;
			cabeza.setSiguiente(cabeza);
			cabeza.setAnterior(cabeza);

		}else{

			NodoDC auxNodo = cabeza;

			while(auxNodo.getSiguiente()!=cabeza){

				auxNodo=auxNodo.getSiguiente();
			}

			auxNodo.setSiguiente(nuevoNodo);
			nuevoNodo.setAnterior(auxNodo);
			nuevoNodo.setSiguiente(cabeza);
			cabeza.setAnterior(nuevoNodo);

		}
		tama�o++;

	}

	public NodoDC buscarContenido(String elemento){

		NodoDC auxNodo=cabeza;
		NodoDC nodoEncontado=null;
		
		while((auxNodo.getSiguiente()!=cabeza)&&!(auxNodo.getElemento().equals(elemento))){

			auxNodo=auxNodo.getSiguiente();
			
			if(auxNodo.getElemento().equals(elemento))
				nodoEncontado=auxNodo;

		}
		return nodoEncontado;
	}

	public NodoDC buscarNodoPosicion(int posicion){

		NodoDC nodoAux=cabeza; 
		NodoDC nodoEncontrado=null;
		int i=0;

		if( posicion>tama�o || posicion <0){

			nodoEncontrado=null;

		}else if(posicion==0){

			nodoEncontrado=cabeza;

		}else{

			while(nodoAux.getSiguiente()!=cabeza){

				nodoAux=nodoAux.getSiguiente();
				i++;

				if(i==posicion)
					nodoEncontrado=nodoAux;

			}
		}

		return nodoEncontrado;
	}

	public int getPosicion(String elemento){

		NodoDC auxNodo=cabeza;
		int indice=0;

		while((auxNodo.getSiguiente()!=cabeza)&&!(auxNodo.getElemento().equals(elemento))){

			auxNodo=auxNodo.getSiguiente();
			indice++;

		}
		return indice;
	}

	public String recorrerSig(){

		String lista="";

		if(verificarVacia()==true){

			lista="Est� vac�a";

		}else{

			NodoDC nodoAux=cabeza;
			int i=0;

			do{

				lista += (i + ". [ "+ nodoAux.getElemento()+" ] <-> ");
				nodoAux=nodoAux.getSiguiente();

				i++;

			}while(nodoAux.getSiguiente()!=cabeza);

			lista += (i + ". [ "+ nodoAux.getElemento()+" ] <-> ");
			lista += ("cabeza");

		}

		return lista;

	}

	public String recorrerAnt(){

		String lista="";

		if(verificarVacia()==true){

			lista="Est� vac�a";

		}else{

			NodoDC nodoAux=cabeza;
			int i=0;

			do{

				lista += (i + ". [ "+ nodoAux.getElemento()+" ] <-> ");
				nodoAux=nodoAux.getAnterior();

				i++;

			}while(nodoAux.getAnterior()!=cabeza);

			lista += (i + ". [ "+ nodoAux.getElemento()+" ] <-> ");
			lista += ("cabeza");

		}

		return lista;

	}

	public void eliminarNodoPosici�n(int posicion){

		NodoDC nodoAux = null;
		NodoDC nodoAuxAnt=null;
		NodoDC nodoAuxSig=null;

		nodoAux=buscarNodoPosicion(posicion);

		if(nodoAux!=null){

			if(posicion==0){

				nodoAuxAnt=nodoAux.getAnterior();
				nodoAuxAnt.setSiguiente(nodoAux.getSiguiente());
				nodoAux=nodoAux.getSiguiente();
				nodoAux.setAnterior(nodoAuxAnt);
				cabeza=nodoAux;

			}else{


				nodoAuxAnt=nodoAux.getAnterior();
				nodoAuxSig=nodoAux.getSiguiente();

				nodoAuxAnt.setSiguiente(nodoAuxSig);
				nodoAuxSig.setAnterior(nodoAuxAnt);

				nodoAux.setSiguiente(null);
				nodoAux.setAnterior(null);
			}

		}
		tama�o--;
	}

	public void eliminarNodoContenido(String elemento){

		NodoDC nodoAux = null;
		NodoDC nodoAuxAnt=null;
		NodoDC nodoAuxSig=null;

		nodoAux=buscarContenido(elemento);

		if(nodoAux!=null){


			nodoAuxAnt=nodoAux.getAnterior();
			nodoAuxSig=nodoAux.getSiguiente();

			nodoAuxAnt.setSiguiente(nodoAuxSig);
			nodoAuxSig.setAnterior(nodoAuxAnt);

			nodoAux.setSiguiente(null);
			nodoAux.setAnterior(null);


		}
		
		tama�o--;

	}

	public void eliminarLista(){
		
		cabeza=null;
		tama�o=0;
		
	}

	public void agregarAntes(NodoDC nodoNuevo, String dato){ 

		NodoDC nodoAux = null;
		NodoDC nodoAuxAnt = null;

		nodoAux=buscarContenido(dato);

		if(nodoAux != null){

			nodoAuxAnt = nodoAux.getAnterior();

			nodoNuevo.setAnterior(nodoAuxAnt);
			nodoNuevo.setSiguiente(nodoAux);

			nodoAuxAnt.setSiguiente(nodoNuevo);

			nodoAux.setAnterior(nodoNuevo);
		}

		tama�o++;
	}

	public void agregarDespues(NodoDC nodoNuevo, String dato){ 

		NodoDC nodoAux = null;
		NodoDC nodoAuxSig = null;

		nodoAux=buscarContenido(dato);

		if(nodoAux != null){

			nodoAuxSig = nodoAux.getSiguiente();

			nodoNuevo.setSiguiente(nodoAuxSig);
			nodoNuevo.setAnterior(nodoAux);

			nodoAuxSig.setAnterior(nodoNuevo);

			nodoAux.setSiguiente(nodoNuevo);
		}

		tama�o++;
	}

	public void agregarPosicion(NodoDC nodoNuevo, int posicion){ 

		NodoDC nodoAuxAnt = null;
		NodoDC nodoAuxSig = null;

		nodoAuxSig=buscarNodoPosicion(posicion);
		
		if(nodoAuxSig != null){

			nodoAuxAnt = nodoAuxSig.getAnterior();

			nodoNuevo.setSiguiente(nodoAuxSig);
			nodoNuevo.setAnterior(nodoAuxAnt);

			nodoAuxAnt.setSiguiente(nodoNuevo);

			nodoAuxSig.setAnterior(nodoNuevo);
		}

		tama�o++;
	}
}
