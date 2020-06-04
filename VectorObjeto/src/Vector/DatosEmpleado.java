package Vector;

import java.util.Scanner;

public class DatosEmpleado {

	Scanner teclado;
	String nombreEmpleado;
	int salario;

	/**
	 * Constructor de la clase
	 */
	public DatosEmpleado() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado");
		nombreEmpleado = teclado.nextLine();
		System.out.print("Ingrese valor del salario del empleado:");
		this.salario = teclado.nextInt();
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

}
