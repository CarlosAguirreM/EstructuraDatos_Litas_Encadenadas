package ListasTaller;

public class Alumno {

	private String nombre="";
	private String apellido="";
	private String cedula="";
	private Alumno next=null;
	
	public Alumno(String nombre_,String apellido_, String cedula_, Alumno next_){
		
		this.nombre=nombre_;
		this.apellido=apellido_;
		this.cedula=cedula_;
		this.next=next_;
			
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Alumno getNext() {
		return next;
	}

	public void setNext(Alumno next) {
		this.next = next;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellido: " + apellido + "\nCedula=" + cedula ;
	}
	
		
}
