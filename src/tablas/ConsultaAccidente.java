package tablas;

public class ConsultaAccidente {

	private int id;
	private String nombrecliente; 
	private String descripsion;
	private String fechaacc;
	private String rutcliente;
	
	public ConsultaAccidente() {
	}

	public ConsultaAccidente(int id, String nombrecliente, String descripsion, String fechaacc, String rutcliente) {
		this.id = id;
		this.nombrecliente = nombrecliente;
		this.descripsion = descripsion;
		this.fechaacc = fechaacc;
		this.rutcliente = rutcliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getDescripsion() {
		return descripsion;
	}

	public void setDescripsion(String descripsion) {
		this.descripsion = descripsion;
	}

	public String getFechaacc() {
		return fechaacc;
	}

	public void setFechaacc(String fechaacc) {
		this.fechaacc = fechaacc;
	}
	
	public String getRutcliente() {
		return rutcliente;
	}

	public void setRutcliente(String rutcliente) {
		this.rutcliente = rutcliente;
	}

	@Override
	public String toString() {
		return "ConsultaAccidente [id=" + id + ", nombrecliente=" + nombrecliente + ", descripsion=" + descripsion
				+ ", fechaacc=" + fechaacc + "]";
	}	
}
