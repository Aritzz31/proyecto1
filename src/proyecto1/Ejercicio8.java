package proyecto1;
import java.util.Scanner;
public class Ejercicio8 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Variable
		String name;
		String surname;
		String DNI;
		double edad=0;
		int menu=1;
		double precio1=0;
		double precio2=0;
		String exit;
		
		//Operacion
		System.out.print("Introduzca su nombre:");
		name=teclado.next();
		System.out.print("Introduzca su apellido:");
		surname=teclado.next();
		System.out.println("Introduzca un documento de identidad(DNI)" );
		DNI=teclado.next();
		System.out.println("Introduzca su edad" );
		edad=teclado.nextDouble();
		
		if(edad>18) 
		{
			while(menu<3) 
			{
		
				System.out.println("Bienvenido,"+name+", Elija entre las siguientes opciones:");
				System.out.println("1.- Comprar libro");
				System.out.println("2.- Comprobar si hay stock");
				System.out.println("3.- Salir del programa");
				menu=teclado.nextInt();	
				
				switch(menu)
				{
					case 1:
					/*	if(precio1>0) 
						{
							System.out.print("Inserta el primer precio(€):");
							precio1=teclado.nextDouble();
						
							if(precio2>0)	
							{
								System.out.print("Inserta el segundo precio(€):");
								precio2=teclado.nextDouble();
							}
							System.out.print("El total de los precios es de:"+precio1+precio2);
						}*/
						while (precio1<=0)
						{
							System.out.print("Inserta el primer precio(€):");
							precio1=teclado.nextDouble();
						}
						while (precio2<=0)
						{
							System.out.print("Inserta el segundo precio(€):");
							precio2=teclado.nextDouble();
						}
						System.out.print("El total de los precios es de:"+precio1+precio2);
						break;				
				}	// switch	
			}// while
		}//if
	}//main

} //Ejercicio 8
	


