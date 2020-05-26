package examen.ejercicio2;

import java.util.ArrayList;

public class SociedadAnonima extends Empresa {

	private ArrayList<String> trabajos;
	
	public SociedadAnonima(String nombre) {
		super(nombre);
	}

	public ArrayList<String> getTrabajos() {
		return trabajos;
	}
	
	public void setTrabajos(ArrayList<String> trabajos) {
		this.trabajos = trabajos;
	}
	
	public String toString() {
		return super.toString()+" Trabajos: "+trabajos.toString();
	}
	
}
