package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTest {

	Scanner teclado;
	static String tipoIdentificacion;
	static int numeroIdentificacion;
	static String nombreCompleto;
	static int edad;
	
	public void capturarDatos() {
		teclado = new Scanner(System.in);
		System.out.println("Digite su tipo de identificación: ");
		tipoIdentificacion = teclado.next();
		System.out.println("Digite su numero de identificación: ");
		numeroIdentificacion = teclado.nextInt();
		System.out.println("Digite su nombre completo: ");
		nombreCompleto = teclado.next();
		System.out.println("Digite su edad");
		edad = teclado.nextInt();

	}
	
	public static void main(String[] args) {
		//ArrayList<Integer> al = new ArrayList();
		/*
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mauricio");
		al.add("Juan");
		al.add(1, "Lina");
		al.add("Pedro");
		//Imprimir el arrayList
		System.out.println("Dato: "+al);
		for (String nombres : al) {
			System.out.println("Dato: "+nombres);
		}
		System.out.println("Valor en la posición 2: "+al.get(2));
        al.set(2, "Juan Luis");
        System.out.println("Dato: "+al);
        //al.sort(null);
        //Collections.sort(al);
        for (String nombres : al) {
			System.out.println("Dato: "+nombres);
		}
        */
		/*
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(21);
		al.add(11);
		al.add(1);
		Collections.sort(al);
		for (Integer edades : al) {
			System.out.println("Edades: "+edades);
		}
		*/
		/*
		String tipoIdentificacion;
		int numeroIdentificacion;
		String nombreCompleto;
		int edad;
		*/
		
		ArrayListTest art = new ArrayListTest();
		String datos = DatosPersona.prueba;
		ArrayList<DatosPersona> ald = new ArrayList<DatosPersona>();
		for (int i = 0; i < 2; i++) {
			//art.capturarDatos();
			DatosPersona dp = new DatosPersona();
			//DatosPersona dp = new DatosPersona(tipoIdentificacion, numeroIdentificacion, nombreCompleto, edad);
			ald.add(dp);
		}
		/*
		for (int i = 0; i < ald.size(); i++) {
			System.out.println("Tipo de Identificación: "+ald.get(i).getTipoIdentificacion());			
			System.out.println("Numero Identificación: "+ald.get(i).getNumeroIdentificacion());
			System.out.println("Nombre Completo: "+ald.get(i).getNombreCompleto());
			System.out.println("Edad: "+ald.get(i).getEdad());
			
		}*/
		for (DatosPersona dPI : ald) {
			System.out.println("Tipo de Identificación: "+dPI.getTipoIdentificacion());
			System.out.println("Numero de Identificación: "+dPI.getNumeroIdentificacion());
		}
		

	}

}
