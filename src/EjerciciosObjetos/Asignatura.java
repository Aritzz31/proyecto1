package EjerciciosObjetos;

public class Asignatura {
	private String Nombre;
	private String Curso;
	private int AlumnosMatriculados;
	private int NumSuspensos;
	
	
	
	public Asignatura(String nombre, String curso) {
		super();
		Nombre = nombre;
		Curso = curso;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
	public int getAlumnosMatriculados() {
		return AlumnosMatriculados;
	}
	public void setAlumnosMatriculados(int alumnosMatriculados) {
		AlumnosMatriculados = alumnosMatriculados;
	}
	public int getNumSuspensos() {
		return NumSuspensos;
	}
	public void setNumSuspensos(int numSuspensos) {
		NumSuspensos = numSuspensos;
	}
	
	public double porcentajeAprobados(){
		return AlumnosMatriculados;		
	}
	public double obtenerNumeroAprobados() {
		return AlumnosMatriculados;
		
	}
	








	public Asignatura(String nombre, int matriculados, int suspensos) {
		// TODO Auto-generated constructor stub
	}
	public int getAprobados() {
		// TODO Auto-generated method stub
		return 0;
	}




	}
	
	

