package proyecto1;
import java.util.Scanner;
public class MenuString {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Variables
		String Nombre;
		int MENU;
		String pal1;
		String pal2;
		int numero;
		int contador = 0;
		
		
		
		//Comienzo del ejercicio
		System.out.print("Introduzca un nombre:");
		Nombre=teclado.next();
		System.out.println("Bienvenido "+ Nombre +"."+"¿Qué quieres hacer?");
		
		//MENU
		System.out.println("1.- Dar la vuelta a una palabra.");
		System.out.println("2.- Comparar dos palabras");
		System.out.println("3.-Numero de letras.");
		System.out.println("4.- Repetir palabra");
		System.out.println("Escoga la funcion que desea que se realice:" );
		MENU=teclado.nextInt();
		
		//Operaciones
		switch (MENU) {
		
		       case 1:
		    	   System.out.print("Introduzca la palabra que desea dar la vuelta:");
		    	   pal1=teclado.next();
		    	   String pal1Invertida=new StringBuilder(pal1).reverse().toString();
		    	   System.out.println("Palabra original:"+pal1);
		    	   System.out.println("Palabra invertida:"+pal1Invertida);
		    	   System.out.println("La palabra dada la vuelta es:"+pal1Invertida);
		    	  
		    	  break;
		    
		       case 2:
		    	   System.out.println("Introduzca la primera palabra");
		    	   pal1=teclado.next();
		    	   System.out.print("Introduzca la segunda palabra");
		    	   pal2=teclado.next();
		    	   
		    	   if (pal1.equals(pal2)) {
		    		   System.out.print("Son iguales");
		    	   } else {
		    		   System.out.print("No son iguales");
		    	   }
		    	   break;
		    	   
		       case 4:
		    	   System.out.println("Introduce una palabra: ");
		           pal1 = teclado.next(); 
		           System.out.println("Introduce el numero de repeticiones : ");
		           numero = teclado.nextInt();
		           while (contador < numero) {
		                   System.out.println(pal1);
		                   contador++;

		           }
		      
		           
		}}
	
       }
		
		           
		       
                     
		           
		           
		
