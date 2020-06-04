package enums;

public enum Estaciones {
	// Estaci�n (orden estaci�n, temperatura promedio)
	PRIMAVERA(1, "18�C"), VERANO(2, "33�C"), OTO�O(3, "15�C"), INVIERNO(4, "3�C");

	private final int codigoEstacion;
	private final String temperaturaMedia;

	/**
	 * Constructor de la clase
	 * 
	 * @param codigoEstacion
	 * @param temperaturaMedia
	 */
	Estaciones(int codigoEstacion, String temperaturaMedia) {
		this.codigoEstacion = codigoEstacion;
		this.temperaturaMedia = temperaturaMedia;
	}

	public int getCodigoEstacion() {
		return codigoEstacion;
	}

	public String getTemperaturaMedia() {
		return temperaturaMedia;
	}

}
