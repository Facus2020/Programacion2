package vectoresconobjetos;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Leer = new Scanner(System.in);
		
		Libreta miLibretita = new Libreta(10);
 		
		miLibretita.agregarAlibreta("Daniela");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Osvaldo");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Juan Pablo");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Emir");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Matias");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Victor HP");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Gonzalo");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Facundo");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Daiana");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Junior");
		miLibretita.listarLibreta();
		
		int opciones;
		
		do {
			System.out.println("------MENU PRINCIPAL------");
			System.out.println("..........................");
			System.out.println("Elija una opci�n num�rica:");
			System.out.println("..........................");
			
			System.out.println("1. �Qu� nombre desea agregar?");
			System.out.println("2. �Qu� posici�n desea eliminar?");
			System.out.println("3. �Qu� nombre desea eliminar posici�n");
			System.out.println("4. Mostrar la libreta b�sica");
			System.out.println("5. Salida");
			System.out.println("..........................");
			
			opciones = Leer.nextInt();
									
			if (opciones == 1) {
				
				System.out.println("Escriba el nombre que quiere agregar: ");
				String nombrenuevo = Leer.next();
				
				System.out.println("Escriba la posici�n donde quiere guardar el nombre: ");
				int posicionnueva = Leer.nextInt();
				
				miLibretita.corroborarNombre(nombrenuevo);
				miLibretita.quedaLugar(nombrenuevo);				
				miLibretita.agregarAlibreta(nombrenuevo);				
				miLibretita.listarLibreta();					
			}
			
			if (opciones == 2) {
				
				System.out.println("Escriba la posici�n que quiere eliminar: ");
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
				
				System.out.println("La lista completa quedar� asi");
				
				miLibretita.listarLibreta();
			}
			
			if (opciones == 5) {
				
				System.out.println("Gracias por utililizar este Menu - Vuelva Prontos");
				break;
				
			}
			
		} while (opciones != 0);
				
		
			
	}		

}
