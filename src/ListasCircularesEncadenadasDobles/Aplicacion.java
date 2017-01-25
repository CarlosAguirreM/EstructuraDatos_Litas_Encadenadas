package ListasCircularesEncadenadasDobles;

public class Aplicacion {

	public static void main(String[] args) throws Exception {
        
		 ListaCircular lista = new ListaCircular();
	        
		 //NodoD nodoAux = new NodoD("", null, null);
	        
	        System.out.println("************* Ejemplo de lista Doble ************\n");
	        
	        lista.insertarInicio(new NodoDC("1"));
	        lista.insertarInicio(new NodoDC("2"));
	        lista.insertarInicio(new NodoDC("3"));
	        lista.insertarInicio(new NodoDC("4"));
	        lista.insertarInicio(new NodoDC("5"));
	        lista.insertarInicio(new NodoDC("6"));
	        lista.insertarInicio(new NodoDC("7"));
	        lista.insertarInicio(new NodoDC("8"));
	        lista.insertarFinal(new NodoDC("-1"));
	        lista.insertarFinal(new NodoDC("-2"));
	        lista.insertarFinal(new NodoDC("-3"));
	        lista.insertarFinal(new NodoDC("-4"));
	        lista.insertarFinal(new NodoDC("-5"));
	        
	        System.out.println("\n\n***** Tamaño ******");
	        System.out.println(lista.getTamaño());
	        
	        System.out.println("\n\n***** Consulta si existe el elemento 2 ******");
	        System.out.println(lista.buscarContenido("2").getElemento());
	        
	        System.out.println("\n\n***** Obtener poicion del elemento 2 ******");
	        System.out.println(String.valueOf(lista.getPosicion("2")));
	        
	        System.out.println("\n\n***** Consulta si existe el nodo de posicion 1 ******");
	        System.out.println(lista.buscarNodoPosicion(1).getElemento());
	        
	        System.out.println("\n\n***** Tamaño ******");
	        System.out.println(lista.getTamaño());
	        
	        System.out.println("\n\n***** Imprimir lista ******");
	        System.out.println(lista.recorrerSig());
	        
	        System.out.println("\n\n***** Imprimir lista inverso******");
	        System.out.println(lista.recorrerAnt());
	        
	        System.out.println("\n\n***** Eliminar Posicion ******");
	        lista.eliminarNodoPosición(0);
	        System.out.println(lista.recorrerSig());
	        
	        System.out.println("\n\n***** Eliminar Contenido ******");
	        lista.eliminarNodoContenido("-3");
	        System.out.println(lista.recorrerSig());
	        
	        /*
	        
	             
	        System.out.println("\n\n********Ingresa un nodo nuevo al inicio**********");
	        lista.agregarNodoInicio(new NodoD("45", null, null));
	        System.out.println("\n"+lista.recorrerListaAscendente());
	        
	        System.out.println("\n\n********Ingresa un nodo nuevo al final***********");
	        lista.agregarNodoFinal(new NodoD("23", null, null));
	        System.out.println("\n"+lista.recorrerListaAscendente());
	        
	        lista.eliminarIncio();
	        System.out.println("\n"+lista.recorrerListaAscendente());
	        
	        lista.eliminarFinal();
	        System.out.println("\n"+lista.recorrerListaAscendente());
	        
	        System.out.println(lista.buscarNodoContenido("2").getElemento());
	*/
}
}
