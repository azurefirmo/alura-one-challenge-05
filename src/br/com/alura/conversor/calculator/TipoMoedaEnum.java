package br.com.alura.conversor.calculator;

/**
 * 
 * Enum responsável por armazenar as siglas das moedas utilizadas no conversor.
 * 
 * @author Firmo Lopes
 *
 */
public enum TipoMoedaEnum {
	REAL("BRL"), DOLAR_AMERICANO("USD"), LIBRAS_ESTERLINAS("GBP"), PESO_ARGENTINO("ARS"), PESO_CHILENO("ARS"),
	EURO("EUR");

	private String tipo;

	TipoMoedaEnum(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}