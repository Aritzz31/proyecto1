package Array;

import java.util.Scanner;

public class ejerciciometodos {

	// METODO PARA AÑADIR
	public static void añadirArticulo(Scanner teclado, String articulos[], double[] precios) {
		int contador = 0;

		if (contador >= articulos.length) {
			System.out.println("No se pueden añadir más artículos. El inventario está lleno.");
			return;

		}
		System.out.print("Introduzca el nombre del artículo: ");
		teclado.nextLine();
		String nombre = teclado.nextLine();
		System.out.print("Introduzca el precio del artículo: ");
		double precio = teclado.nextDouble();

		articulos[contador] = nombre;
		precios[contador] = precio;
		contador++;

		if (contador == 9) {
			System.out.println("No hay artículos en la tienda.\n");
		} else {
			System.out.println("Lista de artículos en la tienda:");
			for (int i = 0; i < contador; i++) {
				System.out.println(articulos[i] + " - " + precios[i] + " €");
			}
		}
	}

	// Método para mostrar los artículos
	public static void mostrarArticulos(Scanner teclado, String articulos[], double[] precios) {
		int contador = 9;
		for (int i = 0; i < contador; i++) {

			System.out.println("El precio del \"" + articulos[i] + "\" es de:" + precios[i] + "€");
		}
	}

	// Metodo para el precio de un producto
	public static void mostrarPrecio(Scanner teclado, String articulos[], double[] precios) {
		String nombre;
		double precio = 9;
		int contador = 9;
		boolean encontrado = false;

		encontrado = false;
		System.out.println("¿De que articulo quieres conocer el precio?");
		nombre = teclado.next();
		for (int i = 0; i < contador; i++) {
			if (nombre.equalsIgnoreCase(articulos[i])) {
				encontrado = true;
				System.out.println(precios[i] + "€");
			}
		}
	}
	// Metodo de el IVA

	// Metodo de modificacion
	public static void modificar(Scanner teclado, String articulos[], double[] precios) {
		boolean encontrado = false;
		String modificarArt;
		int contador = 9;
		int precioNuevo;

		encontrado = false;
		System.out.println("¿Cuál es el producto?");
		teclado.nextLine();
		modificarArt = teclado.nextLine();
		for (int i = 0; i < contador; i++) {
			if (modificarArt.equalsIgnoreCase(articulos[i])) {
				encontrado = true;
				System.out.println("El precio del articulo " + articulos[i] + " es de " + precios[i] + " euros");
				System.out.println("¿Cuál es el nuevo precio?");
				precioNuevo = teclado.nextInt();
				precios[i] = precioNuevo;
				System.out.println("El precio ha sido cambiado");
				System.out.println("El nuevo precio de " + articulos[i] + " es de " + precios[i] + " euros");
			}

		}
	}

	// Metodo de eliminacion
	public static void eliminar(Scanner teclado, String articulos[], double[] precios) {
		String eliminarArticulo;
		boolean encontrado = false;
		int contadorProductos = 9;
		encontrado = false;
		System.out.println("¿Cuál es el articulo que deseas eliminar?");
		teclado.nextLine();
		eliminarArticulo = teclado.nextLine();
		for (int i = 0; i < contadorProductos && encontrado == false; i++) {
			if (eliminarArticulo.equalsIgnoreCase(articulos[i])) {
				encontrado = true;
				for (int contador = i; contador < contadorProductos; contador++) {
					articulos[contador] = articulos[contador + 1];

				}
			}
		}
		if (!encontrado)
			System.out.println("No existe ese articulo");
	}

	// Metodo de ordenar
	public static void ordenar(String[] articulos, double[] precios) {
        int n = articulos.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Manejar los null: Si encontramos un null, lo movemos hacia el final
                if (precios[j] == 0 || articulos[j] == null) {
                    continue;  // Ignoramos este elemento porque ya es "nulo"
                }

                // Si el siguiente es null, intercambiamos para moverlo al final
                if (articulos[j + 1] == null || precios[j + 1] == 0) {
                    // Intercambiar precios
                    double tempPrecio = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = tempPrecio;

                    // Intercambiar productos
                    String tempProd = articulos[j];
                    articulos[j] =articulos[j + 1];
                    articulos[j + 1] = tempProd;

                    swapped = true;
                }
                // Ordenar normalmente cuando no hay null
                else if (precios[j] > precios[j + 1]) {
                    // Intercambiar precios
                    double tempPrecio = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = tempPrecio;

                    // Intercambiar productos
                    String tempProd = articulos[j];
                    articulos[j] = articulos[j + 1];
                    articulos[j + 1] = tempProd;

                    swapped = true;
                }
            } 

            // Si no hubo intercambios, entonces la lista ya está ordenada
            
        }
	}
	
	// Metodo ordenar de mayor a menor		
	public static void ordenar2(String[] articulos, double[] precios) {
		int n = articulos.length;
		
	}
	
	
	
	// Salir
	public static void salir(Scanner teclado, String articulos[], double[] precios) {
		System.out.println("Hasta prontooo!!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int menu = 0;
		
		String articulos[] = new String[9];
		articulos[0] = "Secador";
		articulos[1] = "Balon";
		articulos[2] = "Estuche";
		articulos[3] = "Toalla";
		articulos[4] = "Botas";
		articulos[5] = "Camiseta";
		articulos[6] = "Sudadera";
		articulos[7] = "Vela";
		articulos[8] = "Libro";

		double[] precios = new double[9];
		precios[0] = 29.99;
		precios[1] = 25.99;
		precios[2] = 9.99;
		precios[3] = 19.99;
		precios[4] = 23.99;
		precios[5] = 35.99;
		precios[6] = 39.99;
		precios[7] = 3.99;
		precios[8] = 29.99;

		do {
			do {
				System.out.println("***********************************************");
				System.out.println("1.- Añadir artículos y precios");
				System.out.println("2.- Mostrar productos de la tienda");
				System.out.println("3.- Obtener el precio de un producto");
				System.out.println("4.- Obtener el IVA de un producto");
				System.out.println("5.- Modificar el precio de un producto");
				System.out.println("6.- Eliminar un producto");
				System.out.println("7.- Ordenar");
				System.out.println("8.- salir");
				System.out.println("¿Que quieres hacer?");
				menu = teclado.nextInt();

			} while (menu < 1 || menu > 8);

		} while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6 && menu != 7 && menu != 8);

		switch (menu) {

		case 1:
			añadirArticulo(teclado, articulos, precios);
			break;

		case 2:
			mostrarArticulos(teclado, articulos, precios);
			break;

		case 3:
			mostrarPrecio(teclado, articulos, precios);
			break;

		case 4:
			break;

		case 5:
			modificar(teclado, articulos, precios);
			break;

		case 6:
			eliminar(teclado, articulos, precios);
			break;

		case 7:
			ordenar(articulos, precios);
			break;

		case 8:
			salir(teclado, articulos, precios);
			break;

		}

	}

	{

	}
}
