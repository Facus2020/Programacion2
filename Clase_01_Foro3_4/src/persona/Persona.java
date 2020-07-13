package persona;

public class Persona {

		//encapsulo las variables con private
		private String nombre;
		private String apellido;		
	
		//constructor
		public Persona(String nombre, String apellido) {
			this.nombre = nombre;
			this.apellido = apellido;

		}
				
		public String toString(String nombre, String apellido) {
			
			return ("Nombre: " + nombre+ " Apellido: " +apellido);
		}
	
		//Metodo get
		public String getNombre() {
		//nos devuelve la variable nombre
			return nombre;
		}
			
		public String getApellido() {
			//nos devuelve la variable apellido
			return apellido;
		}		

		public void setNombre(String nombre) {
			//asigna el valor del parametro a la variable nombre
			this.nombre = nombre;
		}

		public void setApellido(String apellido) {
			//asigna el valor del parametro a la variable apellido
			this.apellido = apellido;
		}
	
	}
