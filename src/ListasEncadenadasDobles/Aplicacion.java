package ListasEncadenadasDobles;



public class Aplicacion {

	public static void main(String[] args) throws Exception {
        
		 ListasDobleEnlace lista = new ListasDobleEnlace();
	        
		 //NodoD nodoAux = new NodoD("", null, null);
	        
	        System.out.println("************* Ejemplo de lista Doble ************\n");
	        
	        lista.agregarNodoInicio(new NodoD("1", null, null));
	        /*lista.agregarNodoInicio(new NodoD("2", null, null));
	        lista.agregarNodoInicio(new NodoD("3", null, null));
	        lista.agregarNodoInicio(new NodoD("4", null, null));
	        lista.agregarNodoInicio(new NodoD("5", null, null));
	        lista.agregarNodoInicio(new NodoD("6", null, null));
	        lista.agregarNodoInicio(new NodoD("7", null, null));
	        lista.agregarNodoInicio(new NodoD("8", null, null));
	        lista.agregarNodoInicio(new NodoD("9", null, null));
	        lista.agregarNodoInicio(new NodoD("10", null, null));*/
	        
	        System.out.println("\n\n***** Lista de inicio a fin*****");
	        System.out.println("\n"+lista.recorrerListaAscendente());
	        
	        System.out.println("\n\n***** Lista de fin a inicio*****");
	        System.out.println(lista.recorrerListaDescendente());
	        
	        System.out.println("\n\n***** Tamaño ******");
	        System.out.println(lista.getTamaño());
	        	        	        
	        System.out.println("\n\n********Ingresa un nodo nuevo al inicio**********");
	        lista.agregarNodoInicio(new NodoD("45", null, null));
	        System.out.println("\n"+lista.recorrerListaAscendente());
	        
	        System.out.println("\n\n********Ingresa un nodo nuevo al final***********");
	        lista.agregarNodoFinal(new NodoD("23", null, null));
	        System.out.println("\n"+lista.recorrerListaAscendente());
	        
	        System.out.println("\n\n*********Elimina el valor inicial*************");
	        lista.eliminarIncio();
	        System.out.println("\n"+lista.recorrerListaAscendente());
	        
	        System.out.println("\n\n*********Elimina el valor final*************");
	        lista.eliminarFinal();
	        System.out.println("\n"+lista.recorrerListaAscendente());
	        
	        /*System.out.println("\n\n*********Consulta si existe el dato 30***********");
	        System.out.println(lista.buscarNodoContenido("30"));
	        
	        System.out.println("\nConsulta la posicion del valor 9");
	        System.out.println(lista.obtenerPosicion("9"));
	        
	        //System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nElimina la lista");
	        lista.eliminarLista();
	        //System.out.println(lista.imprimirLista());
	        //System.out.println(lista.imprimirLista());
	        
	        System.out.println("\nConsulta si la lista está vacia");
	        System.out.println(lista.verificarVacia()); */
	    
	
	    }   
	
}
