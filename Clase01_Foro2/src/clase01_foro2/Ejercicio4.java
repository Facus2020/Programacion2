package clase01_foro2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Ingrese un numero: ");		
		int num1 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");		
		int num2 = scanner.nextInt();
		
		//Calcular cuál de los números es el mayor y cuál el menor
        int mayor;
		int menor;
		
		if (num1 > num2) {
            mayor = num1;
            menor = num2;
            
        } else {
            mayor = num2;
            menor = num1;
        }
		
		//Mostrar por pantalla los números desde el menor hasta el mayor.
		System.out.println("Números desde " + menor + " hasta " + mayor + " : ");
		
		for (int i = menor; i <= mayor; i++) 
			
			if (i % 5 != 0)
            
			System.out.println(i);
	}

}


