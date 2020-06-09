package clase_02_Foro1;

import java.util.Scanner;
import java.util.Random;//importo la libreria Random para poder usar numeros aleatorios

public class Vectores_Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Leer = new Scanner(System.in);
		
		//declaramos un vector con datos de tipo entero. Dimensión de 5 entradas.
		int A[] = new int [10];
		//genero un numero aleatorio
		Random rnd=new Random();
		//declaro las variables a usar
		int i;
		int j;
		int x=0;
		int aux;
		
		System.out.println("Se imprimirán números aleatorios");
		System.out.println("");
		
		//bucle for para solicitar valores 
		for (i = 0; i < 10; i++) {
			
			x=(int)(rnd.nextDouble()*100);// voy a decir que voy a usar numeros del 1 al 100
			A[i]=x;
									
			System.out.println("Número aleatorio: " + A [i]);
		}
			//creo dos bucles for, comienza i en 0 cdo el for de adentro concluye pasa a 1 y asi...
			for(i=0; i<10-1;i++) {
				
				for (j=0; j<10-i-1; j++) {//comienza j en 0 y va a repetir el bucle 10 veces y concluye
					
					if(A[j] > A[j+1]) {
						
						aux=A[j];
						A[j]=A[j+1];
						A[j+1]=aux;
					}
				}
			}
			//voy a crear dos bucles, un for que va a recorrer sin modificar la variable y empieza la variable en 0
			//y el otro for que va a recorrer el total del array (5) y los va a ir ordenando uno por uno
			//cdo termine el ciclo el for de afuera cambia a 1 y vuelve a hacer andar el de adentro
			//y asi hasta que esten todos ordenados
			for (int k=0; k<4; k++) {
				for (i=0; i<4-k;i++) {
					if ( A[i]>A[i+1]) {
						int aux1;
						aux1=A[i];
						A[i]=A[i+1];
						A[i+1]=aux1;
					}
				}
			}
			//creo dos bucles for anidados para recorrer el array
			for(i=0; i<A.length; i++) {
				//este bucle comienza en 0 y lo va a repetir 5 veces
				for(int j1=0; j1<A.length-1; j1++) {
					//este condicional es para comprobar si i es igual a j o distinto
					if(i!=j1) {
						//si es igual pasa a este if donde comprueba la posicion 
						if (A[i]== A[j1]) {
							//y si es igual no la imprime
							A[j1]=0;
						}
					}
				}
			}
			System.out.println(" ");
			//bucle para imprimir por pantalla		 	
					
			 for(i=0; i<A.length; i++)
				//condicional para que no imprima el multiplo de 7
				if (A[i]%7!=0)
	            
					System.out.println("Vector en la posición " + i + " con valor de: " +A [i]);	
					
		}


		}

