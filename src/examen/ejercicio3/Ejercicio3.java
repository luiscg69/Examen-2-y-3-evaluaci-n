package examen.ejercicio3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import examen.ejercicio2.Asalariado;
import examen.ejercicio2.Contratista;
import examen.ejercicio2.Empleado;
import examen.ejercicio2.EmpresaServicios;
import examen.ejercicio2.Entidad;
import examen.ejercicio2.SociedadAnonima;

public class Ejercicio3 {

	public Ejercicio3() {
		
	}
	
	public void prueba() throws Exception {
		ArrayList<Entidad> entidades=new ArrayList<Entidad>();
		
		Asalariado asalariado=new Asalariado(
			"Asalario", "Martinez", new SimpleDateFormat("dd-MM-yyyy").parse("2020-01-02"), 1000, "12345678", "compras"
		);
		entidades.add(asalariado);
		
		ArrayList<SociedadAnonima> sociedades=new ArrayList<SociedadAnonima>();
		sociedades.add(new SociedadAnonima("Domasa SA"));
		Contratista contratista=new Contratista(
			"Contratisto", "Rodriguez", new SimpleDateFormat("dd-MM-yyyy").parse("2019-06-07"), 2000, "77662244", sociedades
		);
		entidades.add(contratista);
		
		entidades.add(new EmpresaServicios("La maceta SL", "Jardinaria", 1300, "7541651"));
		
		for(Entidad entidad : entidades) System.out.println(entidad.toString());
		
		LinkedList<Empleado> empleados=new LinkedList<Empleado>();
		empleados.add(asalariado);
		empleados.add(contratista);
		
		Collections.sort(empleados, new Empleado());
		
		for(Empleado empleado : empleados) System.out.println(empleado.toString());
		
	}
	
	public static void main(String[] args) {
		try {
			new Ejercicio3().prueba();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
