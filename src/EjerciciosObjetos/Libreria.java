package EjerciciosObjetos;

import java.util.Scanner;

public class Libreria {
    private static final int MAX_LIBROS = 250;
    private Libro[] libros = new Libro[MAX_LIBROS];
    private int contadorLibros = 0;
    private Scanner scanner = new Scanner(System.in);

   
    public void agregarLibro() {
        if (contadorLibros >= MAX_LIBROS) {
            System.out.println("No se pueden agregar más libros. Límite alcanzado.");
            return;
        }

        System.out.print("Ingrese el ISBN del libro: ");
        String isbn = scanner.nextLine();
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de ejemplares vendidos: ");
        int ejemplaresVendidos = scanner.nextInt();
        System.out.print("Ingrese el precio del libro: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); 

        libros[contadorLibros++] = new Libro(isbn, titulo, autor, ejemplaresVendidos, precio);
        System.out.println("Libro agregado correctamente.");
    }

    
    public void mostrarLibrosPorAutor() {
        if (contadorLibros == 0) {
            System.out.println("No hay libros introducidos.");
            return;
        }

        System.out.print("Ingrese el nombre del autor: ");
        String autorBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i].getAutor().equalsIgnoreCase(autorBuscado)) {
                encontrado = true;
                System.out.println(libros[i]);
                System.out.println("Beneficio total: " + libros[i].obtenerBeneficioTotal() + " €");
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros para el autor ingresado.");
        }
    }

    
    public void mostrarLibrosSuperVentas() {
        if (contadorLibros == 0) {
            System.out.println("No hay libros introducidos.");
            return;
        }

        Libro[] superVentas = new Libro[contadorLibros];
        int superVentasCount = 0;

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i].esSuperVentas()) {
                superVentas[superVentasCount++] = libros[i];
            }
        }

       
        for (int i = 0; i < superVentasCount - 1; i++) {
            for (int j = i + 1; j < superVentasCount; j++) {
                if (superVentas[i].getEjemplaresVendidos() < superVentas[j].getEjemplaresVendidos()) {
                    Libro temp = superVentas[i];
                    superVentas[i] = superVentas[j];
                    superVentas[j] = temp;
                }
            }
        }

        System.out.println("Libros SuperVentas:");
        for (int i = 0; i < superVentasCount; i++) {
            System.out.println(superVentas[i]);
        }
    }

    
    public void eliminarLibro() {
        if (contadorLibros == 0) {
            System.out.println("No hay libros introducidos.");
            return;
        }

        System.out.print("Ingrese el ISBN del libro a eliminar: ");
        String isbnBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i].getISBN().equalsIgnoreCase(isbnBuscado)) {
                encontrado = true;
                System.out.print("¿Está seguro de que desea eliminar este libro? (s/n): ");
                String confirmacion = scanner.nextLine();
                if (confirmacion.equalsIgnoreCase("s")) {
                    for (int j = i; j < contadorLibros - 1; j++) {
                        libros[j] = libros[j + 1];
                    }
                    libros[--contadorLibros] = null;
                    System.out.println("Libro eliminado.");
                } else {
                    System.out.println("Eliminación cancelada.");
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el libro con el ISBN proporcionado.");
        }
    }

   
    public void mostrarTodosLosLibros() {
        if (contadorLibros == 0) {
            System.out.println("No hay libros introducidos.");
            return;
        }

        System.out.println("Lista de todos los libros:");
        for (int i = 0; i < contadorLibros; i++) {
            System.out.println(libros[i]);
        }
    }

  
    public void menu() {
        int opcion;

        do {
            System.out.println("\n--- Menú de la Librería ---");
            System.out.println("1. Introducir un libro");
            System.out.println("2. Mostrar los libros de un autor");
            System.out.println("3. Ordenar y mostrar libros SuperVentas");
            System.out.println("4. Eliminar un libro concreto");
            System.out.println("5. Mostrar todos los libros");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 :
                agregarLibro();
                break;
                case 2 :
                mostrarLibrosPorAutor();
                break;
                case 3 :
                mostrarLibrosSuperVentas();
                break;
                case 4 :
                eliminarLibro();
                break;
                case 5 :
                	mostrarTodosLosLibros();
                	break;
                case 6 :
                	System.out.println("Saliendo del programa...");
                	break;
                default :
                System.out.println("Opción no válida. Intente nuevamente.");
                
            }
        } while (opcion != 6);
    }

    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        libreria.menu();
    }
}
