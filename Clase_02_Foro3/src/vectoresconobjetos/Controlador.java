package vectoresconobjetos;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Leer = new Scanner(System.in);
		
		Libreta miLibretita = new Libreta(10);
 		
		miLibretita.agregarAlibreta("Daniela");
		//miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Osvaldo");
		//miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Juampi");
		//miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Emir");
		//miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Matias");
		//miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Victor");
		//miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Gonzalo");
		//miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Facundo");
		//miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Daiana");
		//miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Junior");
		//miLibretita.listarLibreta();
		
		int opciones;
		
		do {
			System.out.println("------------MENU PRINCIPAL------------");
			System.out.println("......................................");
			System.out.println("-----Elija una opción numérica:-------");
			System.out.println("......................................");
			
			System.out.println("1. ¿Qué nombre desea agregar?");
			System.out.println("2. ¿Qué posición desea eliminar?");
			System.out.println("3. ¿Qué nombre desea eliminar?");
			System.out.println("4. Mostrar la libreta");
			System.out.println("5. Mostrar los lugares libres");
			System.out.println("6. Salida");
			System.out.println("......................................");
			
			opciones = Leer.nextInt();
									
			if (opciones == 1) {
				
				if (miLibretita.posicionesLibres() > 0) {
				
				System.out.println("Escriba el nombre que quiere agregar: ");
				String nombrenuevo = Leer.next();
				
				System.out.println("Escriba la posición donde quiere guardar el nombre: ");
				int posicionnueva = Leer.nextInt();
												
				boolean bandera = miLibretita.corroborarNombre(nombrenuevo);
					if (! bandera) {
						miLibretita.agregarAlibreta(nombrenuevo);
					}
				miLibretita.posicionProhibida(posicionnueva);										
				miLibretita.listarLibreta();					
				}
			}
			if (opciones == 2) {
				
				System.out.println("Escriba la posición que quiere eliminar: ");
				int posicionaeliminar = Leer.nextInt();
				
				miLibretita.posicionAremover(posicionaeliminar);
				miLibretita.listarLibreta();
			
			} 
			
			if (opciones == 3) {
				
				System.out.println("Escriba el nombre que quiere eliminar: ");
				String nombreaeliminar = Leer.next();
				
				miLibretita.nombreAremover(nombreaeliminar);
				miLibretita.listarLibreta();
			}
			
			if (opciones == 4) {
				
				System.out.println("La lista completa quedará asi");
				
				miLibretita.listarLibreta();
			}
			
			if (opciones == 5) {
				
				System.out.println("Los lugares libres que quedan son: " + miLibretita.posicionesLibres());
								
			}
			
			if (opciones == 6) {
				
				System.out.println("Hasta luegos - Vuelva Prontos");
				break;
				
			}
		} while (opciones != 0);
				
		
			
	}		

}
