package EjerciciosObjetos;

import java.util.Scanner;

public class EJERCICIO3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int menu;
		boolean seguir=true;
		String salir="no";
		do
		{
			System.out.println("Bienvenido");
			System.out.println("*****MENU*****");
			System.out.println("1. Introducir las personas (pedimos los datos de TODAS las personas y los almacenamos para usos posteriores).");
			System.out.println("2. Muestra la persona de mayor edad.");
			System.out.println("3. Muestra la información de una persona tras introducir su DNI");
			System.out.println("4. Muestra la información de todas las personas.");
			System.out.println("5. Salir");
		
			menu=teclado.nextInt();

			switch(menu) {
		case 1: 
		
				seguir=false;
			break;
		}
}while(seguir);
}
}
