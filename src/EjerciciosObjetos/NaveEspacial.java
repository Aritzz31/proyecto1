package EjerciciosObjetos;

public class NaveEspacial {

	private String Nombre;
	private int  AñoDecreacion;
	private int AñoDeLanzamiento;
	private int CapacidadPersonas;
	private int NumTripulantes;
	
	
	public NaveEspacial(String Nombre,int  AñoDecreacion,int AñoDeLanzamiento,int CapacidadPersonas,int NumTripulantes) {
		this.Nombre=Nombre;
		this.AñoDecreacion=AñoDecreacion;
		this. AñoDeLanzamiento= AñoDeLanzamiento;
		this.CapacidadPersonas=CapacidadPersonas;
		this.NumTripulantes=NumTripulantes;
		
		// TODO Auto-generated constructor stub
	}


	public NaveEspacial(String Nombre) {
		
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getAñoDecreacion() {
		return AñoDecreacion;
	}


	public void setAñoDecreacion(int añoDecreacion) {
		AñoDecreacion = añoDecreacion;
	}


	public int getAñoDeLanzamiento() {
		return AñoDeLanzamiento;
	}


	public void setAñoDeLanzamiento(int añoDeLanzamiento) {
		AñoDeLanzamiento = añoDeLanzamiento;
	}


	public int getCapacidadPersonas() {
		return CapacidadPersonas;
	}


	public void setCapacidadPersonas(int capacidadPersonas) {
		CapacidadPersonas = capacidadPersonas;
	}


	public int getNumTripulantes() {
		return NumTripulantes;
	}

	
	public void setNumTripulantes(int numTripulantes) {
		NumTripulantes = numTripulantes;
	}


	@Override
	public String toString() {
		return "NaveEspacial [Nombre=" + Nombre + ", AñoDecreacion=" + AñoDecreacion + ", AñoDeLanzamiento="
				+ AñoDeLanzamiento + ", CapacidadPersonas=" + CapacidadPersonas + ", NumTripulantes=" + NumTripulantes
				+ "]";
	}
	
	public int calcularAntiguedad() {
		
		return AñoDeLanzamiento;
			
	}
	
	public boolean admitePasajeros() {
		return false;
		
	}


	public void mostrar() {
		System.out.println("Nave: "+Nombre+"Año de creacion:"+AñoDecreacion+"Año de lanzamientio:"+AñoDeLanzamiento+"Capacidad de Personas"+CapacidadPersonas+"Numero de tripulantes"+NumTripulantes);
		// TODO Auto-generated method stub
	}
	private int buscarPorNombre( String nombre, Object a, int contadorNaves) {
				// TODO Auto-generated method stub
				return 0;
		
	}
	

	
	
	
}
