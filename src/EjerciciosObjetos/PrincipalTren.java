package EjerciciosObjetos;

import java.util.Scanner;

public class PrincipalTren {

	//metodo 1
	private static final int MAX_TRENES = 20;
	public static void introducir(Scanner teclado, Tren a[], int contador) {
		String respuesta="";
		if (contador>a.length) {
			System.out.println("Error. No puedes introducir más trenes ");
		}else {
			for (int i = contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
				Tren c1=new Tren();
				a[i]=c1;
				System.out.println("Que tren desea introducir?");
				a[i].setTren(teclado.next());
				contador++;
				do {
					System.out.print("Quiere añadir otro Tren? ");
					respuesta = teclado.next();

					if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
						System.out.println("Las opciones válidas son Si/No");
					}
				} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
			}
		}
		return ;


	}


	//Metodo 2
	public static void mostrarTrenesSuperenVelocidad(Scanner teclado,Tren[]misTrenes,int numeroTrenes) {

		double velocidad=-1;
		if(numeroTrenes==0)
			System.out.println("No hay trenes");

		else
		{
			boolean numeroValido=false;
			while(numeroValido==false);
		}
		System.out.println("Dame velocidad");
		velocidad=teclado.nextDouble();
	}

	//Metodo 3
	public static void duracionViaje(Scanner teclado) {

		Tren[] trenes = {
				new Tren(),
				new Tren(),
				new Tren(),
				new Tren(),
				new Tren()
		};
		int contadorCercanias = 0;
		for (Tren tren : trenes) {
			if (tren.getTipo().equalsIgnoreCase("Cercanías")) {
				contadorCercanias++;
			}
		}
		Tren[] trenesCercanias = new Tren[contadorCercanias];
		int contador = 0;
		for (Tren tren : trenes) {
			if (tren.getTipo().equalsIgnoreCase("Cercanías")) {
				trenesCercanias[contador] = tren;
				contador++;
			}
		}
		for (int i = 0; i < trenesCercanias.length - 1; i++) {
			for (int j = 0; j < trenesCercanias.length - 1 - i; j++) {
				if (trenesCercanias[j].getDuracionViaje() > trenesCercanias[j + 1].getDuracionViaje()) {
				}
			}
		}
		System.out.println("TRENES DE CERCANÍAS ORDENADOS POR DURACIÓN:");
		for (Tren tren : trenesCercanias) {
			System.out.println(tren);
		}
		return;
	}

	//metodo 5
	Tren[] treness = {
			new Tren("TREN001", "Cercanías", 40, 100, 60),
			new Tren("TREN002", "Larga Distancia", 180, 200, 150),
			new Tren("TREN003", "Cercanías", 25, 80, 40),
			new Tren("TREN004", "Media Distancia", 120, 150, 100),
			new Tren("TREN005", "Cercanías", 30, 90, 30)
	};
	public static void mostrarTrenesCercaniasOrdenados(Tren[] trenes) {
		// Contar cuántos trenes de Cercanías hay para crear un array de ese tamaño
		int contadorCercanias = 0;
		for (Tren tren : trenes) {
			if (tren.getTipo().equalsIgnoreCase("Cercanías")) {
				contadorCercanias++;
			}
		}

		// Crear un array para los trenes de Cercanías
		Tren[] trenesCercanias = new Tren[contadorCercanias];
		int index = 0;
		for (Tren tren : trenes) {
			if (tren.getTipo().equalsIgnoreCase("Cercanías")) {
				trenesCercanias[index] = tren;
				index++;
			}
		}

		// Ordenar los trenes de Cercanías por duración usando el método de burbuja
		for (int i = 0; i < trenesCercanias.length - 1; i++) {
			for (int j = 0; j < trenesCercanias.length - 1 - i; j++) {
				if (trenesCercanias[j].getDuracionViaje() > trenesCercanias[j + 1].getDuracionViaje()) {
					// Intercambiar si están en el orden incorrecto
					Tren temp = trenesCercanias[j];
					trenesCercanias[j] = trenesCercanias[j + 1];
					trenesCercanias[j + 1] = temp;
				}
			}
		}

		// Mostrar los trenes de Cercanías ordenados por duración
		System.out.println("TRENES DE CERCANÍAS ORDENADOS POR DURACIÓN:");
		for (Tren tren : trenesCercanias) {
			System.out.println(tren);
		}
	}







	public static int menu(Scanner teclado){

		System.out.println("1. Introducir los trenes.");
		System.out.println("2. Mostrar los trenes que superen una velocidad dada.");
		System.out.println("3. Ordenar los trenes de cercanías por duración del viaje.");
		System.out.println("4. Reserva de asientos.");
		System.out.println("5. Mostrar todos los trenes que se han introducido.");
		System.out.println("6.Salir");
		System.out.println("Introduce opcion");
		int mennu= teclado.nextInt();
		teclado.nextLine();
		return mennu;
	}
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Tren trenes[]=new Tren[MAX_TRENES];
		final int MAXCAPACIDAD=400;
		boolean continuar=true;

		while (continuar)
		{
			int menu=menu(teclado);

			switch(menu) {

			case 1:
				introducir(teclado, trenes, menu);
				break;
			case 2:
				mostrarTrenesSuperenVelocidad(teclado,trenes,menu);
				break;
			case 3:
				duracionViaje(teclado);
				break;
			case 5:
				mostrarTrenesCercaniasOrdenados(trenes);

			}
		}
	}
}


