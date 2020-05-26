package examen.ejercicio2;

public abstract class Empresa extends Entidad {

	public Empresa(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		return "Empresa: "+super.toString();
	}


}
