package EjerciciosObjetos;

public class Cuentass {
 
	private String titular;

	private int cantidad;

	public Cuentass(String titular,int cantidad) {
		this.titular=titular;
		this.cantidad=cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(double d) {
		this.cantidad = (int) d;
		System.out.println("Titular: "+titular);
		System.out.println("Cantidad: "+cantidad);
	}

	public static int get(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Titular: "+titular);
		System.out.println("Cantidad: "+cantidad);
	}

	public void ingreso(double cantidad2) {
		int cantidadAIngresar = 0;
		// TODO Auto-generated method stub
		if  (cantidadAIngresar>0)
		{
			this.cantidad+=cantidadAIngresar;
		}
	}

	public void retirarDinero(double comision) {
		// TODO Auto-generated method stub
		
	
		
	}

	public Cuentass() {
		super();
	}

}
