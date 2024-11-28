package Array;
import java.util.Scanner;
public class metodosEstaticos {

	//Metodo para la opcion A
	public static void opcionA(Scanner teclado) {
		 String nombre,nombreMayus;
		
		System.out.print("Introduce tu nombre: ");
		teclado.nextLine();
        nombre = teclado.nextLine();
        nombreMayus = nombre.toUpperCase();
        
        int[] numeros = new int[10];
        numeros[0]=387;
        numeros[1]=227;
        numeros[2]=24;
        numeros[3]=110;
        numeros[4]=395;
        numeros[5]=83;
        numeros[6]=204;
        numeros[7]=154;
        numeros[8]=26;
        numeros[9]=108;
        
        int[] numerosDoblados=new int[numeros.length];
        for(int i=0;i<numeros.length;i++) {
			numerosDoblados[i]=numeros[i]*2;
        }
        
        System.out.println("Nombre en mayúsculas: " + nombreMayus);
        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nArray con valores doblados:");
        for (int num : numerosDoblados) {
            System.out.print(num + " ");
        }

	}
	
	
	//Metodo para la opcion B
	public static void opcionB(Scanner teclado) {
		int cantidadPositivos = 0;
		int sumaPositivos = 0;
		String continuar = null;
		do {
			System.out.print("Introduce un número (positivo o negativo): ");
			int numero = teclado.nextInt();

			if (numero >= 0) {
				for (int i = 0; i < numero; i++) {
					System.out.print("*");
				}
				System.out.println();
				cantidadPositivos++;
				sumaPositivos = sumaPositivos+ numero;
			} else {

				System.out.println("?");

			}
			do {
				System.out.print("¿Quieres continuar introduciendo números? (S/s --> SI, N/n --> NO): ");
				continuar = teclado.next();


				if (!continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("N")) {
					System.out.println("Por favor, introduce una opción válida (S/s/N/n).");
				}
			} while (!continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("N"));

		} while (continuar.equalsIgnoreCase("S")); 
		
		 
			double media = (double) sumaPositivos / cantidadPositivos;
			System.out.println("Has introducido " + cantidadPositivos + " números positivos.");
			System.out.println("La media de los positivos es: " + media);
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int menu;
		
		System.out.println("***********************************************");
		System.out.println("1)--->Opcion A");
		System.out.println("2)--->Opcion B");
		System.out.println("3)--->Opcion C");
		System.out.println("Elija  una opcion de las anteriores posibles");
		menu=teclado.nextInt();
		
		switch (menu) {
		
		case 1:
			opcionA(teclado);
			break;
		
		case 2:
			opcionB(teclado);
			break;
		}
}
	}
