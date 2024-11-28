package PostExamen;

import java.util.Scanner;

public class VehiculoMain {
	private static void mostrarMenu() {
		System.out.println("\n--- Menú de gestión de vehículos---");
		System.out.println("1. Introducir un nuevo vehículo");
		System.out.println("2. Listar los datos de los coches que sean descapotables");
		System.out.println("3. Pedir una tara al usuario y listar las furgonetas con una tara menor a la introducida");
		System.out.println("4. Pedir una nueva carga y modificarla para todas las furgonetas");
		System.out.println("5. Mostrar los datos de la furgoneta más antigua y más nueva");
		System.out.println("6. Mostrar la antigüedad media de los coches, de las furgonetas y de los vehículos");
		System.out.println("7. Ordenar el listado de furgonetas por tara y mostrarlo ");
		System.out.println("8. Listar todos los vehículos ordenados por matrícula");
		System.out.println("9. Introducir una matrícula y borrar dicho vehículo");
		System.out.println("10. Salir");
		System.out.println("Seleccione una opción: ");
	}

	private static void introducirNuevoVehiculo(Vehiculoo[] listaCoches, Furgoneta[] listaFurgonetas,
			int contadorCoches, int contadorFurgonetas, Scanner teclado) {
		System.out.println("¿Qué tipo de vehículo deseas introducir?");
		System.out.println("1. Coche");
		System.out.println("2. Furgoneta");
		int tipoVehiculo = teclado.nextInt();
		teclado.nextLine();  

		if (tipoVehiculo == 1) {
			if (Vehiculos.getContador() < listaCoches.length) {
				System.out.print("Introduce la matrícula del coche: ");
				String matricula = teclado.nextLine();
				System.out.print("Introduce la marca del coche: ");
				String marca = teclado.nextLine();
				System.out.print("Introduce el modelo del coche: ");
				String modelo = teclado.nextLine();
				System.out.print("Introduce los años de antigüedad del coche: ");
				int añosAntigüedad = teclado.nextInt();
				System.out.print("Introduce el precio del coche: ");
				int precio = teclado.nextInt();
				teclado.nextLine();

				System.out.print("¿Es un coche descapotable? (true/false): ");
				boolean descapotable = teclado.nextBoolean();
				teclado.nextLine();

				Coches nuevoCoche = new Coches(matricula, marca, modelo, añosAntigüedad, precio, descapotable);
				listaCoches[contadorCoches] = nuevoCoche;
				Vehiculos.setContador(Vehiculos.getContador()+1);

				System.out.println("Coche añadido correctamente.");
			} else {
				System.out.println("No hay espacio para más coches.");
			}

		}

		else if (tipoVehiculo == 2) {
			if (Vehiculos.getContador() < listaCoches.length) {
				System.out.print("Introduce la matrícula de la furgoneta: ");
				String matricula = teclado.nextLine();
				System.out.print("Introduce la marca de la furgoneta: ");
				String marca = teclado.nextLine();
				System.out.print("Introduce el modelo de la furgoneta: ");
				String modelo = teclado.nextLine();
				System.out.print("Introduce los años de antigüedad de la furgoneta: ");
				int añosAntigüedad = teclado.nextInt();
				System.out.print("Introduce el precio de la furgoneta: ");
				int precio = teclado.nextInt();
				System.out.print("Introduce la altura de la furgoneta (en metros): ");
				int alto = teclado.nextInt();
				System.out.print("Introduce la tara de la furgoneta (en kg): ");
				int tara = teclado.nextInt();
				System.out.print("Introduce la carga de la furgoneta (en kg): ");
				int carga = teclado.nextInt();
				teclado.nextLine();

				Furgoneta nuevaFurgoneta = new Furgoneta(matricula, marca, modelo, añosAntigüedad, precio, alto, tara, carga);
				listaCoches[contadorFurgonetas] = nuevaFurgoneta;
				Vehiculos.setContador(Vehiculos.getContador()+1);

				System.out.println("Furgoneta añadida correctamente.");
			} else {
				System.out.println("No hay espacio para más furgonetas.");
			}
		}
		else {
			System.out.println("Opción no válida. Por favor, selecciona 1 para coche o 2 para furgoneta.");
		}
	}

	private static void listarCochesDescapotables(Vehiculos[] vehiculos) {
		System.out.println("Coches descapotables:");
		boolean hayDescapotables = false;
		for (Vehiculos vehiculo : vehiculos) {
			if (vehiculo instanceof Coches) {
				Coches coche = (Coches) vehiculo;
				if (coche.getDescapotable()) {
					System.out.println(coche);
					hayDescapotables = true;
				}
			}
		}
		if (!hayDescapotables) {
			System.out.println("No se encontraron coches descapotables.");
		}
	}

