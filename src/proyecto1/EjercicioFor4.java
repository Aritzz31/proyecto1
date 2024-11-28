package proyecto1;
import java.util.Scanner;
public class EjercicioFor4 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	
		
	//Variables
		int numero=-1;
		int contador=1;
		int factorial=1;
		
		
	//Operacion
		while(numero<0)
		{
	        System.out.println("Inroduzca un numero positivo:");
			numero=teclado.nextInt();
			
		}
		for(contador=1;contador<=numero;contador++)
			factorial=factorial*contador;
		System.out.println(factorial);
			
			
		  
		  
	}}
		
