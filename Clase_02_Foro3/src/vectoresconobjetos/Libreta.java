package vectoresconobjetos;

public class Libreta {
	
	int cantidadRegistros;
	String nombres[];

	public Libreta(int cantidadRegistros) {
		//System.out.println("Se ha instanciado una Libreta");
		this.cantidadRegistros = cantidadRegistros;
		nombres = new String[cantidadRegistros];
			
		
	}

	public boolean corroborarNombre(String nombrenuevo) {									
		
		// TODO Auto-generated method stub
	//Hacemos la comprobación en el vector por el usuario   
    boolean bandera = false;
    
    for (int i=0; i<cantidadRegistros; i++) {
    	            	 
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
	public boolean quedaLugar(String nombrenuevo) {
		//System.out.println("--quedaLugar() -->[Libreta]");	
 
		boolean respuesta = false;

		for(int i=0 ; i<this.cantidadRegistros ; i++) {

			if(this.nombres[i] == null) {
				respuesta = true;
								
			}
		}
		
		//System.out.println("<--respuesta "+respuesta+" --[Libreta]");
		return respuesta;
	}
	
	public boolean agregarAlibreta(String nom) {
		//System.out.println("--agregarAlibreta(String nom)-->[Libreta]");
		boolean lugar = this.quedaLugar(nom);
		
		if(lugar) {
			int i = -1;
			do {
				i++;
			}while(nombres[i] != null);	
			this.nombres[i] = nom;				
		}
						
		//System.out.println("<--bool lugar --[Libreta]");		
		return lugar;
	}
	
	public void posicionAremover(int posicionaeliminar) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<cantidadRegistros; i++) {
			
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
	public void nombreAremover(String nombreaeliminar) {
		// TODO Auto-generated method stub
		
			for(int i=0; i<this.cantidadRegistros; i++) {
			
				if(nombres[i].equals(nombreaeliminar)) {
				
					nombres[i] = "Nombre Eliminado";
			}
		}	
	
	}
	public void listarLibreta() {
		//System.out.println("--listarLibreta() -->[Libreta]");
		for(int i=0;i<cantidadRegistros;i++) {
			System.out.println("Valor " + i + " posición " + (i+1) + "-->" + nombres[i]);
		}
	}

	

}



