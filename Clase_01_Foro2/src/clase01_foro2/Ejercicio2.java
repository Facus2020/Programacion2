package clase01_foro2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Ingrese un numero: ");		
		int num1 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");		
		int num2 = scanner.nextInt();
		
		//Mostrar por pantalla los números desde el numero 1 hasta el numero 2.
		System.out.println("Números desde " + num1 + " hasta " + num2 + " : ");
        
		for (int i = num1; i <= num2; i++) {
            
			System.out.println(i);
		
		}	
				
	}

}

