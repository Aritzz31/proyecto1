package proyecto1;
import java.util.Scanner;
public class ejercicio29 {

	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String MENU;
		double primernumero;
		double segundonumero;
		System.out.print("Introduce el primer numero:");
		primernumero=teclado.nextInt();
		System.out.print("Introduce el segundo numero:");
		segundonumero=teclado.nextInt();
		
		//MENUU
		System.out.println("Menu:");
		System.out.println("a.Sumar");
		System.out.println("b.Restar");
		System.out.println("c.Multiplicar");
        System.out.println("d.Dividir");
        System.out.println("e.Resto (%)");
        System.out.println("z.Salir");
	    System.out.print("Escoge el tipo de operacion que desea que se realize(Eliga un numero):");
	    MENU=teclado.next();
	    
	    //Operacioness
	    switch (MENU) {
	           case "a":
	        	   System.out.println(primernumero+"+"+segundonumero+"="+(primernumero+segundonumero));
	        	   break;
	        
	           case "b":
	        	   System.out.println(primernumero+"-"+segundonumero+"="+(primernumero-segundonumero));
	        	   break;
	        	   
	           case "c":
	        	   System.out.println(primernumero+"*"+segundonumero+"="+(primernumero*segundonumero));
	        	   break;
	           
	           case "d":
	        	   System.out.println(primernumero+"/"+segundonumero+"="+(primernumero/segundonumero));
	        	   break;
	        	   
	           case "e":
	        	   System.out.println(primernumero%segundonumero);
	        	   break;
	           case "0": 
	        	   System.out.println("¡Adioss!");
	        	   break;
	        
	           default:
	   			System.out.println("Introduce un numero valido, por favor.");

	    }
	    
	
	}}
