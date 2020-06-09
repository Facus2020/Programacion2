package clase_02_Foro1;

import java.util.Scanner;

public class Vectores_Ej6 {

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
		//creo dos bucles for anidados para recorrer el array
		for(i=0; i<A.length; i++) {
			//este bucle comienza en 0 y lo va a repetir 5 veces
			for(int j=0; j<A.length-1; j++) {
				//este condicional es para comprobar si i es igual a j o distinto
				if(i!=j) {
					//si es igual pasa a este if donde comprueba la posicion 
					if (A[i]== A[j]) {
						//y si es igual no la imprime
						A[j]=0;
					}
				}
			}
		}
		//bucle para imprimir por pantalla		 	
				
		 for(i=0; i<A.length; i++)
			//condicional para que no imprima el multiplo de 7
			if (A[i]%7!=0)
            
				System.out.println("Vector en la posición " + i + " con valor de: " +A [i]);	
				
	}


	}

