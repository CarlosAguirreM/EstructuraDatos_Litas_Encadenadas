package ListasEncadenadasSimples;

public class Aplicación {
	
	 public static void main(String[] args) throws Exception {
	        
		 Lista lista = new Lista();
	        Nodo nodoAux = new Nodo("", null);
	        
	        System.out.println("************* Ejemplo de lista simple ************\n");
	        
	        lista.agregarNodoInicio(new Nodo("10", null));
	        lista.agregarNodoInicio(new Nodo ("9", null));
	        
	        System.out.println("***** Lista *****");
	        lista.imprimirLista();
	        
	        System.out.println("\n\n***** Tamaño ******");
	        System.out.println(lista.getTamaño());
	        	        	        
	        System.out.println("\nIngresa un nodo nuevo al inicio");
	        lista.agregarNodoInicio(new Nodo("45", null));
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
	        
	        System.out.println("\nConsulta si la lista está vacia");
	        System.out.println(lista.verificarVacia()); 
	    
	
	    }   
	}
	



