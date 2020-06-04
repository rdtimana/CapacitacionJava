package Clase2;

import java.util.Scanner;

/**
 * Clase para probar los tipos de metodos
 * 
 * @author josemauricio
 * @since 05/26/2020
 * @version 1
 * 
 */
public class TiposMetodos {
	// Variables locales
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	/**
	 * Metodo para inicializar la información para la clase
	 */
	/*
	 * public void inicializar() { teclado = new Scanner(System.in);
	 * System.out.println("Digite su nombre"); nombre = teclado.nextLine();
	 * System.out.println("Digite su edad: "); edad = teclado.nextInt(); }
	 */

	/**
	 * Constructor de la clase
	 */
	public TiposMetodos() {
		teclado = new Scanner(System.in);
		System.out.println("Digite su nombre"); 
		this.nombre = teclado.nextLine();
		System.out.println("Digite su edad: "); 
	    this.edad = teclado.nextInt(); 
	    
	}

	/**
	 * Metodo para validar si la persona es mayor de edad o no
	 * 
	 * @return mayor
	 */
	public String mayorEdad() {
		String mayor = "Mayor de edad";
		if (edad < 18) {
			mayor = "Menor de edad";
		}
		return mayor;
	}

	/**
	 * Metodo para imprimir los datos del programa
	 * 
	 * @param mayorEdad
	 */
	public void imprimir(String mayorEdad) {
		// Mostrar el mensaje de bienvenida por pantalla incluyendo el nombre
		System.out.println("Bienvenido(a) " + nombre);
		// Mostrar mensaje de mayoria de edad
		System.out.println("Usted es " + mayorEdad);

	}

	public static void main(String[] args) {
		TiposMetodos tm = new TiposMetodos();
		//tm.inicializar();
		String mayorEdad = tm.mayorEdad();
		tm.imprimir(mayorEdad);
	}

}
