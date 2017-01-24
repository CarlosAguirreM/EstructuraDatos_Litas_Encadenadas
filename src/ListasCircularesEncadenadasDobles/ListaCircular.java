package ListasCircularesEncadenadasDobles;

public class ListaCircular {
	
	protected NodoDC cabeza;
	protected int tamaño;
	
	public ListaCircular(){
		
		tamaño=0;
		cabeza=null;
				
	}
	
	public int getTamaño(){
		return tamaño;
	}

	public boolean verificarVacia(){

		return getTamaño()==0;
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
