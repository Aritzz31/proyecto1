package EjerciciosObjetos;
import java.util.Scanner;
public class MisionEspacial {

	private static final int MAX_Naves= 50;
	private NaveEspacial[] nave = new NaveEspacial[MAX_Naves];
	private static int contadorNaves = 0;
	private Scanner scanner = new Scanner(System.in);


	public void agregarNave() {
		NaveEspacial[] naves = new NaveEspacial[50];
		if (contadorNaves >= MAX_Naves) {
			System.out.println("No se pueden agregar mas Naves. Límite alcanzado.");
			return; 
		}
		System.out.print("Introduce el nombre de la nave: ");
		String Nombre = scanner.nextLine();
		System.out.print("Ingrese el año de creacion: ");
		int  AñoDecreacion=scanner.nextInt();
		System.out.print("Ingrese el año de lanzamiento: ");
		int  AñoDeLanzamiento=scanner.nextInt();
		System.out.print("Introduce la capacidad total de personas: ");
		int  CapacidadPersonas=scanner.nextInt();
		System.out.print("Ingrese el numero de tripulantes necesarios: ");
		int NumTripulantes=scanner.nextInt();


		if (AñoDecreacion > AñoDeLanzamiento) {
			System.out.println("Error:El año de lanzamiento no puede ser anterior al año de creacion");
			return; 
		}
		else
		{
			naves[contadorNaves ] = new NaveEspacial(Nombre, AñoDecreacion, AñoDeLanzamiento,CapacidadPersonas,NumTripulantes);
			contadorNaves++;
			System.out.println("Asignatura añadida correctamente.");
			System.out.print("¿Deseas añadir otra asignatura? (si/no): ");
			String respuesta = scanner.nextLine();
			if (!respuesta.equalsIgnoreCase("si")) 
			{
				System.out.println("nAsignaturas registradas:");
				for (int i1 = 0; i1 < contadorNaves; i1++) 
				{
					NaveEspacial nave = naves[i1];
					System.out.println("Nombre: " + nave.getNombre() + 
							", Año creacion " + nave.getAñoDecreacion() + 
							", Año lanzamiento " + nave.getAñoDeLanzamiento()+
							",Capacidad Personas " + nave.getCapacidadPersonas()+
							", NumTripulantes" + nave.getNumTripulantes());
				}
			}
		}
	}

	//Metodo 2
	public void mostrarNaves() {

	}
	//Metodo 3
	public void ordenarNaves(Scanner teclado) {
		int  contadorNaves= 0;
		if (contadorNaves >= 50) {
			System.out.println("No se pueden agregar más naves. Límite alcanzado.");
			System.out.print("Introduce el nombre de la asignatura: ");
			boolean año = teclado.nextLine() != null;
			for (int i = 0; i < contadorNaves - 1; i++) {
				for (int j = 0; j < contadorNaves - i - 1; j++) {
					NaveEspacial[] asignaturas = null;
					if (nave[j].getAñoDeLanzamiento() < nave[j + 1].getAñoDeLanzamiento()) {
						NaveEspacial temp = nave[j];
						nave[j] = nave[j + 1];
						nave[j + 1] = temp;

					}
				}
			}
		}
	}

	public  void mostrarTodasNaves() {
		if(contadorNaves==0) 
			System.out.println("No hay cuentas");
		for (int i=0;i<contadorNaves;i++) {
			nave[i].mostrar();
		}
	}
	public void eliminarNave(Scanner teclado) {
	}	




	public void menu() {
		int opcion;
		boolean continuar=true;
		do {
			System.out.println("--- MENU ---");
			System.out.println("1. Añadir naves espaciales");
			System.out.println("2.Mostrar naves cuya antiguedad sea superior a una dada");
			System.out.println("3. Ordenar naves por el año de lanzamiento");
			System.out.println("4. Modificar Capacidad total");
			System.out.println("5.Mostrar todas las naves espaciales registradas");
			System.out.println("6.Eliminar una nave espacial");
			System.out.println("7.Salir del programa");
			System.out.print("Elija una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch(opcion) {

			case 1:
				agregarNave();
				break;
			case 2:
				mostrarNaves();
				break;
			case 3:
				ordenarNaves(scanner);
				break;
			case 4:
				break;
			case 5:
				mostrarTodasNaves();
				break;
			case 6:
				eliminarNave(scanner);
			case 7:
				continuar=false;
				System.out.println("ADIOSSSSSSSS");

			}

		} while (opcion != 7);

	}
}
