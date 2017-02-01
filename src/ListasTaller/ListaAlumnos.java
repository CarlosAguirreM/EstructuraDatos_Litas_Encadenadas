package ListasTaller;

import ListasEncadenadasSimples.Nodo;

public class ListaAlumnos {

	protected Alumno alumnoInicial;
	protected long tamaño;

	public long getTamaño(){
		return tamaño;
	}

	public boolean verificarVacia(){

		return alumnoInicial==null;
	}

	public String agregarAlumno(Alumno nuevoAl){ 
		
		if(verificarVacia()==true){

			alumnoInicial=nuevoAl;

		}else{
			
			if(buscarAlumno(nuevoAl.getCedula())!=null)
				return "No se puede ingresar un alumno duplicado";
				
			nuevoAl.setNext(alumnoInicial);
			alumnoInicial=nuevoAl;

		}

		tamaño++; // El tamaño de la lista aumenta en 1 
		
		return "";

	}
	
	public Alumno buscarAlumno(String dato){
		
		Alumno alumnoAux=alumnoInicial; 
		Alumno alumnoEncontrado=null;
		
		while(alumnoAux!=null && alumnoEncontrado == null ){  
			
			if(dato.equals(alumnoAux.getCedula())){ 
				
				alumnoEncontrado=alumnoAux;
				
			}else{
				
				alumnoAux=alumnoAux.getNext();
			}
		}
		
		return alumnoEncontrado;
	}
	
	public String recorrerLista(){
		
		String lista = "";
		
		if(verificarVacia()==false){
			
			Alumno alumnoAux= alumnoInicial;
			int i=1;
			
			while(alumnoAux!= null){
				
				lista += (i + alumnoAux.getNombre()+ alumnoAux.getApellido()+ alumnoAux.getCedula()+"\n");
				alumnoAux=alumnoAux.getNext();
				
				i++;
			}
			
		}
		return lista;
	}



}
