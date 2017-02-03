package ListasTaller;

import ListasEncadenadasSimples.Lista;

public class Main {
	
	 static ListaAlumnos lista = new ListaAlumnos();
	
	 public static void main(String[] args) throws Exception {
	        
		
		 
		 	lista.agregarAlumno(new Alumno("Adrian", "Acurio", "172555690", null));
		 	lista.agregarAlumno(new Alumno("Bertha", "Beltrán", "172555691", null));
		 	lista.agregarAlumno(new Alumno("Cesar", "Carrasco", "172555692", null));
		 	lista.agregarAlumno(new Alumno("Daniela", "Espín", "172555693", null));
		 	lista.agregarAlumno(new Alumno("Ernesto", "Fernández", "172555694", null));
		 	lista.agregarAlumno(new Alumno("Fatima", "Fernádez", "172555695", null));
		 	lista.agregarAlumno(new Alumno("Gabriel", "Pazminio", "172555696", null));
		 	lista.agregarAlumno(new Alumno("Hilda", "Maldonado", "172555697", null));
		 	lista.agregarAlumno(new Alumno("Cithia", "Montenegro", "172555698", null));
		 	lista.agregarAlumno(new Alumno("Jose", "Kure", "172555699", null));
		 		       	        
	        System.out.println("************* Lista de alumnos ************\n");
	        System.out.println("No. Nombre   Apellido   Cedula    ");      
	        System.out.println(lista.recorrerLista());
	        	        	        	        
	        System.out.println("\n¿Existe el alumno de cédula 172555690?");
	        System.out.println(imprimirExistencia("172555690"));
	        
	        System.out.println("\n¿Existe el alumno de cédula 173255690?");
	        System.out.println(imprimirExistencia("173255690"));
	        
	        System.out.println("\nIngresar nuevo alumno ");
	        verificarNuevo(new Alumno("Juan", "Aguilera", "172555611", null));
	        	        
	        System.out.println("\nIngresar nuevo alumno con cedula repetida");
	        verificarNuevo(new Alumno("Daniel", "Enriquez", "172555690", null));
	       	        
	        System.out.println("\n\n************* Lista de alumnos ************\n");
	        System.out.println("No. Nombre   Apellido   Cedula    ");       
	        System.out.println(lista.recorrerLista());
	        	
	    }   
	
	public static String imprimirExistencia(String dato){
		
		if(lista.buscarAlumno(dato)!=null)
			return "Si"+"\n"+lista.buscarAlumno(dato).toString();
		
		return "No";
		
	}
	
	public static void verificarNuevo(Alumno dato){
		
		if(lista.buscarAlumno(dato.getCedula())!=null)
			System.out.println("Cedula ya existente, no se puede ingresar alumnos con cedulas duplicadas");
		else{
			
			lista.agregarAlumno(dato);
			
		}
		
	}

}
