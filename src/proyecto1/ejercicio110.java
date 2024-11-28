package proyecto1;
import java.util.Scanner;
public class ejercicio110 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Operacion
		System.out.print("Introduce el numero que desee:");
		int numero=teclado.nextInt();
		
		while(numero >= 1) {
			System.out.println(numero);
			numero--;
		}
		while (numero <= -1) {
			System.out.println(numero);
			numero++;
		
		}
		teclado.close();
	
	
	
	}
}
