package persona;

import java.util.Scanner;

public class Vista {
	
	public static void escribirAtributo(String atributo, String valor) {
		System.out.println(atributo+" : "+valor);
		
	}
	
	public static String leerAtributo(String atributo) {
		Scanner Leer = new Scanner(System.in);
		System.out.print("Ingrese el "+atributo);
		String tmp = Leer.next();
		return tmp;
	}
}
