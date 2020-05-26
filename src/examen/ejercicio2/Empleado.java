package examen.ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Empleado extends Entidad implements Pagable, Comparator<Empleado> {

	private String apellido;
	private Date fechaContratacion;
	private int salario;
	private String numeroCuenta;
	
	public Empleado() {};
	
	public Empleado(String nombre, String apellido, Date fechaContratacion, int salario, String numeroCuenta) {
		super(nombre);
		this.apellido=apellido;
		this.fechaContratacion=fechaContratacion;
		setSalario(salario);
		this.numeroCuenta=numeroCuenta;
	}
	
	public String getApellido() {
		return apellido;
	}

	public Date getFechaContratacion() {
		return fechaContratacion;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		if(salario<0) throw new SalarioException();
		this.salario = salario;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public String toString() {
		return "Empleado: "+getNombre()+" "+getApellido()
			+" Contratado el"+new SimpleDateFormat("dd-MM-yyyy").format(getFechaContratacion())
			+" Salario: "+getSalario()
			+" Cuenta: "+getNumeroCuenta();
	}
	
	public Pago paga() {
		return new Pago(getNumeroCuenta(), getSalario(), "Sueldo", this.toString());
	}
	
	public final int compare(Empleado a, Empleado b) {
		String empleadoA=(a.getApellido()+a.getNombre()).replaceAll(" ", "");
		String empleadoB=(b.getApellido()+b.getNombre()).replaceAll(" ", "");
		
		return empleadoA.compareTo(empleadoB);
	}
}
