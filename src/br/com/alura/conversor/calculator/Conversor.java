package br.com.alura.conversor.calculator;

import br.com.alura.conversor.api.*;

/**
 * 
 * @author Firmo Lopes
 * @version 1.0
 *
 */
public class Conversor {

	/**
	 * Esta função converte um tipo de moeda para outra, através do tipo de
	 * conversão repassado para ela.
	 * 
	 * @param TipoConversaoSelecionada tipo selecionado através do Enum
	 *                                 TipoDeConversao. <br>
	 * @param valor                    dado referente à quantia a ser convertida.
	 * @return Retorna uma String com o símbolo da moeda e o valor da conversão,
	 *         ex.: "R$ 25.67."
	 */
	public String converterMoeda(TipoConversaoEnum TipoConversaoSelecionada, double valor) {

		Api conversor = new Api();
		double valorConvertido;

		switch (TipoConversaoSelecionada) {
		case REAIS_A_DOLAR: {
			valorConvertido = conversor.converterMoeda(TipoMoedaEnum.REAL, TipoMoedaEnum.DOLAR_AMERICANO, valor);
			return "$ " + valorConvertido;
		}

		case REAIS_A_LIVRAS_ESTERLINAS: {
			valorConvertido = conversor.converterMoeda(TipoMoedaEnum.REAL, TipoMoedaEnum.LIBRAS_ESTERLINAS, valor);
			return "£ " + valorConvertido;
		}

		case REAIS_A_PESO_ARGENTINO: {
			valorConvertido = conversor.converterMoeda(TipoMoedaEnum.REAL, TipoMoedaEnum.PESO_ARGENTINO, valor);
			return "$ " + valorConvertido;
		}

		case REAIS_A_PESO_CHILENO: {
			valorConvertido = conversor.converterMoeda(TipoMoedaEnum.REAL, TipoMoedaEnum.PESO_CHILENO, valor);
			return "$ " + valorConvertido;
		}
		case REAIS_A_EURO: {
			valorConvertido = conversor.converterMoeda(TipoMoedaEnum.REAL, TipoMoedaEnum.EURO, valor);
			return "€ " + valorConvertido;
		}
		case DOLAR_A_REAIS: {
			valorConvertido = conversor.converterMoeda(TipoMoedaEnum.DOLAR_AMERICANO, TipoMoedaEnum.REAL, valor);
			return "R$ " + valorConvertido;
		}

		case EURO_A_REAIS: {
			valorConvertido = conversor.converterMoeda(TipoMoedaEnum.EURO, TipoMoedaEnum.REAL, valor);
			return "R$ " + valorConvertido;
		}
		case LIVRAS_ESTERLINAS_A_REAIS: {
			valorConvertido = conversor.converterMoeda(TipoMoedaEnum.LIBRAS_ESTERLINAS, TipoMoedaEnum.REAL, valor);
			return "R$ " + valorConvertido;
		}
		case PESO_ARGENTINO_A_REAIS: {
			valorConvertido = conversor.converterMoeda(TipoMoedaEnum.PESO_ARGENTINO, TipoMoedaEnum.REAL, valor);
			return "R$ " + valorConvertido;
		}
		case PESO_CHILENO_A_REAIS: {
			valorConvertido = conversor.converterMoeda(TipoMoedaEnum.PESO_CHILENO, TipoMoedaEnum.REAL, valor);
			return "R$ " + valorConvertido;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + TipoConversaoSelecionada);
		}
	}

	/**
	 * Função faz conversões entre CELSIUS(°C), Kelvin(°K) e Fahrenheit(°F).
	 * 
	 * @param tipo  tipo de conversão de temperatura presente no Enum
	 *              {@link TipoConversaoTemperatura}.
	 * @param valor valor da temperatura a aser convertido
	 * @return valor da temperatura em string com seu símbolo específico ex: "36,5
	 *         °C"
	 */
	public String ConverteTemperatura(TipoConversaoTemperatura tipo, double valor) {

		switch (tipo) {
		case CELSIUS_A_FAHRENHEIT: {
			double fahrenheit = (valor * 1.8) + 32;
			return fahrenheit + " °F";
		}
		case CELSIUS_A_KELVIN: {
			double kelvin = valor + 273;
			return kelvin + " °K";
		}
		case FAHRENHEIT_A_CELSIUS: {
			double CELSIUS = (valor - 32) / 1.8;
			return CELSIUS + " °C";
		}
		case FAHRENHEIT_A_KELVIN: {
			double kelvin = ((valor - 32) / 1.8) + 273;
			return kelvin + " °K";
		}
		case KELVIN_A_CELSIUS: {
			double CELSIUS = valor - 273;
			return CELSIUS + " °C";
		}
		case KELVIN_A_FAHRENHEIT: {
			double fahrenheit = ((valor - 273) * 1.8) + 32;
			return fahrenheit + " °F";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
	}

}