package Abstractas;

public abstract class Animal {

	// Atributos 
	String nombre;

	// Constructor 
	public Animal(String nombre) { 
		this.nombre = nombre; };

	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	
	//Métodos abstractos 
	abstract void sonido(); 
	abstract void comer(); 
	abstract String saludar();

	void prueba(String nombre) {
		System.out.println("Esto es una prueba"+nombre);
	}
}
