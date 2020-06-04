package Abstractas;

public class oveja extends Animal {

	//Atributos
	int patas;
	
	//Get & Set
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	
	/**
	 * Constructor de la clase
	 * @param nombre
	 * @param patas
	 */
	public oveja(String nombre, int patas) {
		super(nombre);
		this.patas = patas;
	}

	//Metodos implementados de la clase abstracta Animal
	@Override
	void sonido() {
		System.out.println("Beeeeee");
	}

	@Override
	void comer() {
		System.out.println("Comer Pasto");
	}

	@Override
	String saludar() {
		return "Hola soy "+this.nombre+" y tengo "+this.patas+" patas";
	}
	
	
	@Override
	void prueba(String nombre) {
		System.out.println("Prueba 2"+nombre);
	}
	

	void pruebaOveja() {
		System.out.println("Prueba 2");
	}
}
