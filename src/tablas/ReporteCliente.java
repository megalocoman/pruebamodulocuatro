package tablas;

public class ReporteCliente {

	private String nombrecliente;
	private int numeroactividades;
	private int valortotal;
	private int valorpagado;
	private int naccidentes;
	
	public ReporteCliente() {
		
	}

	public ReporteCliente(String nombrecliente, int numeroactividades, int valortotal, int valorpagado,
			int naccidentes) {
		
		this.nombrecliente = nombrecliente;
		this.numeroactividades = numeroactividades;
		this.valortotal = valortotal;
		this.valorpagado = valorpagado;
		this.naccidentes = naccidentes;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public int getNumeroactividades() {
		return numeroactividades;
	}

	public void setNumeroactividades(int numeroactividades) {
		this.numeroactividades = numeroactividades;
	}

	public int getValortotal() {
		return valortotal;
	}

	public void setValortotal(int valortotal) {
		this.valortotal = valortotal;
	}

	public int getValorpagado() {
		return valorpagado;
	}

	public void setValorpagado(int valorpagado) {
		this.valorpagado = valorpagado;
	}

	public int getNaccidentes() {
		return naccidentes;
	}

	public void setNaccidentes(int naccidentes) {
		this.naccidentes = naccidentes;
	}

	@Override
	public String toString() {
		return "ReporteCliente [nombrecliente=" + nombrecliente + ", numeroactividades=" + numeroactividades
				+ ", valortotal=" + valortotal + ", valorpagado=" + valorpagado + ", naccidentes=" + naccidentes + "]";
	}
		
}
