package Dos;

import Dos.SLinkedList;

public class Main {

	public static void main(String[] args) {
		SLinkedList lista_productos= new SLinkedList();
		
		System.out.println("----Cargando Inventario----");
		System.out.println("cargando atun...");
		lista_productos.addFirst(NuevoNodo("atun", 3, "nolisto"));
		
		System.out.println("cargando panes...");
		lista_productos.addFirst(NuevoNodo("pan", 4, "nolisto"));
		
		System.out.println("cargando galletas...");
		lista_productos.addFirst(NuevoNodo("galleta", 2, "nolisto"));
		
		System.out.println("cargando limones...");
		lista_productos.addFirst(NuevoNodo("limon", 2, "nolisto"));
		System.out.println(lista_productos.imprimirLista());
	
	
	System.out.println("----Ingresando lista de cliente----");
	System.out.println("comprando atun (2)...");
	lista_productos.editarNodoContenido("atun",2,"listo");
	
	
	System.out.println("comprando pan (1)...");
	lista_productos.editarNodoContenido("pan",1,"listo");
	
	
	System.out.println("comprando galletas (2)...");
	lista_productos.editarNodoContenido("galleta",2,"listo");
	

	System.out.println("comprando limones (1)...");
	lista_productos.editarNodoContenido("limon",1,"listo");
	
	
	System.out.println("----Actualizando Inventario----");
	System.out.println(lista_productos.imprimirLista());
	
	
	
	}
	
	public static Nodo NuevoNodo(String el,int n,String e){
		Nodo N =null;
			N = new Nodo(el,e,n,null);				
		return N;
	}
	
	
	
	

}
