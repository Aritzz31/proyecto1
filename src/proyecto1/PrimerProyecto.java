package proyecto1;
import java.util.Scanner;//1
public class PrimerProyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);//2
	String palabra;
	double valorRadio;
	double lado;
	double ladoLargo;
	double ladoCorto;
	double temperatura;
		System.out.println("¿Cual es tu nombre?");
		palabra=teclado.next();
		System.out.println(palabra);
		System.out.print("Bienvenido "+palabra);
		System.out.println(" .Vamos a realizar diferentes cálculos");
	    System.out.println("****************************");
	    
		System.out.println("CIRCULO");
		System.out.print("Introduce el valor de el radio:");
		valorRadio = teclado.nextDouble();
		System.out.println("El área del círculo es "+(3.14*valorRadio*valorRadio)+"m2.");
		System.out.println("****************************");
		
		System.out.println("CUADRADO");
		System.out.print("Introduce el valor del lado:");
		lado = teclado.nextDouble();
		System.out.println("El área del círculo es "+(4*lado)+"m2.");
		System.out.println("****************************");
	
		System.out.println("RECTANGULO");
		System.out.print("Introduce el valor del lado más largo:");
		ladoLargo=teclado.nextDouble();
		System.out.print("Introduce el valor del lado más corto:");
		ladoCorto=teclado.nextDouble();
		System.out.println("El área del rectángulo es"+ (ladoLargo*ladoCorto) +"m2");
		
		
		System.out.print("Introduce la temperatura en grados Celsius:");
		temperatura=teclado.nextDouble();
		System.out.println( temperatura);
		System.out.print("...........");
		
		
		
		
		
        
	}

 }
