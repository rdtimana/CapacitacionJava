package Vector;

import java.util.Scanner;

public class Vector {
	private Scanner teclado;
	private int[] sueldos; // definición de objeto tipo vector
	private String[] empleados;

	/**
	 * Metodo para cargar datos en el vector El vector se define de 5 posiciones
	 */
	public void cargar() {
		teclado = new Scanner(System.in);
		sueldos = new int[5]; // Instanciar el objeto tipo vector, y le da un tamaño al objeto
		empleados = new String[5];
		for (int f = 0; f < sueldos.length; f++) {
			System.out.println("Ingrese el nombre del empleado");
			empleados[f]=teclado.next();
			System.out.print("Ingrese valor de la componente:");
			sueldos[f] = teclado.nextInt();
		}
	}

	/**
	 * Metodo que imprime la información almacenada en el vector
	 */
	public void imprimir() {
		for (int f = 0; f < sueldos.length; f++) {
			System.out.println("Nombre Empleado: "+empleados[f]);
			System.out.println("Salario: "+sueldos[f]);
		}
	}

	public static void main(String[] args) {
		Vector pv = new Vector();
		pv.cargar();
		pv.imprimir();

	}

}
