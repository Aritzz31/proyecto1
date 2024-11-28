package Array;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int menu,maxLitros=0,indiceMesMasLluvioso=0;
		String arrMeses[]=new String[5];
		
		arrMeses[0]="Enero";
		arrMeses[1]="Febrero";
		arrMeses[2]="Marzo";
		arrMeses[3]="Abril";
		arrMeses[4]="Mayo";
		
		int arrLitros[]=new int[5];
		arrLitros[0]=123;
		arrLitros[1]=333;
		arrLitros[2]=180;
		arrLitros[3]=211;
		arrLitros[4]=90;
		
		//menu
		
		
		System.out.println("Bienvenido");
		System.out.println("*****MENU*****");
		System.out.println("1. Mostrar en cada mes cuantos litros han llovido.");
		System.out.println("2. Mostrar en pantalla el mes y los litros del mes más lluvioso.");
		menu=teclado.nextInt();
		
		switch(menu) {		
		
		case 1:
			for(int i =0; i<arrMeses.length;i++) {

				System.out.println("La cantidad de litros caidos en "+arrMeses[i]+" es de:"+arrLitros[i]+" litros");
				
			}
			break;
			
		case 2:
			 for (int i = 1; i < arrLitros.length; i++) {
		            if (arrLitros[i] > maxLitros) {
		            	 maxLitros = arrLitros[i];
		            	 
		            }
		            System.out.println("El mes más lluvioso es " + arrMeses[indiceMesMasLluvioso]
		                    + " con " + maxLitros + " litros.");
		}
			 break;
	}
}
}

