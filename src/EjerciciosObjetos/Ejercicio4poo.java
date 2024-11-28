package EjerciciosObjetos;

import java.util.Scanner;

public class Ejercicio4poo {
	
	//metodo 1
	   
	private static final int MAX_CUENTAS = 20;

	public static int introducir(Scanner teclado, Cuentass a[], int contador) {
		String respuesta="";
	
		if (contador>a.length) {
			System.out.println("Error. No puedes introducir más cuentas ");
		}else {
			for (int i = contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
				Cuentass c1=new Cuentass();
				a[i]=c1;
				System.out.println("Quien es el titular de la cuenta?");
				a[i].setTitular(teclado.next());
				System.out.println("Cuanta es la cantidad de dinero en la cuenta?");
				a[i].setCantidad(teclado.nextDouble());
				contador++;
				do {
					System.out.print("Quiere añadir otra cuenta?: ");
					respuesta = teclado.next();
					
					if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
						System.out.println("Las opciones válidas son Si/No");
					}
				} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
			}
		}
		return contador;

	}
	
	   //Metodo 2 
	    	public static void mostrarCuentas(Cuentass[] cuenta1, int numeroCuentas) 
	    	{
	    		if (numeroCuentas==0)
	    			System.out.println("No hay cuentas");
	    		for (int i=0;i<numeroCuentas;i++) {
	    			//if (cuenta1[i] != null) {
	    				cuenta1[i].mostrar();
	 //  }
	    		}
	    	}
	    	
	    //Metodo 3
	    	public static void ingresarCantidad(Cuentass[] cuenta1, Scanner sc) 
	    	{
	    		String nombre;
	    		double cantidad;

	    		System.out.println("Introduce el nombre de la cuenta en la que quieras ingresar una cantidad: ");
	    		nombre=sc.next();
	    		for(int i=0;i<cuenta1.length;i++) 
	    		{	
	    			boolean encontrado=false;
	    			if(cuenta1[i] !=null && cuenta1[i].getTitular().equalsIgnoreCase(nombre)) {
	    				encontrado=true;
	    				System.out.println("Introducir cantidad: ");
	    				cantidad=sc.nextDouble();
	    				cuenta1[i].ingreso(cantidad);
	    				System.out.println("Cantidad ingresada correctamente en la cuenta de " + nombre);
	    			}
	    			if (!encontrado) {
	    				System.out.println("Esa cuenta no existe, por favor introduce otra.");
	    			}
	    		}
	    		}
	    	
	    //metodo 4

	    	public static void retirarCantidad(Cuentass[] cuenta1) 
	    	{
	    		double comision = 12.0;  
	    		System.out.println("Aplicando una comisión de " + comision + " € a todas las cuentas.");

	    		for (int i=0;i<cuenta1.length; i++) {
	    			if (cuenta1[i] != null) { 
	    				cuenta1[i].retirarDinero(comision); 
	    			}
	    		}
	    	}

	    	
	        
	    
	public static int menu(Scanner teclado){
		
		System.out.println("1. Introducir cuenta/s.");
		System.out.println("2. Muestra las cuentas introducidas.");
		System.out.println("3. Ingresar una cantidad a un titular concreto introducido por teclado");
		System.out.println("4. Retirar de todas las cuentas introducidas, la comisión de 12€");
		System.out.println("5. Muestra la cuenta de mayor saldo");
		System.out.println("6. Muestras las cuentas que tengan saldo superior a uno introducido por teclado. ");
		System.out.println("7. Muestra la cuenta de un titular concreto. Controlar si no encuentra.");
		System.out.println("8. Muestra las cuentas de los titulares que contengan un grupo de letras");
		System.out.println("9. Ordena y muestra las cuentas según su saldo (de mayor a menor saldo)");
		System.out.println("10.Salir");
		System.out.println("Introduce opcion");
		int mennu= teclado.nextInt();
		teclado.nextLine();
		return mennu;
	}
	    		
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Cuentass cuentas[]=new Cuentass[MAX_CUENTAS];
		int totalCuentas=0;
		boolean continuar=true;
		
		while (continuar)
		{
			int menu=menu(teclado);
		
			switch(menu) 
			{
				case 1:
					//
				//	cuentas[0]=new Cuentass("a",200);
					totalCuentas=introducir(teclado,cuentas,totalCuentas);
					
					//System.out.println(numeroCuentas(cuentas));
					break;
				case 2:	
					mostrarCuentas(cuentas,totalCuentas);
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 10:
					continuar=false;
					System.out.println("ADIOSSSSSSSS");
					
			}
		}
		teclado.close();
	}
}

