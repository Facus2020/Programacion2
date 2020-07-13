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
	
	public String toString() {		
		return super.toString(getNombre(), getApellido()) +" Provincia: " +provincia+ " DNI: " +dni;				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ciudadano alumno1 = new Ciudadano("Facundo", "Mayorga", "Mendoza", 24460919);
		Ciudadano alumno2 = new Ciudadano("Armando", "Bardo", "Lavaie", 45678934);
		Ciudadano alumno3 = new Ciudadano("Esteban", "Quito", "San Luis", 35735918);
		Ciudadano alumno4 = new Ciudadano("Elena", "Nito", "Cordoooooba", 42256341);	
		Ciudadano alumno5 = new Ciudadano("Lola", "Mento", "Santa Rosa", 44710739);
		
		System.out.println(alumno1);
		System.out.println("-------------------------------------------------------------------");
		System.out.println(alumno2);
		System.out.println("-------------------------------------------------------------------");
		System.out.println(alumno3);
		System.out.println("-------------------------------------------------------------------");
		System.out.println(alumno4);
		System.out.println("-------------------------------------------------------------------");
		System.out.println(alumno5);
		System.out.println("-------------------------------------------------------------------");
	}
}


