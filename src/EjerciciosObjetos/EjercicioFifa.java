package EjerciciosObjetos;
import java.util.Scanner;
public class EjercicioFifa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int velocidad;
		int fisico;
		int tiro;
		int pase;
		String nombre;
		//Jugador messi=new Jugador(80,85,87,84,33,94);
		//System.out.println("Muestrame el parametro de velocidad de messi:"+messi.getVelocidad());
		//messi.setVelocidad(81);
		//System.out.println("El nuevo valor de velocidad de messi es:"+messi.getVelocidad());
		
		//System.out.println("Introduzca la velocidad que desea ponerle a este jugador:");
		//velocidad=teclado.nextInt();
	//	messi.setVelocidad(velocidad);
		
		//System.out.println("La velocidad establecida es:"+	messi.getVelocidad());
	
		
		Jugador ronaldo=new Jugador();
		
		System.out.println("Introduzca el nombre del jugador");
		nombre=teclado.next();
		ronaldo.setNombre(nombre);
	//Velocidad
		System.out.println("Introduzca la velocidad que desea ponerle a este jugador:");
		velocidad=teclado.nextInt();
		ronaldo.setVelocidad(velocidad);
		
		System.out.println("La velocidad establecida es:"+	ronaldo.getVelocidad());
		
		
	//Fisico
		System.out.println("Introduzca el fisico que desea ponerle a este jugador:");
		fisico=teclado.nextInt();
		ronaldo.setFisico(fisico);
		
		System.out.println("El fisico establecido es:"+	ronaldo.getFisico());
	
	//Tiro	
		System.out.println("Introduzca el tiro que desea ponerle a este jugador:");
		tiro=teclado.nextInt();
		ronaldo.setTiro(tiro);
		
		System.out.println("El tiro establecido es:"+	ronaldo.getTiro());
	
	//Pase
		System.out.println("Introduzca el pase que desea ponerle a este jugador:");
		pase=teclado.nextInt();
		ronaldo.setPase(pase);
		
		System.out.println("El pase establecido es:"+	ronaldo.getPase());
		
	//Defensa
		System.out.println("Introduzca la defensa que desea ponerle a este jugador:");
		int defensa=teclado.nextInt();
		ronaldo.setDefensa(defensa);
		
		System.out.println("La defensa establecida es:"+ ronaldo.getDefensa());
		
	//Regate
		System.out.println("Introduzca el regate que desea ponerle a este jugador:");
		int regate=teclado.nextInt();
		ronaldo.setRegate(regate);
		
		System.out.println("El regate establecido  es:"+ ronaldo.getRegate());
		
	System.out.println(ronaldo.toString());
}
}
