package tablas;

public class Profesional {
	
	private String rutprofesional;
	private String nombre;
	private String telefono;
	private String correo;
	
	public Profesional() {
		
	}

	public Profesional(String rutprofesional, String nombre, String telefono, String correo) {
		
		this.rutprofesional = rutprofesional;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}

	public String getRutprofesional() {
		return rutprofesional;
	}

	public void setRutprofesional(String rutprofesional) {
		this.rutprofesional = rutprofesional;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Profesional [rutprofesional=" + rutprofesional + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", correo=" + correo + "]";
	}
		
}
