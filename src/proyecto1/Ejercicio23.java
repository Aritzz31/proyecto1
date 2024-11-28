package proyecto1;
import java.util.Scanner;
public class Ejercicio23 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double Numero;
		int Cuadrado;
		System.out.print("Introduzca el numero que desea operar:");
		Numero=teclado.nextDouble();
		System.out.println(Numero*Numero);
		System.out.println("Introduzca el valor calculado anteriormente:");
		Cuadrado=teclado.nextInt();
		
		if(Cuadrado<=10) {
			System.out.print(Cuadrado-100);
		}else {
			System.out.print(Cuadrado+100);
		}
		
}}
