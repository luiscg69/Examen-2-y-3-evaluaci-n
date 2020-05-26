package examen.ejercicio1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Ejercicio1 {
	public static final String SEPARADOR_COMPUESTO=":";
	public static final String SEPARADOR_ELEMENTO=" ";
	
	protected HashMap<String, ArrayList<String>> compuestos=null;
	
	public Ejercicio1() {
	}
	
	protected void leeCompuestos(String fichero) throws Exception {
		compuestos=new HashMap<String, ArrayList<String>>();
		StringTokenizer stk1=null;
		StringTokenizer stk2=null;
		String compuesto=null;
		ArrayList<String> elementos=null;
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(fichero)));
		String linea=reader.readLine();
		while(linea!=null) {
			elementos=new ArrayList<String>();
			
			stk1=new StringTokenizer(linea, SEPARADOR_COMPUESTO);
			if(stk1.hasMoreElements()) compuesto=stk1.nextToken();
			else throw new Exception ("Error leyendo compuesto");
			
			if(stk1.hasMoreElements()) stk2=new StringTokenizer(stk1.nextToken(), SEPARADOR_ELEMENTO);
			else throw new Exception ("Error leyendo elementos");
			
			while(stk2.hasMoreElements()) elementos.add(stk2.nextToken());
			
			compuestos.put(compuesto, elementos);
			
			linea=reader.readLine();
		}
		
		reader.close();
		
	}
	
	protected void escribeCompuestos() throws Exception {
		System.out.println("Compuestos, forma de iterar 1");
		System.out.println("-----------------------------");
		
		Iterator<String> iterador=compuestos.keySet().iterator();
		while(iterador.hasNext()) escribeCompuesto(iterador.next());
		System.out.println();
	
		System.out.println("Compuestos, forma de iterar 2");
		System.out.println("-----------------------------");

		String[] idCompuestos=compuestos.keySet().toArray(new String[compuestos.size()]);
		for(String idCompuesto : idCompuestos) escribeCompuesto(idCompuesto);
		
		System.out.println("Compuestos, forma de iterar 3");
		System.out.println("-----------------------------");

		for(int f=0;f<idCompuestos.length;f++) escribeCompuesto(idCompuestos[f]);
	}
	
	private void escribeCompuesto(String idCompuesto) throws Exception {
		System.out.print(idCompuesto+":");
		for(String elemento : compuestos.get(idCompuesto))
			System.out.print(" "+elemento);
		System.out.println();
	}
	
	protected void escribeElementos() throws Exception {
		System.out.println("Elementos");
		System.out.println("---------");
		
		ArrayList<String> listaElementos=new ArrayList<String>();
		
		for(ArrayList<String> compuesto : compuestos.values())
			for(String elemento : compuesto)
				if(!listaElementos.contains(elemento)) listaElementos.add(elemento);
		
		for(String elemento : listaElementos)
			System.out.println(elemento);
		
		
	}
	
	public static void main(String[] args) {
		try {
			Ejercicio1 ejercicio=new Ejercicio1();
			ejercicio.leeCompuestos("ejercicio1.txt");
			ejercicio.escribeCompuestos();
			ejercicio.escribeElementos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
