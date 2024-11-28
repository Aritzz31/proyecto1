package proyecto1;
import java.util.Scanner;
public class Ejercicio111 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Variable
		int numero=0;
		int suma=0;
		int contador=1;
		
		do {
			suma += contador;
			contador++;
		} while (contador<=numero);
           System.out.print("Introduce un numero:");
			numero=teclado.nextInt();
			System.out.print("la suma de los numero hasta el "+ numero + (" es:")+ suma);
			
			teclado.close();
	}
		

}

