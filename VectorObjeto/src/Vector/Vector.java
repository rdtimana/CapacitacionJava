package Vector;

import java.util.Scanner;

public class Vector {
	private Scanner teclado;
	private int[] sueldos; // definición de objeto tipo vector
	private DatosEmpleado[] empleados;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		sueldos = new int[2]; // Instanciar el objeto tipo vector, y le da un tamaño al objeto
		empleados = new DatosEmpleado[5];
		for (int f = 0; f < sueldos.length; f++) {
			DatosEmpleado de = new DatosEmpleado();
			empleados[f]= de;
		}
	}

	public void imprimir() {
		for (int f = 0; f < empleados.length; f++) {
			System.out.println(empleados[f].getNombreEmpleado());
			System.out.println(empleados[f].getSalario());
		}
	}

	
	public static void main(String[] args) {
		Vector pv = new Vector();
		pv.cargar();
		pv.imprimir();
	}
	
	
	
}
