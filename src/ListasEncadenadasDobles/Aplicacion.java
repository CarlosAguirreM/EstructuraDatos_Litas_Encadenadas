package ListasEncadenadasDobles;



public class Aplicacion {

	public static void main(String[] args) throws Exception {
        
		 ListasDobleEnlace lista = new ListasDobleEnlace();
	        NodoD nodoAux = new NodoD("", null, null);
	        
	        System.out.println("************* Ejemplo de lista simple ************\n");
	        
	        lista.agregarNodoInicio(new NodoD("10", null, null));
	        lista.agregarNodoInicio(new NodoD ("9", null, null));
	        
	        System.out.println("***** Lista *****");
	        //lista.imprimirLista();
	        
	        System.out.println("\n\n***** Tamaño ******");
	        System.out.println(lista.getTamaño());
	        	        	        
	        System.out.println("\nIngresa un nodo nuevo al inicio");
	        lista.agregarNodoInicio(new NodoD("45", null, null));
	        //System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nIngresa un nodo nuevo al inicio");
	        lista.agregarNodoInicio(new NodoD("hoola", null, null));
	        //System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nIngresa un nodo nuevo al final");
	        lista.agregarNodoFinal(new NodoD("23", null, null));
	        //System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nElimina el valor inicial");
	        lista.eliminarIncio();
	        //System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nConsulta si existe el valor 30");
	        System.out.println(lista.buscarNodoContenido("23"));
	        
	        System.out.println("\nConsulta la posicion del valor 9");
	        System.out.println(lista.obtenerPosicion("9"));
	        
	        //System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nElimina la lista");
	        lista.eliminarLista();
	        //System.out.println(lista.imprimirLista());
	        //System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nConsulta si la lista está vacia");
	        System.out.println(lista.verificarVacia()); 
	    
	
	    }   
	
}
