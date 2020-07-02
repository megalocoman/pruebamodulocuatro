package tablas;

public class OT {
	
	private int numot;
	private String fecact;
	private int val;
	private int pag;
	private String statact;
	private String rutcli;
	private String rutprof;
	private int codact;
	
	
	public OT() {
		super();
	}


	public OT(String fecact, int val, int pag, String statact,
			String rutcli, String rutprof, int codact) {
		this.fecact = fecact;
		this.val = val;
		this.pag = pag;
		this.statact = statact;
		this.rutcli = rutcli;
		this.rutprof = rutprof;
		this.codact = codact;
	}

	
	public OT(int numot, String fecact, int val, int pag, String statact,
			String rutcli, String rutprof, int codact) {
		this.numot = numot;
		this.fecact = fecact;
		this.val = val;
		this.pag = pag;
		this.statact = statact;
		this.rutcli = rutcli;
		this.rutprof = rutprof;
		this.codact = codact;
	}


	public int getNumot() {
		return numot;
	}


	public void setNumot(int numot) {
		this.numot = numot;
	}


	public String getFecact() {
		return fecact;
	}


	public void setFecact(String fecact) {
		this.fecact = fecact;
	}


	public int getVal() {
		return val;
	}


	public void setVal(int val) {
		this.val = val;
	}


	public int getPag() {
		return pag;
	}


	public void setPag(int pag) {
		this.pag = pag;
	}


	public String getStatact() {
		return statact;
	}


	public void setStatact(String statact) {
		this.statact = statact;
	}


	public String getRutcli() {
		return rutcli;
	}


	public void setRutcli(String rutcli) {
		this.rutcli = rutcli;
	}


	public String getRutprof() {
		return rutprof;
	}


	public void setRutprof(String rutprof) {
		this.rutprof = rutprof;
	}


	public int getCodact() {
		return codact;
	}


	public void setCodact(int codact) {
		this.codact = codact;
	}


	@Override
	public String toString() {
		return "OT [numot=" + numot + ", fecact=" + fecact + ", val=" + val
				+ ", pag=" + pag + ", statact=" + statact + ", rutcli="
				+ rutcli + ", rutprof=" + rutprof + ", codact=" + codact
				+ "]";
	}

}
