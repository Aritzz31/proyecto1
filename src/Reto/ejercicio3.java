package Reto;

	import java.util.Scanner;

	public class ejercicio3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner teclado = new Scanner(System.in);
			int mon1 = 0, mon2 = 0, bille5 = 0, bille10 = 0, bille20 = 0, bille50 = 0, 
					bille100 = 0, bille200 = 0, bille500 = 0, numero;

			System.out.println("Introduce el numero que quieras calcular");
			numero = teclado.nextInt();

			do {
				// Si el numero es de al menos del tamano del billete
				if (numero > 499) {
					// Se suma un billete y se resta el precio de este
					bille500++;
					numero = numero - 500;
				}
				// Seguir mientras el numero sea de al menos del tamano del billete
			} while (numero > 499);

			do {
				if (numero > 199) {
					bille200++;
					numero = numero - 200;
				}

			} while (numero > 199);

			do {
				if (numero > 99) {
					bille100++;
					numero = numero - 100;
				}

			} while (numero > 99);

			do {
				if (numero > 49) {
					bille50++;
					numero = numero - 50;
				}

			} while (numero > 49);

			do {
				if (numero > 19) {
					bille20++;
					numero = numero - 20;
				}

			} while (numero > 19);

			do {
				if (numero > 9) {
					bille10++;
					numero = numero - 10;
				}

			} while (numero > 9);

			do {
				if (numero > 4) {
					bille5++;
					numero = numero - 5;
				}

			} while (numero > 4);

			do {
				if (numero > 1) {
					mon2++;
					numero = numero - 2;
				}

			} while (numero > 1);

			do {
				if (numero > 0.5) {
					mon1++;
					numero = numero - 1;
				}

			} while (numero > 0.5);

			// Mostramos la cantidad de billetes necesarios
			if (bille500 > 0) {
				System.out.println("Billetes de 500: " + bille500);
			}
			if (bille200 > 0) {
				System.out.println("Billetes de 200: " + bille200);
			}
			if (bille100 > 0) {
				System.out.println("Billetes de 100: " + bille100);
			}
			if (bille50 > 0) {

				System.out.println("Billetes de 50: " + bille50);
			}
			if (bille20 > 0) {

				System.out.println("Billetes de 20: " + bille20);

			}
			if (bille10 > 0) {

				System.out.println("Billetes de 10: " + bille10);
			}
			if (bille5 > 0) {
				System.out.println("Billetes de 5: " + bille5);

			}
			if (mon2 > 0) {
				System.out.println("Monedas de 2: " + mon2);
			}
			if (mon1 > 0) {

				System.out.println("Billetes de 1: " + mon1);
			}
			teclado.close();
		}

	}

