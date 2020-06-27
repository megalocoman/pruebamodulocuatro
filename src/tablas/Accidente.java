package tablas;

public class Accidente {

	private int idaccidente;
	private String descripcion;
	private String fechaaccidente;
	private String clienterutcliente;
	
	public Accidente() {
		
	}

	public Accidente(int idaccidente, String descripcion, String fechaaccidente, String clienterutcliente) {
		this.idaccidente = idaccidente;
		this.descripcion = descripcion;
		this.fechaaccidente = fechaaccidente;
		this.clienterutcliente = clienterutcliente;
	}

	public int getIdaccidente() {
		return idaccidente;
	}

	public void setIdaccidente(int idaccidente) {
		this.idaccidente = idaccidente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaaccidente() {
		return fechaaccidente;
	}

	public void setFechaaccidente(String fechaaccidente) {
		this.fechaaccidente = fechaaccidente;
	}

	public String getClienterutcliente() {
		return clienterutcliente;
	}

	public void setClienterutcliente(String clienterutcliente) {
		this.clienterutcliente = clienterutcliente;
	}

	@Override
	public String toString() {
		return "Accidente [idaccidente=" + idaccidente + ", descripcion=" + descripcion + ", fechaaccidente="
				+ fechaaccidente + ", clienterutcliente=" + clienterutcliente + "]";
	}
			
}
