package examen.ejercicio2;

import java.util.ArrayList;
import java.util.Date;

public class Contratista extends Empleado {

	private ArrayList<SociedadAnonima> sociedades;
	
	public Contratista(String nombre, String apellido, Date fechaContratacion, int salario, String numeroCuenta, ArrayList<SociedadAnonima> sociedades) {
		super(nombre, apellido, fechaContratacion, salario, numeroCuenta);
		this.sociedades=sociedades;
	}

	public ArrayList<SociedadAnonima> getSociedades() {
		return sociedades;
	}

	public void setSociedades(ArrayList<SociedadAnonima> sociedades) {
		this.sociedades = sociedades;
	}
	
	public String toString() {
		return super.toString()+" Sociedades: "+sociedades.toString();
	}

}
