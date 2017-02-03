package ListasTaller;

public class ListaAlumnos {

	protected Alumno alumnoInicial;
	protected long tamaño;

	public long getTamaño(){
		return tamaño;
	}

	public boolean verificarVacia(){

		return alumnoInicial==null;
	}

	public void agregarAlumno(Alumno nuevoAl){
		

		if(verificarVacia()==true){

			alumnoInicial=nuevoAl;

		}else{
			
			nuevoAl.setNext(alumnoInicial);
			alumnoInicial=nuevoAl;

		}

		tamaño++; // El tamaño de la lista aumenta en 1 
		
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
		String espacios = "                                                                  ";
		
		if(verificarVacia()==false){
			
			Alumno alumnoAux= alumnoInicial;
			int i=1;
			
			while(alumnoAux!= null){
				
				lista += (i+espacios.substring(0, 4-String.valueOf(i).length()) +
						alumnoAux.getNombre()+ 
						espacios.substring(0, 9-alumnoAux.getNombre().length()) + 
						alumnoAux.getApellido()+
						espacios.substring(0, 12-alumnoAux.getApellido().length()) + 
						alumnoAux.getCedula()+"\n");
				
				alumnoAux=alumnoAux.getNext();
				
				i++;
			}
			
		}
		
		return lista;
	}

}
