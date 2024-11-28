package proyecto1;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		// variables 
		int numero;
		String SoN;
		double resultado=0;
		int opcion1;
		String opcion2;
		
		//Menu
		System.out.println("Introduzca lo que desea realizar:");
		System.out.println("MENU principal:");
		System.out.println("1. Operaciones básicas");
		System.out.println("2. Operaciones complejas");
		System.out.println("3. Terminar programa");
		opcion1=teclado.nextInt();
		
		switch (opcion1) {
		
				case 1:
					System.out.println("a. Suma");
					System.out.println("b. Resta");
					System.out.println("c. Multiplicación");
					System.out.println("d. División");
					opcion2=teclado.next();
					
				switch(opcion2) {
					
					case "a":
						System.out.println("Introduce un numero:");
							numero=teclado.nextInt();
							resultado=numero+numero;
						System.out.println("Introduce el segundo numero:");
							numero=teclado.nextInt();
							resultado=numero+numero;
						}
		}
	}}
