package clase_02_Foro1;

import java.util.Scanner;

public class Vectores_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Leer = new Scanner(System.in);
		
		//declaramos un vector con datos de tipo entero. Dimensi�n de 5 entradas.
		int A [] = new int [5];
		
		int i;
		//bucle for para solicitar valores 
		for (i = 0; i < 5; i++) {
			System.out.print("Ingrese un n�mero: ");
			
			//almacenar los vectores por el usuario
			A [i] = Leer.nextInt();
			
		}
		
		
		
		
	}

}
