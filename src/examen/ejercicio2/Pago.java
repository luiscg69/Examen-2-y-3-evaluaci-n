package examen.ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pago {

	public static final String TIPO_EMPLEADO="Empleado";
	public static final String TIPO_EMPRESA="Empresa";
	
	public String numeroCuenta;
	public int importe;
	public String concepto;
	public String informacionEspecifica;
	
	public Pago(String numeroCuenta, int importe, String concepto, String informacionEspecifica) {
		this.numeroCuenta=numeroCuenta;
		this.importe=importe;
		this.concepto=concepto;
		this.informacionEspecifica=informacionEspecifica;
	}
	
	public void efectuaPago() {
		System.out.println("**********************************");
		System.out.println(new SimpleDateFormat("H:m:s dd-MM-yyyy").format(new Date()));
		System.out.println(getInformacionEspecifica());
		System.out.println("Efectuado pago a la cuenta "+getNumeroCuenta()+" por un importe de "+getImporte());
		System.out.println("Concepto: "+getConcepto());
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public int getImporte() {
		return importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public String getInformacionEspecifica() {
		return informacionEspecifica;
	}

}
