package Pruebanivel;
import java.util.Scanner;
public class examenclase {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Variables
		String nombre;
		String apellido;
		int edad=0;
		int menu;
		int precio1=0;
		int precio2=0;
		int precio3=0;
		String fruta;
		String contraseña;
				
				
			System.out.println("Introduzca el nombre:");
			nombre=teclado.next();
			System.out.println("Introduzca el apellido:");
			apellido=teclado.next();
			System.out.println("Introduzca su edad:");
			edad=teclado.nextInt();
			
			if(edad>=18) 
			
				System.out.println(("Bienvenido ")+ nombre+ apellido +(" a la fruteria"));
				System.out.println("1-Realizar una nueva compra");
				System.out.println ("2-Comprobar si existe fruta");
				System.out.println ("3-Introducir fruta");
				System.out.println("4-Salir");
				menu=teclado.nextInt();
				
				switch(menu)
				{
					case 1:
						while(precio1<=0)
						{
							System.out.print("Inserta el primer precio(€):");
							precio1=teclado.nextInt();
						}
						while (precio2<=0)
						{
							System.out.print("Inserta el segundo precio(€):");
							precio2=teclado.nextInt();
						}
						while (precio3<=0)
						{
							System.out.print("Inserta el tercer precio(€):");
							precio2=teclado.nextInt();
							
					System.out.print("Total:"+(precio1+precio2+precio3));
					
					break;
						}
					
					case 2:
						System.out.print("Introduzca el nombre de la fruta:");
					
						
						
					break;
			
				 
					case 3:
						System.out.print("Para realizar esta accion necesitas ser administrador.Introduce la contraseña:");
						contraseña=teclado.next();
						
						
						
						break;
						
					case 4:
						System.out.print("Hasta luego"+ nombre );
						
				
						break;

				
						
				
		
				
			
		}	}}
