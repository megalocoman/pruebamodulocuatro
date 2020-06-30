package tablas;

public class ReporteProfesional {

	private String profesional;
	private int ncliente;
	private int nactividades;
	private int valortotal;
	private int totalpagado;
	
	public ReporteProfesional() {

	}

	public ReporteProfesional(String profesional, int ncliente, int nactividades, int valortotal, int totalpagado) {
		
		this.profesional = profesional;
		this.ncliente = ncliente;
		this.nactividades = nactividades;
		this.valortotal = valortotal;
		this.totalpagado = totalpagado;
	}

	public String getProfesional() {
		return profesional;
	}

	public void setProfesional(String profesional) {
		this.profesional = profesional;
	}

	public int getNcliente() {
		return ncliente;
	}

	public void setNcliente(int ncliente) {
		this.ncliente = ncliente;
	}

	public int getNactividades() {
		return nactividades;
	}

	public void setNactividades(int nactividades) {
		this.nactividades = nactividades;
	}

	public int getValortotal() {
		return valortotal;
	}

	public void setValortotal(int valortotal) {
		this.valortotal = valortotal;
	}

	public int getTotalpagado() {
		return totalpagado;
	}

	public void setTotalpagado(int totalpagado) {
		this.totalpagado = totalpagado;
	}

	@Override
	public String toString() {
		return "ReporteProfesional [profesional=" + profesional + ", ncliente=" + ncliente + ", nactividades="
				+ nactividades + ", valortotal=" + valortotal + ", totalpagado=" + totalpagado + "]";
	}
		
}
