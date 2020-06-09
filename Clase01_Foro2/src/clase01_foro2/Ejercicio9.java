package clase01_foro2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		//Defino la palabra o frase
		String sPalabra ="Mi equipo favorito es River Plate";
		
		//defino un contador
		int contador = 0;
		
		//Hago un bucle for para recorrer la frase
		//Utilizo el metodo LENGHT para controlar el tamaño de la misma
		
		//el metodo CHART nos devuelve el caracter, y comprobaremos si es una vocal
		for(int x = 0;x < sPalabra.length();x++) {
			 if ((sPalabra.charAt(x) == 'a') || (sPalabra.charAt(x) =='e') || (sPalabra.charAt(x) == 'i') || (sPalabra.charAt(x) == 'o') || (sPalabra.charAt(x) == 'u')){ 
			    contador++;
			 }	    
						 
		}
		System.out.println("La frase " + sPalabra + " contiene " + contador + " vocales");
	}
}

