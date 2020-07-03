package vectoresbasico;

import java.util.Scanner;

public class ControladorBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Leer = new Scanner(System.in);
		
		LibretaBasica miLibreta = new LibretaBasica();
		
		/*miLibreta.agregarAlibreta("Enzo", 3);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Jerónimo", 5);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Marcela", 8);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Patricia", 1);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Ignacio", 0);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Cristian",6);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Francisco", 2);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Cata", 9);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Luli", 4);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Elisa", 7);
		miLibreta.listarLibreta();*/
		
		int opciones;
		
		do {
			System.out.println("------MENU PRINCIPAL------");
			System.out.println("..........................");
			System.out.println("Elija una opción numérica:");
			System.out.println("..........................");
			
			System.out.println("1. Agregar Nombre y Posición");
			System.out.println("2. Eliminar un Nombre");
			System.out.println("3. Eliminar una posición");
			System.out.println("4. Mostrar la libreta básica");
			System.out.println("5. Salida");
			System.out.println("..........................");
			
			opciones = Leer.nextInt();
			
			if (opciones == 1) {
				
				System.out.println("Escriba el nombre que quiere agregar: ");
				String nombrenuevo = Leer.next();
				
				System.out.println("Escriba la posición donde quiere guardar el nombre: ");
				int posicionnueva = Leer.nextInt();
				
				miLibreta.corroborarNombre(nombrenuevo);				
				miLibreta.agregarAlibreta(nombrenuevo, posicionnueva);
				
				miLibreta.listarLibreta();					
			}
			
			if (opciones == 2) {
				
				System.out.println("Escriba el nombre que quiere eliminar: ");
				String nombreaeliminar = Leer.next();
				
				miLibreta.nombreAremover(nombreaeliminar);
				miLibreta.listarLibreta();
			}
			
			if (opciones == 3) {
				
				System.out.println("Escriba la posición que quiere eliminar: ");
				int posicionaeliminar = Leer.nextInt();
				
				miLibreta.posicionAremover(posicionaeliminar);
				miLibreta.listarLibreta();
			
			} 
			
			if (opciones == 4) {
				
				System.out.println("La lista completa quedará asi");
				
				miLibreta.listarLibreta();
			}
			
			if (opciones == 5) {
				
				System.out.println("Gracias por utililizar este Menu - Vuelva Prontos");
				break;
				
			}
			
		} while (opciones != 0);
				
		
			
	}		

}



