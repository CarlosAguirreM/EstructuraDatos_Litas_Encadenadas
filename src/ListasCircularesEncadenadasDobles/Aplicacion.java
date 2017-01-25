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

		System.out.println("\n\n***** Obtener posicion del elemento 2 ******");
		System.out.println(imprimirExistencia(lista.buscarContenido("2")));
		
		System.out.println("\n\n***** Obtener posicion del elemento 2 ******");
		System.out.println(imprimirExistencia(lista.buscarContenido("90")));
		
		System.out.println("\n\n***** Consulta si existe el nodo de posicion 1 ******");
		System.out.println(imprimirExistencia(lista.buscarNodoPosicion(3)));

		System.out.println("\n\n***** Consulta si existe el nodo de posicion 1 ******");
		System.out.println(imprimirExistencia(lista.buscarNodoPosicion(23)));

		System.out.println("\n\n********Ingresa un nodo nuevo al inicio**********");
		lista.insertarInicio(new NodoDC("45"));
		System.out.println("\n"+lista.recorrerSig()+"\nTamaño:"+lista.getTamaño());

		System.out.println("\n\n********Ingresa un nodo nuevo al final***********");
		lista.insertarFinal(new NodoDC("23"));
		System.out.println("\n"+lista.recorrerSig()+"\nTamaño:"+lista.getTamaño());
		
		System.out.println("\n\n********Ingresa un nodo nuevo antes de otro***********");
		lista.agregarAntes(new NodoDC("12"), "4");
		System.out.println("\n"+lista.recorrerSig()+"\nTamaño:"+lista.getTamaño());
		
		System.out.println("\n\n********Ingresa un nodo nuevo después de otro***********");
		lista.agregarDespues(new NodoDC("45"), "4");
		System.out.println("\n"+lista.recorrerSig()+"\nTamaño:"+lista.getTamaño());

		System.out.println("\n\n********Ingresa un nodo nuevo en una posición***********");
		lista.agregarPosicion(new NodoDC("89"), 4);
		System.out.println("\n"+lista.recorrerSig()+"\nTamaño:"+lista.getTamaño());
		
		System.out.println("\n\n***** Imprimir lista inverso******");
		System.out.println(lista.recorrerAnt());

		System.out.println("\n\n***** Eliminar Posicion ******");
		lista.eliminarNodoPosición(3);
		System.out.println(lista.recorrerSig()+"\nTamaño:"+lista.getTamaño());

		System.out.println("\n\n***** Eliminar Contenido ******");
		lista.eliminarNodoContenido("-3");
		System.out.println(lista.recorrerSig()+"\nTamaño:"+lista.getTamaño());
		
		System.out.println("\n\n***** Eliminar Lista ******");
		lista.eliminarLista();
		System.out.println(lista.recorrerSig()+"\nTamaño:"+lista.getTamaño());

	}
	
	public static String imprimirExistencia(NodoDC nodo){
		
		String existe;
		
		if(nodo==null){
			
			existe="no existe";
			
		}else{
			
			existe="si existe ";
			
		}
		return existe;
	}
}
