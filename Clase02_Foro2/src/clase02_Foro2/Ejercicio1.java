package clase02_Foro2;

import java.util.Scanner;

public class Ejercicio1 {
	
	static Scanner Leer = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaramos un vector con datos de tipo string. Dimensión de 4 entradas.
		String A [] = new String [4];
		
		//bucle for para solicitar las oraciones a los usuarios 	
		for (int i = 0; i < A.length; i++) {
			System.out.print("Ingrese una frase: ");
			
			//almacenar los vectores por el usuario
			A [i] = Leer.nextLine();
		}
		
		//bucle para imprimir por pantalla
		for(int i = 0; i <A.length; i++) {
			
			System.out.println("" + A [i] + "");
		}
	}
}


