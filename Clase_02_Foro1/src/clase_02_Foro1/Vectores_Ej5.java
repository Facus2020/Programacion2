package clase_02_Foro1;

import java.util.Scanner;

public class Vectores_Ej5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Leer = new Scanner(System.in);
		
		//declaramos un vector con datos de tipo entero. Dimensión de 5 entradas.
		int A[] = new int [5];
		
		int i;
		//bucle for para solicitar valores 
		for (i = 0; i < 5; i++) {
			System.out.print("Ingrese un número: ");
			
			//almacenar los vectores por el usuario
			A[i] = Leer.nextInt();
			
		}
		//voy a crear dos bucles, un for que va a recorrer sin modificar la variable y empieza la variable en 0
		//y el otro for que va a recorrer el total del array (5) y los va a ir ordenando uno por uno
		//cdo termine el ciclo el for de afuera cambia a 1 y vuelve a hacer andar el de adentro
		//y asi hasta que esten todos ordenados
		for (int k=0; k<4; k++) {
			for (i=0; i<4-k;i++) {
				if ( A[i]>A[i+1]) {
					int aux;
					aux=A[i];
					A[i]=A[i+1];
					A[i+1]=aux;
				}
			}
		}
		
		//bucle para imprimir por pantalla
		 				
		 for(i=0; i<A.length; i++)
			//condicional para que no imprima el multiplo de 7
			if (A[i] % 7!= 0)
            
				System.out.println("Vector en la posición " + i + " con valor de: " +A [i]);	
				
	}

}