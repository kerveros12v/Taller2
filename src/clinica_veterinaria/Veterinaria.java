package clinica_veterinaria;

public class Veterinaria {
	private String nombre;
	private String apellido;
	private String matricula;
	private String especialidad;
	private int aniosExperiencia;
	///////////////
	//CONSTRUCTOR//
	///////////////
	public Veterinaria(String nombre, String apellido, String matricula, int aniosExperiencia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricula;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	////////////
	//METODOS//
	///////////
	public String getNombreCompleto() {
		return nombre+" "+apellido;
	}
	
	public boolean esEspecialista() {
		return aniosExperiencia>=5;
	}
	
	////////////////////
	//SET MODIFICADOS//
	///////////////////
	public void setNombre(String nombre) {
		if(nombre == null || nombre.isBlank() ) {
			this.nombre = "Desconocido";
		}else {
			this.nombre = nombre;
		}
	}
	public void setApellido(String apellido) {
		if(apellido == null || apellido.isBlank() ) {
			this.apellido = "Desconocido";
		}else {
			this.apellido = apellido;
		}
	}
	public void setMatricula(String matricula) {
		if(matricula == null || matricula.isBlank() ) {
			this.matricula = "SIN-MATRICULA";
		}else {
			this.matricula = matricula;
		}
	}
	public void setEspecialidad(String especialidad) {
		if(especialidad == null || especialidad.isBlank()) {
			this.especialidad = "General";
		}else {
			this.especialidad = especialidad;
		}
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		if(aniosExperiencia<0) {
			this.aniosExperiencia = 0;
		}else {
			this.aniosExperiencia = aniosExperiencia;
		}
	}

	////////
	//GET//
	///////
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	
	////////////
	//TOSTRING//
	///////////
	@Override
	public String toString() {
		return "Veterinaria [nombre=" + nombre + ", apellido=" + apellido + ", matricula=" + matricula
				+ ", aniosExperiencia=" + aniosExperiencia + "]";
	}
}
