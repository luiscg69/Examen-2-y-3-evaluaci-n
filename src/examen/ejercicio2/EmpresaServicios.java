package examen.ejercicio2;

public class EmpresaServicios extends Empresa implements Pagable {

	private String tipoServicio;
	private int importeMensual;
	private String numeroCuenta;
	
	public EmpresaServicios(String nombre, String tipoServicio, int importeMensual, String numeroCuenta) {
		super(nombre);
		this.tipoServicio=tipoServicio;
		setImporteMensual(importeMensual);
		this.numeroCuenta=numeroCuenta;
	}
	
	public String getTipoServicio() {
		return tipoServicio;
	}
	
	public int getImporteMensual() {
		return importeMensual;
	}
	
	public void setImporteMensual(int importeMensual) {
		if(importeMensual<0) throw new ImporteMensualException();
		this.importeMensual = importeMensual;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public String toString() {
		return super.toString()+" Tipo Servicio: "+getTipoServicio()+" Importe Mensual: "+getImporteMensual()+" Cuenta:"+getNumeroCuenta();
	}
	
	public Pago paga() {
		return new Pago(getNumeroCuenta(), getImporteMensual(), "Servicio", this.toString());
	}
}
