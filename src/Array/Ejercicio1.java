package Array;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio1 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner teclado = new Scanner(System.in);
			Random rnd=new Random();
			int [] a= new int[10];
			int opcion,suma=0,max=0,min=0;

			for(int i=0;i<a.length;i++) {
				a[i]=rnd.nextInt(101);
			}
			System.out.println("1. Salir");
			System.out.println("2. Mostrar la suma");
			System.out.println("3. Mostrar el máximo");
			System.out.println("4. Mostrar el mínimo");
			System.out.println("5. Mostrar la media");
			System.out.println("6. Rellenarlo de nuevo con números (formatear)");
			opcion=teclado.nextInt();

			switch(opcion) {

			case 1:
				System.out.println("Adioss");
				break;

			case 2:
				for(int i=0;i<a.length;i++) {
					suma=suma+a[i];
				}
				System.out.println("="+ suma);
				break;
			case 3:
				for(int i=0;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
			System.out.println("Mayor: "+ max);
			break;
			
			case 4:
				min=a[0];
				for(int i=0;i<a.length;i++) {
					if(a[i]<min) {
						min=a[i];
					}
				}
				System.out.println("Menor: "+ min);
				break;
		}
			}
	}
