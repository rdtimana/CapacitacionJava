package Clase2;

import java.util.Scanner;

public class Salario {
	Scanner teclado;
	int salario = 0;
	private int salarioExtra = 0;
	private boolean impuesto = false;
	final int valorExtra = 120000; //Constante
	/**
	 * @param salario
	 */
	public Salario(int salario) {
		this.salario = salario;
	}

	private boolean impuestos() {
		if (salario>=3000000) {
			impuesto = true;
		} 	
		return impuesto;
	}
	
	private void extras(int cantExtras) {
		this.salarioExtra = valorExtra*cantExtras;
	}
	
	public void imprimir() {
		impuestos();
		teclado = new Scanner(System.in);		
		System.out.println("Digite la cantidad de horas extras del empleado:");
		extras(teclado.nextInt());
		System.out.println("El salario de la persona es: "+this.salario);
		if (impuesto) {
			System.out.println("Debe pagar impuestos");	
			System.out.println("Respuesta final");
		}
		else 
			System.out.println("No debe pagar impuestos");
		System.out.println("La cantidad de horas extras es: "+this.salarioExtra);
	}
	
	
}
