package EjerciciosObjetos;

public class Libro {
	
	    
	    private String ISBN;
	    private String titulo;
	    private String autor;
	    private int ejemplaresVendidos;
	    private double precio;

	    public Libro(String ISBN, String titulo, String autor, int ejemplaresVendidos, double precio) {
	        this.ISBN = ISBN;
	        this.titulo = titulo;
	        this.autor = autor;
	        this.ejemplaresVendidos = ejemplaresVendidos;
	        this.precio = precio;
	    }

	    public Libro(String ISBN, String titulo, String autor) {
	        this(ISBN, titulo, autor, 0, 0.0);
	    }

	    public String getISBN() { return ISBN; }
	    public void setISBN(String ISBN) { this.ISBN = ISBN; }

	    public String getTitulo() { return titulo; }
	    public void setTitulo(String titulo) { this.titulo = titulo; }

	    public String getAutor() { return autor; }
	    public void setAutor(String autor) { this.autor = autor; }

	    public int getEjemplaresVendidos() { return ejemplaresVendidos; }
	    public void setEjemplaresVendidos(int ejemplaresVendidos) { this.ejemplaresVendidos = ejemplaresVendidos; }

	    public double getPrecio() { return precio; }
	    public void setPrecio(double precio) { this.precio = precio; }

	    @Override
	    public String toString() {
	        return "El libro con el título " + titulo + " e ISBN " + ISBN + ", creado por el autor " + autor +
	                " ha vendido " + ejemplaresVendidos + " ejemplares a un precio de " + precio + " €";
	    }

	    // Método esSuperVentas
	    public boolean esSuperVentas() {
	        return ejemplaresVendidos > 18000;
	    }

	    // Método obtenerBeneficioTotal
	    public double obtenerBeneficioTotal() {
	        return ejemplaresVendidos * precio * 1.04;
	    }
	}


