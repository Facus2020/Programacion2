package clase01_foro2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner = new Scanner (System.in);
		
		    String usuarioAceptado = "Enzo";
	        int contraseñaAceptada = 4321;
	        	        
	        System.out.println ("Ingrese un Usuario: ");		
	        String usuario = scanner.next();		
			
	        System.out.println ("Ingrese una contraseña: ");		
	        int contraseña = scanner.nextInt();
			
	      //Hacemos la comprobación   
	        
	        if (usuario.equals(usuarioAceptado)) {
	        	System.out.println("Usuario correcto");
	        
	        } else {
	        	System.out.println("Usuario incorrecto");
	        	
	        }
			if (contraseña == contraseñaAceptada) {
	        	System.out.println("Contraseña correcta");
	       
			} else {
	        	System.out.println("Contraseña incorrecta");
	        }
	        	        	                            
	        
	}

}


