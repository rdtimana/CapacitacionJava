package Clase2;

import java.util.Scanner;

public class ClaseMetodos {
	// Definición de Variables Globales
	static int edad;
	static String mayor;
	static String nombre;

	/**
	 * Metodo para calcular si la persona es mayor de edad o menor de edad Metodo
	 * que no retorna parametros (void) Metodo que no recibe parametros mayorEdad()
	 */
	public void mayorEdad() {
		// Condicional para validar si es o no mayo de edad
		if (edad < 18) {
			mayor = "Menor de edad";
		}
	}

	/**
	 * Metodo para imprimir la información que se tiene en memoria de la persona
	 */
	public void imprimir() {
		mayorEdad();
		// Mostrar el mensaje de bienvenida por pantalla incluyendo el nombre
		System.out.println("Bienvenido(a) " + nombre);
		// Mostrar mensaje de mayoria de edad
		System.out.println("Usted es " + mayor);
	}

	public static void main(String[] args) {
		// Instanciar un objeto del tipo de la clase ClaseMetodos
		ClaseMetodos cm = new ClaseMetodos();
		// Crear un objeto e instanciarlo
		Scanner capturar = new Scanner(System.in);
		// Mostrar mensaje por pantalla
		System.out.println("Digite su nombre");
		// Capturar en la variable el nombre
		nombre = capturar.nextLine();
		// Mostrar mensaje de edad por pantalla
		System.out.println("Digite su edad: ");
		// capturar la edad por pantalla
		edad = capturar.nextInt();
		// Definir la variable mayor con un valor inicial
		mayor = "Mayor de edad";
		//cm.mayorEdad();
		cm.imprimir();
		
	}
}
