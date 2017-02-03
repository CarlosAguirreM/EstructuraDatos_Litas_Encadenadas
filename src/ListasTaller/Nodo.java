package Dos;

public class Nodo {
	
	private String elemento;	//Nombre del producto
	private String estado;		//Esta listo o no
	private int 	canti=0;
	private Nodo next;			// siguiente nodo
	public Nodo(String el,String e,int c,Nodo n){
		elemento 	= el;
		estado		= e;
		canti		= c;
		next		= n;
		
	}
	public Nodo(String el,String e,int c){
		elemento	= el;
		estado		= e;
		canti		= c;
		next		= null;
	}
	public Nodo(String el){
		elemento = el;
		estado   =	"nolisto";
		next	 =	null;
	}
	
	
	
	public String getElemento(){return elemento;}
	
	public Nodo getnext(){return next;}
	
	public void setElement(String newElem){elemento = newElem;}
	
	public void setNext(Nodo newNext){next = newNext;}
	
	public String getEstado() {return estado;}
	
	public void setEstado(String newestado) {estado = newestado;}
	
	public int getCantidad() {return canti;}
	
	public void setCantidad(int newc) {canti = newc;}
}
