package proyecto1;
import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	
		int NumeroA;
		int NumeroB;
		
		System.out.print("Introduzca el primer numero:");
		NumeroA=teclado.nextInt();
		System.out.print("Introduzca el segundo numero:");
		NumeroB=teclado.nextInt();
		
		if(NumeroA<NumeroB) {
			System.out.print("El primer numero es menor que el segundo");
		}
		
		else if( NumeroA>NumeroB) {	
		   System.out.print("El segundo numero es menor que el primero");
		}else {
			System.out.print("Estos numeros son iguales");
		}
	}}
