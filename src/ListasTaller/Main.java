package ListasTaller;

public class Main {
	
	 public static void main(String[] args) throws Exception {
	        
		 ListaAlumnos lista = new ListaAlumnos();
		 
		 	lista.agregarAlumno(new Alumno("Adrian", "Acurio", "172555690", null));
		 	lista.agregarAlumno(new Alumno("Bertha", "Beltr�n", "172555691", null));
		 	lista.agregarAlumno(new Alumno("Cesar", "Carrasco", "172555692", null));
		 	lista.agregarAlumno(new Alumno("Daniela", "Esp�n", "172555693", null));
		 	lista.agregarAlumno(new Alumno("Ernesto", "Fern�ndez", "172555694", null));
		 	lista.agregarAlumno(new Alumno("Fatima", "Fern�dez", "172555695", null));
		 	lista.agregarAlumno(new Alumno("Gabriel", "Pazminio", "172555696", null));
		 	lista.agregarAlumno(new Alumno("Hilda", "Maldonado", "172555697", null));
		 	lista.agregarAlumno(new Alumno("Cithia", "Montenegro", "172555698", null));
		 	lista.agregarAlumno(new Alumno("Jose", "Kure", "172555699", null));
		 		       	        
	        System.out.println("************* Lista de alumnos ************\n");
	              
	       
	        System.out.println(lista.recorrerLista());
	        
	        System.out.println("\n\n***** Tama�o ******");
	        System.out.println(lista.getTama�o());
	        	        	        
	        System.out.println("�Existe el alumno de c�dula 172555690?");
	        lista.buscarAlumno("172555690");
	        System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nIngresa un nodo nuevo al inicio");
	        lista.agregarNodoInicio(new Nodo("hoola", null));
	        System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nIngresa un nodo nuevo al final");
	        lista.agregarFinal(new Nodo("23", null));
	        System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nElimina el valor inicial");
	        lista.eliminarInicio(nodoAux);
	        System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nConsulta si existe el valor 30");
	        System.out.println(lista.buscarNodo("23"));
	        
	        System.out.println("\nConsulta la posicion del valor 9");
	        System.out.println(lista.getPosicion("9"));
	        
	        System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nElimina la lista");
	        lista.eliminarLista();
	        System.out.println(lista.imprimirLista());
	        System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nConsulta si la lista est� vacia");
	        System.out.println(lista.verificarVacia()); 
	    
	
	    }   
	
	public static String imprimirExistencia(Alumno alumno){
		
		if
		
		return 
	}

}
