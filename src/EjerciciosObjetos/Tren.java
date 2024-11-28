package EjerciciosObjetos;

import java.util.Scanner;

public class Tren {
	private int MAXCAPACIDAD;
	private String tipo;
	private String referencia;
	private int asientosOcupados;
	private double kmRecorridos;
	private int duracionViaje;

	public Tren(Scanner teclado, Tren a[], int contador) {
		this.tipo = tipo;
        this.duracionViaje = duracionViaje;
		this.tipo=asignarTipo(tipo);
	}

	public Tren() {
		// TODO Auto-generated constructor stub
	}

	private String asignarTipo(String tipo2) {
		// TODO Auto-generated method stub
		return null;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public int getDuracionViaje() {
		return duracionViaje;
	}

	public void setDuracionViaje(int duracionViaje) {
		this.duracionViaje = duracionViaje;
	}
	
	public boolean trenLleno() {
		boolean lleno= false;
		if(asientosOcupados==MAXCAPACIDAD) 
		 lleno=true;
		return lleno;	
	}
	public double obtenerVelocidadTotal() {
		double velocidad=kmRecorridos/((double)duracionViaje/60);
		return velocidad;
	}


	public int getMAXCAPACIDAD() {
		return MAXCAPACIDAD;
	}


	public void setMAXCAPACIDAD(int mAXCAPACIDAD) {
		MAXCAPACIDAD = mAXCAPACIDAD;
	}


	public void setTren(String next) {
		// TODO Auto-generated method stub
		
	}
}
