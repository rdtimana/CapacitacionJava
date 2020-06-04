package Herencia;

import java.util.Scanner;

/**
 * Clase para capturar la información para las operaciones
 * 
 * @author josemauricio
 * @since 05/28/2020
 * @version 1
 */
public class Operaciones {
  protected Scanner teclado;
  protected int valor1, valor2, resultado;
  /**
   * Constructor de la clase
   */
  public Operaciones() {
	teclado = new Scanner(System.in);
  }

  public void cargar() {
	  System.out.println("Digite el valor de a:");
	  valor1 = teclado.nextInt();
	  System.out.println("Digite el valor de b:");
	  valor2 = teclado.nextInt();
  }
  
  public void mostrarResultado() {
	  /*
	  Suma s = new Suma();
	  s.sumar();
	  */
	  System.out.println("El resultado es: "+this.resultado);
  }
  
  
  
}
