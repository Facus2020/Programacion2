package clase02_Foro2;

import java.util.Scanner;

public class Ejercicio2 {
	
	static Scanner Leer = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaramos un vector con datos de tipo string. Dimensi�n de 4 entradas.
		String User [] = new String [4];
		User [0] = "Enzo";
		User [1] = "Facundo";
		User [2] = "Osvaldo";
		User [3] = "Daniela";
		
		//declaramos un segundo vector con datos de tipo int. Dimensi�n de 4 entradas.
		int Pass [] = new int [4];
		Pass [0] = 1234;
		Pass [1] = 4321;
		Pass [2] = 1122;
		Pass [3] = 3344;
					
		System.out.println ("Ingrese un Usuario: ");		
        
		String usuario = Leer.next();		
		
		System.out.println ("Ingrese una contrase�a: ");		
        
        int contrase�a = Leer.nextInt();
	
        
        
		//aca va a ir el bucle para recorrer el vector y ahi hago la comprobaci�n
        //vos decis algo asi con lo de bandera?
        
      //declaro las variables a usar
      		int k;
      		
      	boolean bandera = false;
      	
      	//Hacemos la comprobaci�n en el vector por el usuario   
            
            for (k=0; k<User.length; k++) {
            	
            	if(usuario.equals(User[k])){
    				
            		bandera = true;
            		
            		}            	
            }	
            
            if (bandera == true) {
            			
            			System.out.println("Usuario correcto"); 
            				
            			} else {
            				
            				System.out.println("Usuario incorrecto");
            			}
            		         
            boolean mastil = false;
            
          //Hacemos la comprobaci�n en el vector por la contrase�a
            
            for (k=0; k<User.length; k++) {
            	
            	if(contrase�a == (Pass[k])) {
    				
            		mastil = true;
            		}
            }
            		
            if (mastil == true) {
            			
            			System.out.println("Contrase�a correcta"); 
            				
            			} else {
            				
            				System.out.println("Contrase�a incorrecta");
            			}
            
          
            boolean banderin = false;
            
          //Hacemos la comprobaci�n en el vector por los dos juntos
            
            for (k=0; k<User.length; k++) {
            	
            	if (usuario.equals(User[k]) && contrase�a == (Pass[k])) {	
    			
            		banderin = true;
            		
            	}
                        
            }	
            
          //Imprimimos por pantalla el resultado de todo
            
            if (banderin == true) {
            			
            		System.out.println("Su login es correcto. Bienvenido");             			                      
            
            System.out.println("");
			System.out.println("Disculpe, por seguridad, debera actualizar su contrase�a");	
						
			System.out.println("");
			System.out.println("Digite su nueva contrase�a de 4 numeros, por favor");
			
			System.out.println ("Ingrese una contrase�a: ");		
	        int contrase�anueva = Leer.nextInt();	        	       
	        
	        System.out.println("");
	        System.out.println("Su contrase�a ha sido cambiada.");	        	       	
        
	        System.out.println("Debera loguearse nuevamente");
	        System.out.println("");		 	       
	        
	        String usuarioAceptado []= new String [4];
	        usuarioAceptado [0] = "Enzo";
	        usuarioAceptado [1] = "Facundo";
	        usuarioAceptado [2] = "Osvaldo";
	        usuarioAceptado [3] = "Daniela";
	        int contrase�aAceptada = contrase�anueva;
	        
	        System.out.println ("Ingrese un Usuario: ");		
	        String usuario1 = Leer.next();		
			
	        System.out.println ("Ingrese una contrase�a: ");		
	        int contrase�a1 = Leer.nextInt();		 	       
	       	        
	        boolean perro = false;
	        
	        for (k=0; k<User.length; k++) {
	        
	        	if (usuario1.equals(usuarioAceptado[k]) && contrase�a1 == (contrase�aAceptada)) {
				
	        		perro = true;
	        	}
	        }	        	        		
        			
				if (perro == true) {
    			
    			System.out.println("Su login es correcto. Bienvenido nuevamente " + "" + usuario1); 
    			            			
    			} else {
            				
            		System.out.println("Login incorrecto. Pruebe nuevamente");
            			           				
            }
    		            
	}
	}
}
	
