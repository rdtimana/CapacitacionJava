package Matrices;

import java.util.Scanner;

public class Matriz {

	private Scanner teclado;
	private String[][] empleados;
	
	/**
	 * Constructor de la clase
	 */
	public Matriz() {
		teclado = new Scanner(System.in);
		empleados=new String[3][5];
		for (int c = 0; c < 5; c++) {
			System.out.println("Digite el nombre del empleado: ");
			empleados[1][c]=teclado.next();		
			System.out.println("Digite el tipo de contrato del empleado: ");
			empleados[2][c]=teclado.next();		
			System.out.println("Digite el salario del empleado: ");
			empleados[0][c]=String.valueOf(teclado.nextInt());
		}
	}

	public void imprimir() {
		for(int c=0;c<5;c++) { 
			for(int f=0;f<3;f++) {
	                System.out.print(empleados[f][c]+" ");
	            }
	            System.out.println();
		 }
	}


	public static void main(String[] args) {
		Matriz ma=new Matriz();
        ma.imprimir();

	}

}
