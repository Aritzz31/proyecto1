package EjerciciosObjetos;

import java.util.Scanner;

public class MainTren {

	public class programaprincipal {
		public static int menu(Scanner teclado) {
			 int menu;
			 System.out.println("1. Introducir los trenes.");
			 System.out.println("2. Mostrar los trenes que superen una velocidad dada.");
			 System.out.println("3. Ordenar los trenes de cercanías por duración del viaje");
			 System.out.println("4. Reserva de asientos.");
			 System.out.println("5. Mostrar todos los trenes que se han introducido");
			 System.out.println("6. Eliminar y Comprimir");
			 System.out.println("7. Salir");
			 menu = teclado.nextInt();
			 return menu;
		}
		public static int contar(Tren a[], Scanner teclado) {
			//devuelve num cuentas o -1 si esta completo
			boolean enc=false;
			for (int i = 0; i<a.length && !enc ;i++) {
				if (a[i]==null) {
					enc=true;
					return i;
				}
			}
			return -1;
		}
		
		public static int introducir(Scanner teclado, Tren a[], int contador) {
			String respuesta="";
			String referencia;
			if (contador>a.length) {
				System.out.println("Error. No puedes introducir más trenes ");
			}else {
				for (int i = contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
					Tren t1=new Tren();
					a[i]=t1;
					System.out.println("Cual es la referencia del tren?");
					referencia=teclado.next();
					int pos=buscarPorReferencia(referencia,a,contador);
					 if(pos==-1) {
						a[i].setReferencia(referencia);
						System.out.println("Cual es el tipo de tren?");
						a[i].setTipo(teclado.next());
						System.out.println("cuantos asientos tiene ocupados el tren?");
						a[i].setAsientosOcupados(teclado.nextInt());
						System.out.println("Cuantos km a recorrido el tren?");
						a[i].setKmRecorridos(teclado.nextInt());
						System.out.println("Cual es la duracion del viaje?");
						a[i].setDuracionViaje(teclado.nextInt());
						contador++;
					 }else {
						 System.out.print("El tren ya existe");
					 }
					do {
						System.out.print("Quiere añadir otro tren?: ");
						respuesta = teclado.next();
						
						if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
							System.out.println("Las opciones válidas son Si/No");
						}
					} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
				}
			}
			return contador;
		}
		
		public static void superiorvelocidad(Scanner teclado, Tren a[], int contador) {
			int minimo;
			boolean salir=false;
			System.out.println("Introduzca la velocidad minima?");
			minimo=teclado.nextInt();
			for(int i=0;i<contador;i++) {
				 if (a[i].obtenerVelocidadTotal()>minimo) {
						System.out.println(a[i].getReferencia());
						System.out.println(a[i].obtenerVelocidadTotal());
						salir=true;
					}
				}  if (!salir) {
					 System.out.println("No hay trenes que supere el minimo de velocidad");
				 }
			}
		
		
		public static int buscarPorReferencia(String referencia, Tren a[], int contador) {
			//busca el tren por referencia y devuelve su posición o -1 si no lo encuentra
			for (int i=0; i<contador;i++) {
				if(referencia.equalsIgnoreCase(a[i].getReferencia())) {
					return i;
				}
			}
			return -1;
		}

		public static void ordenar(Tren a[], int contador) {
			Tren sigCuen=new Tren();
	        for(int i=0; i<a.length-1; i++){
	               for(int j=0; j<(a.length-1-i) && a[j+1]!=null; j++){ 
	                    if(a[j].getDuracionViaje()<a[j+1].getDuracionViaje()){ 
	                            sigCuen=a[j];
	                            a[j]=a[j+1];
	                            a[j+1]=sigCuen;
	                     }   
	               }
	          }
	        
	        mostrarCercanias (a,contador);
		}
	    
		public static void mostrar(Tren a[], int contador) {
			for (int i=0;i<contador;i++) {
				System.out.println(a[i].toString());
			}
		}
		
		public static void mostrarCercanias (Tren a[], int contador) {
			for (int i=0;i<contador;i++) {
				if (a[i].getTipo().equalsIgnoreCase("Cercanias")) {
					System.out.println(a[i].toString());
			}
		}
		}
		
		public static void reservaDeAsientos (Scanner teclado, Tren a[],int contador) {
			String referencia;
			int cant;
			
			System.out.println("Introduzca la referencia del tren?");	
			referencia=teclado.next();
			int pos=buscarPorReferencia(referencia,a,contador);
			if(pos==-1) {
				System.out.println("No existe");
			}else {
				if (!a[pos].trenLleno()) {
					System.out.println("Numero de asientos a reservar: ");	
					cant=teclado.nextInt();
					if (a[pos].getAsientosOcupados()+cant<=400) {
						a[pos].setAsientosOcupados(a[pos].getAsientosOcupados()+cant);
					}else {
						System.out.println("ENo es posible realizar esa reserva");
					}
				}else {
					System.out.println("Está lleno");
				}
					
				}
			}
				
		
		
		public static int eliminarTren(Scanner teclado, Tren a[], int contador) {
			String referencia="";
			System.out.println("Cual es la referencia del tren a eliminar?");
			referencia=teclado.next();
			int pos=buscarPorReferencia(referencia,a,contador);
			if(pos==-1) {
				System.out.println("No existe");
			}else {
				a[pos]=null;
				contador--;
				System.out.println("El titular ha sido borrado");
				for(int i=pos;i<contador;i++) {
					a[i]=a[i+1];
					
				}
			}
			return contador;
		}
		
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner teclado = new Scanner(System .in);
			int opcion=0;
			Tren a[] = new Tren [50];
			int contador=0; 
			
			do {
				 opcion=menu(teclado);
				 switch (opcion) {
				 case 1:
					 contador=introducir(teclado, a, contador);
					 break;
				 case 2:
					 if (contador>0) {
						 superiorvelocidad(teclado, a, contador);
					 }else {
						 System.out.println("No hay trenes");
					 }
					 break;
				 case 3:
					 if (contador>0) {
						 ordenar( a,  contador);
					 }else {
						 System.out.println("No hay trenes");
					 }
					 
					 break;
				 case 4:
					 if (contador>0) {
						 reservaDeAsientos (teclado, a,contador);
					 }else {
						 System.out.println("No hay trenes");
					 }
					
					 break;
				 case 5:
					 if (contador>0) {
						 mostrar( a,  contador);
					 }else {
						 System.out.println("No hay trenes");
					 }
					
					 break;
				 case 6:
					 if (contador>0) {
						 contador=eliminarTren(teclado, a, contador);
					 }else {
						 System.out.println("No hay trenes");
					 }
					
					 break;
				 case 7:
					 System.out.println("Hasta la vista!");
					 break;
				 default: 
					 System.out.println("Opcion incorrecta");
					 opcion=7;
					 break;
				 	}
			 }while(opcion!=7);	 
			 teclado.close();
		}
	}
}
