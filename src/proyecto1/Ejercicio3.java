package proyecto1;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double euros;
		
		System.out.print("Introduce la cantidad de €:");
		euros=teclado.nextInt();
		
		if(euros>20000){
			System.out.print(euros*16/100);
			System.out.print("€");
			
		}else {	
			System.out.print(euros*7/100);
			System.out.print("€");
		}
}}
