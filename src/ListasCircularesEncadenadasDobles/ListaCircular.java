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
		
		
	}
	
	public void insertarFinal(NodoDC nuevoNodo){
		
		if(verificarVacia()==true){
			
			cabeza=nuevoNodo;
			
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
		
		
	}
	
	public void insertarOrden(NodoDC nuevoNodo){
		
		if(verificarVacia()==true){
			
			cabeza=nuevoNodo;
			
		}
	}


}
