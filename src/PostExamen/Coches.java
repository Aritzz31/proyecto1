package PostExamen;

public class Coches extends Vehiculoo {

	public Coches(String matricula, String marca, String modelo, int añosantigüedad, int precio, boolean descapotable) {
    	super(matricula, marca, modelo, añosantigüedad, precio);
    	descapotable=false;
	}

	private boolean descapotable;

	public boolean getDescapotable() {
    	return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
    	this.descapotable = descapotable;
	}

	public String toString() {
    	return "Coche [descapotable=" + descapotable + "]";
	}
    
}

