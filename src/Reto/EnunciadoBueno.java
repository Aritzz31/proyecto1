package Reto;
import java.util.Scanner;
public class EnunciadoBueno {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		//Variables
		int trabajadores,dias,tareas;
		double sSemanal=0, bonus=0,costoTotal=0;
		
		//Esta opreracion la hacemos para el numero de trabajadores
		do {
			System.out.print("Cuantos trabajadores hay:");
			trabajadores=teclado.nextInt();	
			if(trabajadores<0) {
				System.out.println("ERROR!");
			}
		}while(trabajadores<0);
		
		// if para cuando los trabajadores sean igual a 0
		if(trabajadores==0){
		}
		// else para cuando los trabajadores no sean 0
		else {
			for(int t=1;t<=trabajadores;t++) {
				
				do {
					System.out.println("Dias trabajados de trabajador "+t+":");
					dias=teclado.nextInt();
					
					if(dias<0 || dias>7) {
						System.out.println("ERROR!");
					}
				}while(dias<0 || dias>7);
				
		//condicion cumplida cuando los dias no seas 0
				if(dias!=0) {
					for(int d=1;d<=dias;d++) {
						//Do,while para en caso de error
						do {
							System.out.println("Numero de tareas realizadas el dia "+d+":");
							tareas=teclado.nextInt();
							if(tareas<0) {
								System.out.println("ERROR!");
							}
						}while(tareas<0);
		//Este if es para cuando el numero de tareas no es igual a 0
						if(tareas!=0) {
							sSemanal=(sSemanal+tareas*12.5);
		
							if(tareas>10) {
								do {
									bonus++;
								}while(bonus<(tareas-10));
							}//CIERRE DE if(tareas>10)
						}
					}
				}
				
				
				//Sueldo semanal
				if((sSemanal-bonus*12.5)+(bonus*(12.5+(12.5*0.1)))<= sSemanal+(sSemanal*0.25)) {
					System.out.print("Sueldo semanal del trabajador "+t+": ");
					sSemanal=(((sSemanal-bonus*12.5)+(bonus*(12.5+(12.5*0.1)))));
					System.out.println(sSemanal+ "€");
				}
				else {
					System.out.println("Sueldo semanal de el trabajador "+t+": "+sSemanal+"€");
				}
				
				costoTotal=costoTotal+sSemanal;
				
				sSemanal=sSemanal-sSemanal;
				bonus=bonus-bonus;
			}
			
		}
		
		System.out.println("Coste total de la empresa: " + costoTotal+"€");
		
		
			
	
		//CIERRE TECLADO
		teclado.close();
	}
}
