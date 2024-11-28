package herenciaPersonas;

public class Supa {
	protected String dni;
	protected String nombre;
	
	public Supa() {
		this.dni="";
		this.nombre="";
	}
	public Supa(String d, String n) {
		this.dni=d;
		this.nombre=n;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	public void visualizar() {
		System.out.println("DNI: "+ this.dni);
		System.out.println("Nombre: "+ this.nombre);
	}
}
