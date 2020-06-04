package Clase2;

import java.util.Scanner;

public class Clase2 {

	public static void main(String[] args) {
		//Crear un objeto e instanciarlo
		Scanner capturar = new Scanner(System.in);
		//Mostrar mensaje por pantalla
		System.out.println("Digite su nombre");
		//Capturar en la variable el nombre
		String nombre = capturar.nextLine();
		//Mostrar mensaje de edad por pantalla
		System.out.println("Digite su edad: ");
		//capturar la edad por pantalla
		int edad = capturar.nextInt();
		//Definir la variable mayor con un valor inicial
		String mayor = "Mayor de edad";
		//Condicional para validar si es o no mayo de edad
		if (edad< 18) {
			mayor = "Menor de edad";
		} 		
		//Mostrar el mensaje de bienvenida por pantalla incluyendo el nombre
		System.out.println("Bienvenido(a) "+nombre);
		//Mostrar mensaje de mayoria de edad
		System.out.println("Usted es "+mayor);
		
	}

}
