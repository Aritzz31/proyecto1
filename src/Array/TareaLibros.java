package Array;
import java.util.Scanner;
public class TareaLibros {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//Variables
		int menu, precio=0, indiceEliminar=-1;
		String salir="no",libro,titulo2, tituloEliminar, titulo3;
		boolean encontrado=false;
		int contadorLibros=12;
		String nombresLibros[]=new String[20];
		boolean seguir=true;
		nombresLibros[0]="Nada";
		nombresLibros[1]="Tímidamente de la oscuridad a la luz";
		nombresLibros[2]="Pájaros a golpes";
		nombresLibros[3]="Caperucita Roja";
		nombresLibros[4]="12 cuentos clásicos";
		nombresLibros[5]="Pepe y Mila";
		nombresLibros[6]="Enojaos";
		nombresLibros[7]="En casa vacía";
		nombresLibros[8]="123";
		nombresLibros[9]="Día Negro";
		nombresLibros[10]="El Hobbit";
		nombresLibros[11]="Calle Judía";


		int precioLibros[]=new int[20];
		precioLibros[0]=15;
		precioLibros[1]=12;
		precioLibros[2]=15;
		precioLibros[3]=25;
		precioLibros[4]=19;
		precioLibros[5]=17;
		precioLibros[6]=25;
		precioLibros[7]=13;
		precioLibros[8]=11;
		precioLibros[9]=18;
		precioLibros[10]=25;
		precioLibros[11]=35;

		//menu
		do
		{
			System.out.println("Bienvenido");
			System.out.println("*****MENU*****");
			System.out.println("1.- Mostrar el título de todos los libros");
			System.out.println("2.- Mostrar el título y el precio de todos los libros");
			System.out.println("3.- Mostrar el precio de un libro");
			System.out.println("4- Introducir un nuevo libro");
			System.out.println("5.- Eliminar un libro");
			System.out.println("6.- Modificar el precio de un libro");
			System.out.println("7.- Modificar el título de un libro");
			System.out.println("8.- Salir del programa");
			menu=teclado.nextInt();

			switch(menu) {

			case 1:
				for(int i =0;i<contadorLibros;i++) 
					System.out.println(nombresLibros[i]);
				do {
					System.out.println("¿Quieres salir de la libreria?(SI/NO)");
					salir=teclado.next();
					if (!salir.equalsIgnoreCase("si")&& !salir.equalsIgnoreCase("no")) 
						System.out.println("La respuesta no puede ser diferente de si y no");


				}while(!salir.equalsIgnoreCase("si")&& !salir.equalsIgnoreCase("no"));


				if (salir.equalsIgnoreCase("si")) 
					seguir=false;


				break;	

			case 2:
				for(int i =0; i<contadorLibros;i++) {

					System.out.println("El precio de el libro \""+nombresLibros[i]+"\" es de:"+precioLibros[i]+"€");

				}
				System.out.println("¿Quieres salir de la libreria?(SI/NO)");
				salir=teclado.next();
				break;

			case 3:
				encontrado=false;
				System.out.println("¿De que libro quieres conocer el precio?");
				libro=teclado.next();
				for(int i=0;i<contadorLibros;i++) {
					if (libro.equalsIgnoreCase(nombresLibros[i])) {
						encontrado=true;
						System.out.println(precioLibros[i]+"€");
					}
				}
				if (!encontrado) {
					System.out.println("No tenemos ese libro");
				}
				do {
					System.out.println("¿Quieres salir de la libreria?(SI/NO)");
					salir=teclado.next();
					if (!salir.equalsIgnoreCase("si")&& !salir.equalsIgnoreCase("no")) 
						System.out.println("La respuesta no puede ser diferente de si y no");


				}while(!salir.equalsIgnoreCase("si")&& !salir.equalsIgnoreCase("no"));


				if (salir.equalsIgnoreCase("si")) 
					seguir=false;


				break;

			case 4:
				if (contadorLibros==20) {
					System.out.println("Lo siento. La librería está llena.");
				}
				else {	
					System.out.print("¿Cuál es el título del libro? ");
					teclado.nextLine();
					titulo2=teclado.nextLine();
					System.out.print("¿Cuál es el precio? ");
					precioLibros[contadorLibros]=teclado.nextInt();
					nombresLibros[contadorLibros]=titulo2;
					precioLibros[contadorLibros]=precio;
					contadorLibros++;
					System.out.println("El libro ha sido guardado.");
				} 
				do {
					System.out.println("¿Quieres salir de la libreria?(SI/NO)");
					salir=teclado.next();
					if (!salir.equalsIgnoreCase("si")&& !salir.equalsIgnoreCase("no")) {
						System.out.println("La respuesta no puede ser diferente de si y no");
					}
				}while(!salir.equalsIgnoreCase("si")&& !salir.equalsIgnoreCase("no"));

				if (salir.equalsIgnoreCase("si")) {
					System.out.println("Adios");
				}
				break;

			case 5:
				encontrado=false;
				System.out.println("¿Cuál es el título del libro que deseas eliminar?");
				teclado.nextLine();
				tituloEliminar=teclado.nextLine();
				for (int i=0;i<contadorLibros&&encontrado==false;i++) {
					if (tituloEliminar.equalsIgnoreCase(nombresLibros[i])) 
					{
						encontrado=true;
						for(int contador=i;contador<contadorLibros;contador++)
						{
							nombresLibros[contador]=nombresLibros[contador+1];
							precioLibros[contador]=precioLibros[contador+1];
						}
					}
				}
				if (!encontrado)
					System.out.println("No existe ese libro");
				do {
					System.out.println("¿Quieres salir de la libreria?(SI/NO)");
					salir=teclado.next();
					if (!salir.equalsIgnoreCase("si")&& !salir.equalsIgnoreCase("no")) {
						System.out.println("La respuesta no puede ser diferente de si y no");
					}
				}while(!salir.equalsIgnoreCase("si")&& !salir.equalsIgnoreCase("no"));

				if (salir.equalsIgnoreCase("si")) {
					System.out.println("Chaoooo");
				}								


				break;	

			case 6:	
				encontrado=false;
				System.out.println("¿Cuál es el título del libro?");
				teclado.nextLine();
				titulo3=teclado.nextLine();
				for(int i=0;i<contadorLibros;i++) {
					if (titulo3.equalsIgnoreCase(nombresLibros[i])) {
						encontrado=true;
						System.out.println("El precio del libro "+nombresLibros[i]+" es de "+precioLibros[i]+" euros");
						System.out.println("¿Cuál es el nuevo precio?");
						precio=teclado.nextInt();
						precioLibros[i] = precio;
						System.out.println("El precio ha sido cambiado");
						System.out.println("El nuevo precio de "+nombresLibros[i]+" es de "+precioLibros[i]+" euros");
						{
							break;
						}
					}
				}


				


			case 8:
				System.out.println("Adios");
				seguir=false;
				break;
			default:
				System.out.println("Esa opicion no existe");

				break;
			}
		}while(seguir);
	}
}


