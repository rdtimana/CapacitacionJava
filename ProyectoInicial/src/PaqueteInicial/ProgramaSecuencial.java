package PaqueteInicial;

import java.util.Scanner;

public class ProgramaSecuencial {

	public static void main(String[] args) {
		// Importar libreria
		/*
		 * teclado es un objeto de tipo Scanner Donde Scanner es una libreria que me
		 * permite capturar la información que digite por consola y llevarla a variables
		 * o constantes
		 */
		// Scanner teclado; //Crea un objeto de tipo Scanner con el nombre teclado
		// teclado = new Scanner(System.in); //Instancia un objeto de Scanner

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in); // Instancia un objeto de Scanner

		// Variables
		/*
		 * int a = 0, b = 0, suma =0, resta = 0;
		 * System.out.println("Digite el valor de a"); a = teclado.nextInt();
		 * System.out.println("Digite el valor de b"); b = teclado.nextInt();
		 */
		/*
		 * Secuencial suma = a + b;
		 * System.out.println("El resultado de la suma de a:"+a+" + "+" b:"+b+" = "+suma
		 * ); resta = a - b;
		 * System.out.println("El resultado de la resta de a:"+a+" - "+" b:"+b+" = "
		 * +resta);
		 */

		// Estructura condicional simple
		/*
		 * if (a>b) { suma = a + b;
		 * System.out.println("El resultado de la suma de a:"+a+" + "+" b:"+b+" = "+suma
		 * ); }
		 */
		// Estructura condicional compuesta 1
		/*
		 * if (a>b) { suma = a + b;
		 * System.out.println("El resultado de la suma de a:"+a+" + "+" b:"+b+" = "+suma
		 * ); } else { resta = a - b;
		 * System.out.println("El resultado de la resta de a:"+a+" - "+" b:"+b+" = "
		 * +resta); }
		 */
		// Estructura condicional compuesta 2
		/*
		 * if (a>b) { suma = a + b;
		 * System.out.println("El resultado de la suma de a:"+a+" + "+" b:"+b+" = "+suma
		 * ); } else { if (a<b) { resta = a - b;
		 * System.out.println("El resultado de la resta de a:"+a+" - "+" b:"+b+" = "
		 * +resta);
		 * 
		 * } else { System.out.println("Los valores son iguales"); } }
		 */
		// Estructura repetitiva while
		/*
		 * int x = 1; //System.out.print(x+"|"); while (x <=10) {
		 * System.out.print(x+"|"); x=x+1; }
		 */
		// Estructura repetitiva for
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "|");
		}

	}

}
