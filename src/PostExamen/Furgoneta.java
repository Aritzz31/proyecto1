package PostExamen;

public class Furgoneta extends Vehiculoo{


public Furgoneta(String matricula, String marca, String modelo, int añosantigüedad, int precio) {
		super(matricula, marca, modelo, añosantigüedad, precio);
		// TODO Auto-generated constructor stub
	}
	private int alto; //m
	private int tara; //kg sin carga sin pasajeros
	private int carga; //500kg
    
	public int getAlto() {
    	return alto;
	}
	public void setAlto(int alto) {
    	this.alto = alto;
	}
	public int getTara() {
    	return tara;
	}
	public void setTara(int tara) {
    	this.tara = tara;
	}
	public int getCarga() {
    	return carga;
	}
	public void setCarga(int carga) {
    	this.carga = carga;
	}
	public Furgoneta(String matricula, String marca, String modelo, int añosantigüedad, int precio, int alto, int tara, int carga ) {
    	super(matricula, marca, modelo, añosantigüedad, precio);
    	this.alto = alto;
    	this.tara = tara;
    	this.carga = carga;
	}
	@Override
	public String toString() {
    	return "Furgoneta [alto=" + alto + ", tara=" + tara + ", carga=" + carga + "]";
	}
    
	}