	private static void listarFurgonetasPorTara(Furgoneta[] listaFurgonetas, int contadorFurgonetas, Scanner teclado) {
		System.out.print("Introduce una tara para filtrar las furgonetas: ");
		int taraIntroducida = teclado.nextInt();
		teclado.nextLine();

		boolean hayFurgonetas = false;

		for (int i = 0; i < contadorFurgonetas; i++) {
			Furgoneta furgoneta = listaFurgonetas[i];

			if (furgoneta.getTara() < taraIntroducida) {
				System.out.println(furgoneta.toString());
				hayFurgonetas = true;
			}
		}

		if (!hayFurgonetas) {
			System.out.println("No se encontraron furgonetas con una tara menor a " + taraIntroducida);
		}
	}
	private static void modificarCargaFurgonetas(Furgoneta[] listaFurgonetas, int contadorFurgonetas, Scanner teclado) {
		System.out.print("Introduce la nueva carga para todas las furgonetas (en kg): ");
		int nuevaCarga = teclado.nextInt();
		teclado.nextLine();

		for (int i = 0; i < contadorFurgonetas; i++) {
			listaFurgonetas[i].setCarga(nuevaCarga);
		}

		System.out.println("La carga ha sido actualizada para todas las furgonetas.");
	}
	private static void mostrarFurgonetaMasAntiguaYMasNueva(Furgoneta[] listaFurgonetas, int contadorFurgonetas) {
		if (contadorFurgonetas == 0) {
			System.out.println("No hay furgonetas en el sistema.");
			return;
		}
		Furgoneta furgonetaMasAntigua = listaFurgonetas[0];
		Furgoneta furgonetaMasNueva = listaFurgonetas[0];
		for (int i = 1; i < contadorFurgonetas; i++) {
			if (listaFurgonetas[i].getAñosantigüedad() > furgonetaMasAntigua.getAñosantigüedad()) {
				furgonetaMasAntigua = listaFurgonetas[i];
			}
			if (listaFurgonetas[i].getAñosantigüedad() < furgonetaMasNueva.getAñosantigüedad()) {
				furgonetaMasNueva = listaFurgonetas[i];
			}
		}
		System.out.println("Furgoneta más antigua: " + furgonetaMasAntigua);
		System.out.println("Furgoneta más nueva: " + furgonetaMasNueva);
	}

	private static void mostrarAntigüedadMedia(Vehiculoo[] listaCoches, int contadorCoches, Furgoneta[] listaFurgonetas, int contadorFurgonetas) {
		int sumaAntigüedadCoches = 0;
		int sumaAntigüedadFurgonetas = 0;
		int sumaAntigüedadTotal = 0;

		for (int i = 0; i < contadorCoches; i++) {
			sumaAntigüedadCoches += listaCoches[i].getAñosantigüedad();
		}
		for (int i = 0; i < contadorFurgonetas; i++) {
			sumaAntigüedadFurgonetas += listaFurgonetas[i].getAñosantigüedad();
		}
		sumaAntigüedadTotal = sumaAntigüedadCoches + sumaAntigüedadFurgonetas;
		int totalVehiculos = contadorCoches + contadorFurgonetas;
		if (contadorCoches > 0) {
			System.out.println("Antigüedad media de los coches: " + (double) sumaAntigüedadCoches / contadorCoches);
		} else {
			System.out.println("No hay coches para calcular la antigüedad media.");
		}

		if (contadorFurgonetas > 0) {
			System.out.println("Antigüedad media de las furgonetas: " + (double) sumaAntigüedadFurgonetas / contadorFurgonetas);
		} else {
			System.out.println("No hay furgonetas para calcular la antigüedad media.");
		}

		if (totalVehiculos > 0) {
			System.out.println("Antigüedad media de todos los vehículos: " + (double) sumaAntigüedadTotal / totalVehiculos);
		} else {
			System.out.println("No hay vehículos para calcular la antigüedad media.");
		}
	}

	private static void listarVehiculosOrdenadosPorMatricula(Vehiculoo[] listaCoches, int contadorCoches, Furgoneta[] listaFurgonetas, int contadorFurgonetas) {
		int totalVehiculos = contadorCoches + contadorFurgonetas;

		Vehiculoo[] todosVehiculos = new Vehiculoo[totalVehiculos];

		for (int i = 0; i < contadorCoches; i++) {
			todosVehiculos[i] = listaCoches[i];
		}
		for (int i = 0; i < contadorFurgonetas; i++) {
			todosVehiculos[contadorCoches + i] = listaFurgonetas[i];
		}
		for (int i = 0; i < totalVehiculos - 1; i++) {
			for (int j = 0; j < totalVehiculos - 1 - i; j++) {
				if (todosVehiculos[j].getMatricula().compareTo(todosVehiculos[j + 1].getMatricula()) > 0) {
					Vehiculoo temp = todosVehiculos[j];
					todosVehiculos[j] = todosVehiculos[j + 1];
					todosVehiculos[j + 1] = temp;
				}
			}
		}
		System.out.println("\nListado de vehículos ordenados por matrícula:");
		for (int i = 0; i < totalVehiculos; i++) {
			System.out.println(todosVehiculos[i].toString());
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion;
		int contadorCoches = 0;
		int contadorFurgonetas = 0;
		Vehiculoo[] listaCoches = new Vehiculoo[10];  

		do {
			mostrarMenu();
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				introducirNuevoVehiculo(listaCoches, null, contadorCoches, contadorFurgonetas, teclado);
				break;
			case 2:
				break;
			case 3:
				listarFurgonetasPorTara(null, contadorFurgonetas, teclado);
				break;
			case 4:
				modificarCargaFurgonetas(null, contadorFurgonetas, teclado);
				break;
			case 5:
				mostrarFurgonetaMasAntiguaYMasNueva(null, contadorFurgonetas);

				break;
			case 6:
				mostrarAntigüedadMedia(listaCoches, contadorCoches, null, contadorFurgonetas);
				break;
			case 7:

				break;
			case 8:
				listarVehiculosOrdenadosPorMatricula(listaCoches, contadorCoches, null, contadorFurgonetas);
				break;
			case 9:

			case 10:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida, por favor seleccione una opción válida.");
				break;
			}
		} while (opcion != 10);
	}
}

