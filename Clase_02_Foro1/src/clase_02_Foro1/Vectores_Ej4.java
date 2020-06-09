package clase_02_Foro1;

import java.util.Scanner;

public class Vectores_Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Leer = new Scanner(System.in);
		
		//declaramos un vector con datos de tipo entero. Dimensión de 5 entradas.
		int A [] = new int [5];
		
		int i;
		//bucle for para solicitar valores 
		for (i = 0; i < 5; i++) {
			System.out.print("Ingrese un número: ");
			
			//almacenar los vectores por el usuario
			A [i] = Leer.nextInt();
			
		}
		//bucle para imprimir por pantalla
		 				
		 for(i=0; i<A.length; i++)
			
			if (A[i] % 7!= 0)
            
				System.out.println("Vector en la posición " + i + " con valor de: " +A [i]);	
				
	}

}
