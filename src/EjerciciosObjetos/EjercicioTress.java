package EjerciciosObjetos;
import java.util.Scanner;
public class EjercicioTress {

	//Primer metodo
	public static void IntroducirPersonar(Scanner teclado,Persona[]personas) {
	
		for(int i=0;i<personas.length;i++) {

		System.out.println("Introduzca el nombre que desee:");
		String nombre=teclado.next();
		personas[i]=new Persona();
		personas[i].setNombre(nombre);System.out.println("Introduzca la edad:");
		int edad=teclado.nextInt();
		personas[i]=new Persona();
		personas[i].setNombre(edad);
}
	}
	//Seguno metodo

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner teclado = new Scanner(System.in);
			int menu;
			boolean seguir=true;
			String salir="no";
			
			 Persona[] personas = new Persona[10];
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
					IntroducirPersonar(teclado,personas);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5: 
			
					seguir=false;
				break;
			}
	}while(seguir);
	}
	}


