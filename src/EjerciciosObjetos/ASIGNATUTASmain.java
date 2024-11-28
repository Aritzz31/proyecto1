package EjerciciosObjetos;
import java.util.Scanner;
public class ASIGNATUTASmain {


	public static int menu(Scanner teclado) 
	{
		int menu;
		System.out.println("1. Introducir las Asignaturas.");
		System.out.println("2. Mostrar los trenes que superen una velocidad dada.");
		System.out.println("3. Ordenar los trenes de cercanías por duración del viaje");
		System.out.println("4. Reserva de asientos.");
		System.out.println("5. Mostrar todos los trenes que se han introducido");
		System.out.println("6. Eliminar y Comprimir");
		System.out.println("7. Salir");
		menu = teclado.nextInt();
		return menu;
	}
	//caso 1
	public static void introducir(Scanner teclado) 
	{
		Scanner scanner = new Scanner(System.in);
		Asignatura[] asignaturas = new Asignatura[100];
		int asignaturaCount = 0;

		System.out.print("Introduce el nombre de la asignatura: ");
		String nombre = scanner.nextLine();
		boolean nombreUnico = true;
		for (int i = 0; i < asignaturaCount; i++) 
		{
			if (asignaturas[i].getNombre().equalsIgnoreCase(nombre)) 
			{
				nombreUnico = false;

			}
			if (!nombreUnico) 
			{
				System.out.println("El nombre de la asignatura ya existe. Introduce uno diferente.");

			}
			else
			{
				System.out.print("Introduce el número de matriculados: ");
				int matriculados = scanner.nextInt();
				System.out.print("Introduce el número de suspensos: ");
				int suspensos = scanner.nextInt();
				if (suspensos > matriculados) 
				{
					System.out.println("El número de suspensos no puede ser mayor que el número de matriculados.");

				}
				else
				{
					asignaturas[asignaturaCount] = new Asignatura(nombre, matriculados, suspensos);
					asignaturaCount++;
					System.out.println("Asignatura añadida correctamente.");
					System.out.print("¿Deseas añadir otra asignatura? (si/no): ");
					String respuesta = scanner.nextLine();
					if (!respuesta.equalsIgnoreCase("si")) 
					{
						System.out.println("nAsignaturas registradas:");
						for (int i1 = 0; i1 < asignaturaCount; i1++) 
						{
							Asignatura asignatura = asignaturas[i1];
							System.out.println("Nombre: " + asignatura.getNombre() + 
									", Matriculados: " + asignatura.getAlumnosMatriculados() + 
									", Suspensos: " + asignatura.getNumSuspensos());
						}
					}
				}
			}
		}// for
	}
	// case 2
	public static void mostrarPorcentaje(Scanner teclado,int c, Asignatura a[]) {
		String curso;
		boolean existe = false;

		System.out.print("Introduce el curso: ");
		curso = teclado.next();

		for (int i = 0; i < c; i++) {
			if (curso.equalsIgnoreCase(a[i].getCurso())) {
				System.out.println("En la asignatura " + a[i].getNombre() + " el porcentaje de aprobados es " + a[i].porcentajeAprobados() + "%");
				existe = true;
			}
		}

		if (!existe) {
			System.out.println("No hay asignaturas para este curso");
		}

	}


	//Caso 3
	public static void ordenar(Scanner teclado) {

		int asignaturaCount = 0;

		if (asignaturaCount >= 100) {
			System.out.println("No se pueden agregar más asignaturas. Límite alcanzado.");
			System.out.print("Introduce el nombre de la asignatura: ");
			boolean nombre = teclado.nextLine() != null;

			boolean nombreUnico = false;
			if (!nombreUnico) {
				System.out.println("El nombre de la asignatura ya existe. Introduce uno diferente.");
				System.out.print("Introduce el número de matriculados: ");
				int matriculados = teclado.nextInt();

				System.out.print("Introduce el número de suspensos: ");
				int suspensos = teclado.nextInt();
				if (suspensos > matriculados) {
					System.out.println("El número de suspensos no puede ser mayor que el número de matriculados.");

					for (int i = 0; i < asignaturaCount - 1; i++) {
						for (int j = 0; j < asignaturaCount - i - 1; j++) {
							Asignatura[] asignaturas = null;
							if (asignaturas[j].getAprobados() < asignaturas[j + 1].getAprobados()) {
								Asignatura temp = asignaturas[j];
								asignaturas[j] = asignaturas[j + 1];
								asignaturas[j + 1] = temp;
							}

						}
					}
				}
			}
		}
	}
	public static int buscarPorNombre(String nombre, Asignatura a[], int contador) {
		//busca la asignatura por nombre y devuelve su posición o -1 si no lo encuentra
		int posicion=-1; // -1 indicará que no existe esa asignatura
		for (int i=0; i<contador;i++) {
			if(nombre.equalsIgnoreCase(a[i].getNombre())) {
				posicion= i;
			}
		}
		return posicion;
	}

	//case 5
	public static int introducirAsignatura(Scanner teclado, int c, Asignatura a[]) {
		String respuesta = "si";
		String nombre;
		String curso;
		int matriculados;
		int suspensos;
		int pos;

		for(int i=c;i<a.length&&respuesta.equalsIgnoreCase("si");i++) {
			System.out.println("Nombre de la asignatura:");
			nombre= teclado.next();
			pos= buscarPorNombre(nombre,a,c);
			if (pos==-1) {
				System.out.println("Curso:");
				curso=teclado.next();
				do {
					System.out.println("Los alumnos matriculados tienen que ser mas o iguales que los suspensos.");
					System.out.println("Alumnos matriculados:");
					matriculados= teclado.nextInt();
					System.out.println("Alumnos suspensos:");
					suspensos= teclado.nextInt();
				}while(matriculados<suspensos);
				Asignatura a1 = new Asignatura(nombre, matriculados, suspensos);
				a[i]=a1;
				c++;

				do {
					System.out.print("Quiere añadir otra asignatura?: ");
					respuesta = teclado.next();

					if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
						System.out.println("Las opciones válidas son Si/No");
					}
				} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));

			}else {
				System.out.println("La asignatura ya existe");
			}

		}

		return c;
	}
	public static void main (String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		Asignatura[] a=new Asignatura[100];
		int numeroAsignaturas=1;
		
		Asignatura pgr=new Asignatura("pgr","1dami");
		a[0]=pgr;

		int opcion;
		do {
			opcion = menu(teclado);
			switch (opcion) 
			{
			case 1:
				introducir(teclado);
				break;

			case 2:
				mostrarPorcentaje(teclado, numeroAsignaturas, null);
				break;

			case 3:
				ordenar(teclado);
				break;

			case 4:
				
			//	buscarPorNombre(teclado,a,numeroAsignaturas);
				modificarDatos(teclado,a,numeroAsignaturas);
				//int posicion=buscarPorNombre("pgr",a,numeroAsignaturas);
				//System.out.println(posicion);
				break;


			case 5:
				introducirAsignatura(teclado, numeroAsignaturas, a);
				break;



			}
		}while(opcion!=7);	 
		teclado.close();
	}


public static void modificarDatos(Scanner teclado,Asignatura[] a,int numeroAsignaturas)
{
	/* Pediremos por pantalla el nombre la asignatura que queremos modificar 
	 * la busco, 
	 * si no existe le digo "no existe esa asignatura" 
	 * en caso contrario (else)  le daremos la opción de modificar el número de alumn@s 
	 * matriculados y/o el de suspensos.
*/
	
}
}

