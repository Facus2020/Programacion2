package clase01_foro2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner=new Scanner (System.in);
		
		System.out.print ("Ingrese un numero: ");
		int num1 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");
		int num2 = scanner.nextInt();
		
		int resultado = num1+num2;
		
		//Mostrar por pantalla la suma del numero 1 y del numero 2.
		System.out.println("La suma de " + num1 + " + " + num2 + " es = " + resultado);
	}

}

