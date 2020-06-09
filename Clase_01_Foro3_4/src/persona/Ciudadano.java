package persona;

public class Ciudadano extends Persona {

	//encapsulo las variables con private
	private String provincia;
	private long dni;
	
	public Ciudadano (String nombre, String apellido, String provincia, long dni) {
		super(nombre, apellido);//llamo a las variables de Persona
		this.provincia = provincia;
		this.dni = dni;
	}
	//Metodo get
	public String getProvincia() {
		//nos devuelve la variable provincia
		return provincia;
	}
			
	public long getdni() {
		//nos devuelve la variable dni
		return dni;
	}		

	public void setProvincia(String provincia) {
		//asigna el valor del parametro a la variable provincia
		this.provincia = provincia;
	}

	public void setdni(long dni) {
		//asigna el valor del parametro a la variable dni
		this.dni = dni;
		
	}
}

