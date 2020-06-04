package ArrayList;

import java.util.Scanner;

/**
 * Clase para almacenar la informaci�n de la persona
 * 
 * @author josemauricio
 * @since 06/02/2020
 * @version 1
 *
 */
public class DatosPersona {
	Scanner teclado;
	String tipoIdentificacion;
	int numeroIdentificacion;
	String nombreCompleto;
	int edad;
	static String prueba;
	
	
	/**
	 * @param tipoIdentificacion
	 * @param numeroIdentificacion
	 * @param nombreCompleto
	 * @param edad
	 */
	public DatosPersona(String tipoIdentificacion, int numeroIdentificacion, String nombreCompleto, int edad) {
		//super();
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombreCompleto = nombreCompleto;
		this.edad = edad;
	}
	/**
	 * Constructor de la clase 
	 */
	public DatosPersona() {
		teclado = new Scanner(System.in);
		System.out.println("Digite su tipo de identificaci�n: ");
		this.tipoIdentificacion = teclado.next();
		System.out.println("Digite su numero de identificaci�n: ");
		this.numeroIdentificacion = teclado.nextInt();
		System.out.println("Digite su nombre completo: ");
		this.nombreCompleto = teclado.next();
		System.out.println("Digite su edad");
		this.edad = teclado.nextInt();
	}
	
	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
