package queries;

public class OTDaoconsulta {
	
	private int numeroot;
	private String fecha_actividad;
	private int valor;
	private int pago;
	private String statusactividad;
	private String nombrecliente;
	private String nombreprof;
	private String descripcion;
	
	
	
	public OTDaoconsulta() {
	}

	public OTDaoconsulta(int numeroot, String fecha_actividad, int valor, int pago, String statusactividad,
			String nombrecliente, String nombreprof, String descripcion) {
	
		this.numeroot = numeroot;
		this.fecha_actividad = fecha_actividad;
		this.valor = valor;
		this.pago = pago;
		this.statusactividad = statusactividad;
		this.nombrecliente = nombrecliente;
		this.nombreprof = nombreprof;
		this.descripcion = descripcion;
	}

	public int getNumeroot() {
		return numeroot;
	}

	public void setNumeroot(int numeroot) {
		this.numeroot = numeroot;
	}

	public String getFecha_actividad() {
		return fecha_actividad;
	}

	public void setFecha_actividad(String fecha_actividad) {
		this.fecha_actividad = fecha_actividad;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPago() {
		return pago;
	}

	public void setPago(int pago) {
		this.pago = pago;
	}

	public String getStatusactividad() {
		return statusactividad;
	}

	public void setStatusactividad(String statusactividad) {
		this.statusactividad = statusactividad;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getNombreprof() {
		return nombreprof;
	}

	public void setNombreprof(String nombreprof) {
		this.nombreprof = nombreprof;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
