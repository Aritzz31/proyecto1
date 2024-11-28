package PostExamen;

public class Vehiculos {
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected final String color="negro";
	protected int antiguedad;
	protected int precio;

	protected static int contador=0;

	public Vehiculos(String matricula, String marca, String modelo,  int antiguedad, int precio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.antiguedad = antiguedad;
		this.precio = precio;
		contador++;

	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;

	}
	public int getAntiguedad() {
		return antiguedad;

	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;

	}
	public int getPrecio() {
		return precio;

	}
	public void setPrecio(int precio) {
		this.precio = precio;

	}
	public static int getContador() {
		return contador;

	}
	public static void setContador(int contador) {
		Vehiculos.contador = contador;

	}
	@Override

	public String toString() {
		return "Vehiculoss [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", antiguedad=" + antiguedad + ", precio=" + precio + "]";
	}



}

