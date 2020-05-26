package examen.ejercicio2;

public abstract class Entidad {

	private String nombre;
	
	public Entidad() {}
	
	public Entidad(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return getNombre();
	}
}
