package examen.ejercicio2;

import java.util.Date;

public class Asalariado extends Empleado {

	private String departamento;
	
	public Asalariado(String nombre, String apellido, Date fechaContratacion, int salario, String numeroCuenta, String departamento) {
		super(nombre, apellido, fechaContratacion, salario, numeroCuenta);
		this.departamento=departamento; //No se indica en el enunciado, entiendo que se puede leer y cambiar
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String toString() {
		return super.toString()+" Departamento: "+getDepartamento();
	}
	
}
