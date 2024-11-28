package EjerciciosObjetos;

public class Jugador {

	private int velocidad;
	private String nombre;
	public int getVelocidad() {
		return velocidad;
	}
	public Jugador(int velocidad, int fisico, int tiro, int pase, int defensa, int regate) {
		super();
		this.velocidad = velocidad;
		this.fisico = fisico;
		this.tiro = tiro;
		this.pase = pase;
		this.defensa = defensa;
		this.regate = regate;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getFisico() {
		return fisico;
	}
	public void setFisico(int fisico) {
		this.fisico = fisico;
	}
	public int getTiro() {
		return tiro;
	}
	public void setTiro(int tiro) {
		this.tiro = tiro;
	}
	public int getPase() {
		return pase;
	}
	public void setPase(int pase) {
		this.pase = pase;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getRegate() {
		return regate;
	}
	public void setRegate(int regate) {
		this.regate = regate;
	}
	private int fisico;
	private int tiro;
	private int pase;
	private int defensa;
	private int regate;
	
	public Jugador() {
		
	}
	@Override
	public String toString() {
		return nombre+" [velocidad=" + velocidad + ", fisico=" + fisico + ", tiro=" + tiro + ", pase=" + pase
				+ ", defensa=" + defensa + ", regate=" + regate + "]";
	}
}

