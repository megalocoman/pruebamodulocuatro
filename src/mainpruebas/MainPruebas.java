package mainpruebas;

import java.util.Objects;

import tablas.Accidente;

public class MainPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accidente acc = new Accidente();

		String stequery = "null";
		
		acc.setClienterutcliente("1");
		acc.setDescripcion("muerte en horno");
		acc.setFechaaccidente("12-12-12");
		acc.setIdaccidente(2);
		
		if (!(Objects.isNull(acc.getDescripcion()))) {
			stequery +=  " , descripcion= '" + acc.getDescripcion() + "' ";
		}
		if (!(Objects.isNull(acc.getFechaaccidente()))) {
			stequery += " , fechaaccidente = " + acc.getFechaaccidente();
		}
		if (!(Objects.isNull(acc.getClienterutcliente()))) {
			stequery += " , clienterutcliente = " + (acc.getClienterutcliente());
		}
		
		System.out.println("UPDATE accidente SET "+stequery.replace("null ,", "")+ " WHERE = "+acc.getIdaccidente());
	}

}
