package clase01_foro2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Ingrese un numero: ");		
		int num1 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");		
		int num2 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");		
		int num3 = scanner.nextInt();
		
			
		//Calcular cu�l de los n�meros es el mayor y cu�l el menor
        int mayor;
		int menor;
		
		if (num1 > num2) {
            mayor = num1;
            menor = num2;
            
        } else {
            mayor = num2;
            menor = num1;
        }
		
		//Mostrar por pantalla los n�meros desde el menor hasta el mayor.
		System.out.println("N�meros desde " + menor + " hasta " + mayor + " : ");
		
		int resultado = mayor-menor;
		
		System.out.println("La diferencia es " + resultado);
		
		if (resultado >= num3) {
		
			for (int i = menor; i <= mayor; i++) 
			
			if (i % num3 != 0) {			
			  
			System.out.println(i);
			
			} else {
				System.out.println("");
			}
		}
	}

}


