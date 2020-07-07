package vectoresbasicos;

import java.util.Arrays;

public class LibretaBasica {
		
	String nombres[] = new String[10];
	
	public void agregarAlibreta(String nom, int lugar) {
		
		this.nombres[lugar] = nom;			
				
	//creo bucle for para recorrer el array
			for(int i=0; i<nombres.length; i++) {
				
				//si es igual pasa a este if donde comprueba la posicion 
						if (nombres[i] == null) {
							
							//y si es igual no la imprime
							nombres[i]="";
						}
			}
	}	
			public boolean corroborarNombre(String nombrenuevo) {									
				
				// TODO Auto-generated method stub
			//Hacemos la comprobación en el vector por el usuario   
            boolean bandera = false;
            
            for (int i=0; i<nombres.length; i++) {
            	            	 
				//si es igual pasa a este if donde comprueba la posicion 
					if (nombrenuevo.equals(nombres[i])) {
						
						bandera = true;       	
					}	
			}
            	
            if (bandera == true) {
            			
            			System.out.println("LO SIENTO. USUARIO YA REGISTRADO"); 
            			System.out.println("................................");
            			
            			} 
            return bandera;
			}
	      	 
	      	
	public void nombreAremover(String nombreaeliminar) {
		// TODO Auto-generated method stub
		
			for(int i=0; i<10; i++) {
			
				if(nombres[i].equals(nombreaeliminar)) {
				
					nombres[i] = "Nombre Eliminado";
			}
		}	
	
	}
	
	public void posicionAremover(int posicionaeliminar) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<nombres.length; i++) {
			
			//este bucle comienza en 0 y lo va a repetir 10 veces
			for(int j1=0; j1<nombres.length-1; j1++) {
				
				//este condicional es para comprobar si i es igual a j o distinto
				if(j1 == posicionaeliminar) {
					
					//y si es igual no la imprime
						nombres[j1] = "Posición eliminada";
					
				}
			}		
		
		}
	}
	public void listarLibreta() {

		for(int i=0;i<nombres.length;i++) {
							
			System.out.println("Vector " + i + " se ubica en la posición " + (i+1) + "-->" + nombres[i]);
			
		}
		
		System.out.println("......................................................................");
	}
	


	
	}

