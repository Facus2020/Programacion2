package clase01_foro2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner = new Scanner (System.in);
		
		    String usuarioAceptado = "Enzo";
	        int contrase�aAceptada = 4321;
	        	        
	        System.out.println ("Ingrese un Usuario: ");		
	        String usuario = scanner.next();		
			
	        System.out.println ("Ingrese una contrase�a: ");		
	        int contrase�a = scanner.nextInt();
			
	      //Hacemos la comprobaci�n   
	        
	        if (usuario.equals(usuarioAceptado)) {
	        	System.out.println("Usuario correcto");
	        
	        } else {
	        	System.out.println("Usuario incorrecto");
	        	
	        }
			if (contrase�a == contrase�aAceptada) {
	        	System.out.println("Contrase�a correcta");
	       
			} else {
	        	System.out.println("Contrase�a incorrecta");
	        }
	        	        	                            
	        
	}

}


