package clinica_veterinaria;

public class Dueno {
private String nombre;
private String apellido;
private String telefono;
private String email;
private String cedula ;

public Dueno(String nombre, String apellido, String telefono, String email, String cedula) {
	 super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.telefono = telefono;
	this.email = email;
	this.cedula = cedula;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
    this.nombre = (nombre == null || nombre.trim().isEmpty()) ? "Desconocido" : nombre.trim();
}

public String getApellido() {
	
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = (apellido == null || apellido.trim().isEmpty()) ? "Desconocido" : apellido.trim();
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	boolean valido = telefono != null && telefono.matches("\\d{10}");
    this.telefono = valido ? telefono : "0000000000";
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
    boolean valido = email != null && email.contains("@") && email.indexOf('.') > email.indexOf('@');
    this.email = valido ? email : "sin@email.com";
}

public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
    this.cedula = (cedula == null || cedula.trim().isEmpty()) ? "0000000000" : cedula.trim();
}

@Override
public String toString() {
	return "Dueno [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email
			+ ", cedula=" + cedula + "]";
}

public String getNombreCompleto() {
	return nombre+" "+apellido;
}

public boolean tieneEmailValido() {
    return email != null && email.contains("@") && email.indexOf('.') > email.indexOf('@');
}

}
